package com.interviewquestions;

public class StringDecoder {
    public static void main(String[] args) {

        String input = "2[ac]3[b]";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {

                int count = input.charAt(i) - '0';
                i++; // Skip '['

                StringBuilder str = new StringBuilder();

                while (input.charAt(i) != ']') {
                    str.append(input.charAt(i));  // ✅
                    i++;
                }

                for (int j = 0; j < count; j++) {
                    result.append(str);
                }
            }
        }

        System.out.println(result);
    }
}