package rei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataSet {

	public Set<String> getDataSet(String sampleWord) {
		Solution sol = new Solution();
		Dictionary onlineUtil = new Dictionary();
		ArrayList<String> wordlist = new ArrayList<>();
		Set<String> dicionarylist = new HashSet<>();
		boolean success = false;
		try {
			int[] localCharFreq = new int[26];
			for (char c : sampleWord.toLowerCase().toCharArray()) {
				++localCharFreq[c - 'a'];
			}
			if(sampleWord.length()<10) {
				wordlist = sol.getAllWords(sampleWord);
				for (int i = 0; i < wordlist.size(); i++) {
					if (onlineUtil.isEnglishWord(wordlist.get(i)) == true) {
						dicionarylist.add(wordlist.get(i));
						success = true;
					}
				}
				if (success == false) {
					System.out.println("No word avialable in dictionary");
				}
			}
			else {
				System.out.println("Input should be alphabet and less than 10 characters");
			}
		} catch (Exception e) {
			System.out.println("Not a valid input. Input should be alphabets only");
		}
		return dicionarylist;
	}
}
