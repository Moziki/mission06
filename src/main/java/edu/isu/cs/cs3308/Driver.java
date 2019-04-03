package edu.isu.cs.cs3308;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * MISSION 06
 *
 * @Author Dan Walker
 */
public class Driver {
    public static void main(String args[]) {

        HashSet<String> wordBank;
        HashSet<String> userWords;
        LinkedList<String> dict = new LinkedList<>();
        SpellCheck checker = new SpellCheck();


        Scanner user = new Scanner(System.in);


        System.out.println("Enter a sentence to check: ");
        String userInput = user.nextLine();

        String[] u = userInput.split(" ");
        userWords = new HashSet<>();
        for (String s : u) {
            userWords.add(s.toLowerCase());
        }
        for (String s : userWords) {
             dict = (LinkedList<String>)checker.check(s);
            if (dict.size() == 1) {

            }
            else for (String st : dict)
                System.out.println(st);
        }

        //userWords.removeAll(wordBank);
        //userWords.forEach(x -> System.out.println(x));
    }
}


