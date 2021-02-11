package rei;

import java.util.ArrayList;

public class DataSet {

	public ArrayList<String> getDataSet(String sampleWord) {
		Solution sol = new Solution();
		Dictionary onlineUtil = new Dictionary();
		ArrayList<String> wordlist = new ArrayList<>();
		ArrayList<String> dicionarylist = new ArrayList<>();
		boolean success = false;
		try {
			int[] localCharFreq = new int[26];
			for (char c : sampleWord.toLowerCase().toCharArray()) {
				++localCharFreq[c - 'a'];
			}
			if(sampleWord.length()<10) {
				wordlist = sol.getAllWords(sampleWord);
				for (int i = 0; i < wordlist.size(); i++) {
					boolean duplicate = false;
					if (onlineUtil.isEnglishWord(wordlist.get(i)) == true) {
						success = true;
						if(dicionarylist.size()<1) {
							dicionarylist.add(wordlist.get(i));
						}
						else {
							for (int j=0; j < dicionarylist.size(); j++) {
								if(dicionarylist.get(j).equalsIgnoreCase(wordlist.get(i))) {
									duplicate = true;
								}
							}
							if(duplicate == false) {
								dicionarylist.add(wordlist.get(i));
							}
						}
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
