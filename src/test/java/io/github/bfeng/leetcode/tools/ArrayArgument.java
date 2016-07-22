package io.github.bfeng.leetcode.tools;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bfeng on 7/22/16.
 */
public class ArrayArgument extends Argument {

    public static boolean isDigit(char c) {
        return Character.isDigit(c) || c == '-';
    }

    public static void main(String[] args) throws Exception {
        List<Integer> tokens = new ArrayList<Integer>();
        String testResources = ClassLoader.getSystemResource("ThreeSum").getFile();
        FileReader fileReader = new FileReader(new File(testResources + "/input-1"));
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            char c = (char) fileReader.read();
            if (c == ',' || c == ' ') {
                continue;
            }
            stringBuilder.append(c);
            while (fileReader.ready()) {
                c = (char) fileReader.read();
                if (isDigit(c)) {
                    stringBuilder.append(c);
                } else
                    break;
            }
            tokens.add(Integer.parseInt(stringBuilder.toString()));
            stringBuilder.delete(0, stringBuilder.length());
        }
        System.out.println(tokens);
    }
}
