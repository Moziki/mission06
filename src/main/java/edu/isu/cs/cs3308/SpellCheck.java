package edu.isu.cs.cs3308;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpellCheck implements SpellChecker {
    HashSet<String> wordBank;
    public SpellCheck() {
        LinkedList<String> dict = new LinkedList<>();
        Scanner doc = null;
        Scanner user = new Scanner(System.in);

        try {
            doc = new Scanner(new BufferedReader(new FileReader("data/en-US.dic")));
            while (doc.hasNext()) {
                String word = doc.nextLine().toLowerCase();
                dict.add(word);


            }
        } catch (
                FileNotFoundException error) {

        } finally {
            if (doc != null) doc.close();
        }
        wordBank = new HashSet<>(dict);
        dict = null;
    }
    @Override
    public List<String> check(String s) {

        List<String> correction = new LinkedList<>();
        if (wordBank.contains(s)) {
            correction.add(s);
            return correction;
        } else {
            for (int i = 0; i < s.length(); ++i) {
                correction.add(s.substring(0, i) + s.substring(i + 1));
            }
            for (int i = 0; i < s.length() - 1; ++i) {
                correction.add(s.substring(0, i) + s.substring(i + 1, i + 2) + s.substring(i, i + 1)
                        + s.substring(i + 2));
            }
            for (int i = 0; i < s.length(); ++i) {
                for (char c = 'a'; c <= 'z'; ++c) {
                    correction.add(s.substring(0, i) + String.valueOf(c) + s.substring(i + 1));
                }
            }
            for (int i = 0; i <= s.length(); ++i) {
                for (char c = 'a'; c <= 'z'; ++c) {
                    correction.add(s.substring(0, i) + String.valueOf(c) + s.substring(i));
                }
            }
            HashSet<String> edits = new HashSet((LinkedList<String>) correction);
            edits.retainAll(wordBank);

            for (String ww : edits) {
                correction.add(ww);
                System.out.println(ww);
            }

            return correction;
        }
    }

}
