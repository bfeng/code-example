package io.github.bfeng.leetcode;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

/**
 * Created by bfeng on 4/17/16.
 */
public abstract class GeneralTestSuite {

    private static final String INPUT_PREFIX = "input-";

    private static final String EXPECTED_PREFIX = "expected-";

    private List<SolutionCase> listAllCases(String testClassname) {
        List<SolutionCase> solutionCases = new ArrayList<>();
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
                SolutionCase tmp = new SolutionCase(input);
                if (tmp.isValid()) {
                    solutionCases.add(tmp);
                }
            }
        } catch (Exception e) {
            fail(e.getMessage());
        }

        return solutionCases;
    }

    public void testAllCases(String testClass, String testMethod) {
        List<SolutionCase> solutionCases = listAllCases(testClass);
        for (SolutionCase solutionCase : solutionCases) {
            solutionCase.test(testMethod);
        }
    }

    private class SolutionCase {

        private File input;

        private File expected;

        private String caseNo;

        private boolean valid;

        public SolutionCase(File inputFile) {
            this.input = inputFile;
            if (inputFile == null) {
                valid = false;
                return;
            }
            caseNo = inputFile.getName().substring(INPUT_PREFIX.length());
            expected = new File(String.format("%s/%s%s", inputFile.getParent(), EXPECTED_PREFIX, caseNo));
            if (expected == null) {
                valid = false;
            } else {
                valid = true;
                System.err.printf("SolutionCase found: %s\n", input.getName());
            }
        }

        public boolean isValid() {
            return this.valid;
        }

        public void test(String testMethod) {
            fail("");
        }
    }
}
