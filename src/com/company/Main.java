package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Anna", "Bob", "level", "tenet", "Race Car", "Top spot", "Never odd or even", "barber", "avalanche", "a   a", "civic", "madam", "Sagas", "wow", "Red rum sir is murder", "Eva can I see bees in a cave");
        for (String original : words) {
            String replacer = original.toLowerCase(Locale.ROOT).replaceAll("\\s", "");
            StringBuilder reverse = new StringBuilder();
            int length = replacer.length();
            for (int i = length - 1; i >= 0; i--)
                reverse.append(replacer.charAt(i));
            if (replacer.equals(reverse.toString()))
                System.out.println("the word : '" + original + "' is a palindrome.");
            else
                System.out.println("the word  '" + original + "' isn't a palindrome.");
        }
    }
}
