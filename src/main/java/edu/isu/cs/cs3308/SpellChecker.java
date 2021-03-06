package edu.isu.cs.cs3308;

import java.util.List;

/**
 * Simple interface for a spell check class
 *
 * @author Isaac Griffith
 */
public interface SpellChecker {

	/**
	 * Checks the spelling of the given string.
	 *
	 * @param s The string to check the spelling of
	 * @return A list of alternatives, if the list is length 1 containing the same value as s, then the provided word was correctly spelled. Else it was not.
	 */
	List<String> check(String s);
}
