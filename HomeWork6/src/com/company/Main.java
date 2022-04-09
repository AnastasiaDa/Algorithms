package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> string = search("Alibaba or Alibubab? I do not know!", "b*b");
    }

    public static List<String> search(String source, String pattern) {
        List<String> found = new ArrayList<>();
        char[] sourceArr = source.toCharArray();
        char[] patternArr = pattern.toCharArray();

        if (patternArr.length > sourceArr.length) {
            found.add("There is no such substring!");
            return found;
        }

        int windowHash = 0;
        int patternHash = 0;
        for (int i = 0; i < patternArr.length; i++) {
            if (patternArr[i] == '*') {
                continue;
            }
            patternHash += patternArr[i];
        }

        int asterikPosition = 0;
        for (int i = 0; i < patternArr.length; i++) {
            if (patternArr[i] == '*') {
                asterikPosition = i;
            }
        }

        for (int start = 0; start < (sourceArr.length - patternArr.length + 1); start++) {
            if (start == 0) {
                windowHash = sumHash(sourceArr, start, patternArr.length - 1);
                windowHash -= sourceArr[asterikPosition];
            } else {
                windowHash -= sourceArr[start - 1];
                windowHash += sourceArr[start + patternArr.length - 1];
                windowHash -= sourceArr[start + asterikPosition];
            }

            if (windowHash == patternHash) {
                for (int i = 0; i < patternArr.length; i++) {
                    if (patternArr[i] != '*' && sourceArr[start + i] != patternArr[i]) {
                        continue;
                    } else {
                        System.out.print(sourceArr[start + i]);
                    }
                }
                System.out.print(", ");
            }
            windowHash += sourceArr[start + asterikPosition];
        }
        return found;
    }

    public static int sumHash(char[] arr, int first, int last) {
        int sum = 0;

        if (last > arr.length - 1) {
            return sum;
        }

        for (int i = first; i <= last; i++) {
            sum += arr[i];
        }

        return sum;
    }


}
