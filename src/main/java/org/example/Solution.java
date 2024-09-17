package org.example;

public class Solution {
    public boolean detectCapitalUse(String word) {
        //check if length is more than 1
        if (word.length() > 1) {
            char c = word.charAt(0);
            //case when the first letter is uppercase
            if (Character.isUpperCase(c)) {
                //case when the second letter is uppercase
                if (Character.isUpperCase(word.charAt(1))) {
                    for (int i = 2; i < word.length();  i++) {
                        if (Character.isLowerCase(word.charAt(i))) {
                            return false;
                        }
                    }
                    //case when the second letter is lowercase
                } else {
                    for (int i = 2; i < word.length(); i++) {
                        if (Character.isUpperCase(word.charAt(i))) {
                            return false;
                        }
                    }
                }
                //case when the first letter is lower case
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
