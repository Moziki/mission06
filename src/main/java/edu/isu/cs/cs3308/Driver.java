package edu.isu.cs.cs3308;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
    public static void main(String args[]) {

        HashSet<String> wordBank;
        HashSet<String> userWords;
        LinkedList<String> dict = new LinkedList<>();
        SpellCheck checker = new SpellCheck();

        Scanner doc = null;
        Scanner user = new Scanner(System.in);

        try {
            doc = new Scanner(new BufferedReader(new FileReader("data/en-US.dic")));
            while (doc.hasNext()) {
                String word = doc.nextLine().toLowerCase();
                dict.add(word);


            }
        }
        catch (FileNotFoundException error){

        }
        finally {
            if (doc != null) doc.close();
        }
        wordBank = new HashSet<>(dict);
        dict = null;
        //for (String s : wordBank) {
        //    System.out.println(s);
        //}
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


