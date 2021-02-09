package rei;

import java.util.ArrayList;

public class DataSet {

	public void getDataSet(String sampleWord) {
		Solution sol = new Solution();
		Dictionary onlineUtil = new Dictionary();
		ArrayList<String> wordlist = new ArrayList<>();
		boolean success = false;

		try {
			int[] localCharFreq = new int[26];
			for (char c : sampleWord.toLowerCase().toCharArray()) {
				++localCharFreq[c - 'a'];
			}

			wordlist = sol.getAllWords(sampleWord);
			for (int i = 0; i < wordlist.size(); i++) {

				if (onlineUtil.isEnglishWord(wordlist.get(i)) == true) {
					success = true;
					System.out.println(wordlist.get(i));
				}
			}
			if (success == false) {
				System.out.println("No word avialable in dictionary");
			}
		} catch (Exception e) {
			System.out.println("Not a valid input");
		}
	}
}
