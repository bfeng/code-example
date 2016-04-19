package io.github.bfeng.leetcode;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by bfeng on 4/17/16.
 */
public abstract class GeneralTestSuite {

    private static final String INPUT_PREFIX = "input-";

    private static final String EXPECTED_PREFIX = "expected-";

    private List<SolutionTestCase> listAllCases(String testClassname) {
        List<SolutionTestCase> solutionTestCases = new ArrayList<>();
        try {
            String testResources = ClassLoader.getSystemResource(testClassname).getFile();
            File testResourceDir = new File(testResources);
            File[] inputFiles = testResourceDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(INPUT_PREFIX);
                }
            });
            for (File input : inputFiles) {
                SolutionTestCase tmp = new SolutionTestCase(input);
                if (tmp.isValid()) {
                    solutionTestCases.add(tmp);
                }
            }
        } catch (Exception e) {
            fail(e.getMessage());
        }

        return solutionTestCases;
    }

    abstract StringBuffer getOutput();

    @Test
    public void testAllCases() {
        String testClassname = getClass().getSimpleName().substring(0, getClass().getSimpleName().lastIndexOf("Test"));
        List<SolutionTestCase> solutionTestCases = listAllCases(testClassname);
        for (SolutionTestCase solutionTestCase : solutionTestCases) {
            solutionTestCase.test();
        }
    }

    private class SolutionTestCase {

        private File input;

        private File expected;

        private String caseNo;

        private boolean valid;

        public SolutionTestCase(File inputFile) {
            this.input = inputFile;
            try {
                caseNo = this.input.getName().substring(INPUT_PREFIX.length());
                expected = new File(String.format("%s/%s%s", inputFile.getParent(), EXPECTED_PREFIX, caseNo));

                valid = true;
                System.out.printf("SolutionTestCase found: %s\n", input.getName());
            } catch (NullPointerException e) {
                valid = false;
            }
        }

        public boolean isValid() {
            return this.valid;
        }

        public void test() {
            StringBuffer expectedBuffer = new StringBuffer();
            try (FileReader fileReader = new FileReader(expected);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while (bufferedReader.ready()) {
                    expectedBuffer.append(bufferedReader.readLine());
                }
                assertEquals(getOutput().toString(), expectedBuffer.toString());
            } catch (IOException e) {
                fail(e.getMessage());
            }
        }
    }
}
