package com.example.commons.string.converter;

public class StringConverter2 {

    /**
     * This method converts word into uppercase.
     *
     * @param inputString is the word to get into uppercase.
     * @return uppercase string.
     */
    public static String toUpperCase(String inputString) {
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char currentCharToUpperCase = Character.toUpperCase(currentChar);
            result = new StringBuilder().append(result).append(currentCharToUpperCase).toString();
        }
        return result;
    }

    /**
     * This method convert word into lowercase.
     *
     * @param inputString is the word to get into lowercase.
     * @return lowercase string.
     */
    public static String toLowerCase(String inputString) {
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char currentCharToLowerCase = Character.toLowerCase(currentChar);
            result = result + currentCharToLowerCase;
        }
        return result;

    }
}
