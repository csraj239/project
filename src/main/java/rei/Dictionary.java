package rei;

public class Dictionary {
	String Dict[] = { "work", "king", "row", "run", "ring", "know", "go" };
	
 	// This method will accept a string and return boolean value if any of the word
	// matches from Dictionary list
	boolean isEnglishWord(String word) {
		int DicionaryCount = Dict.length;
		
		for (int k = 0; k < DicionaryCount; k++) {
			if (Dict[k].equalsIgnoreCase(word)) {
				return true;
			}
		}
		return false;
	}
}
