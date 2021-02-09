package rei;

import java.util.ArrayList;

public class Solution {
	ArrayList<String> comb = new ArrayList<>();
	ArrayList<String> per = new ArrayList<>();
	ArrayList<String> tempComb = new ArrayList<>();
	ArrayList<String> finalList = new ArrayList<>();

// This method will take a string and provide all the possible combinations in array list
	ArrayList<String> getCombination(String instr, StringBuffer outstr, int index) {
		
		try {
			for (int i = index; i < instr.length(); i++) {
				outstr.append(instr.charAt(i));
				comb.add(outstr.toString());
				getCombination(instr, outstr, i + 1);
				outstr.deleteCharAt(outstr.length() - 1);
			}
		} catch (Exception e) {
			System.out.println("Error in getCombination");
		}
		return comb;
	}

// This method will provide all the possible permutation in array list
	ArrayList<String> getPermutation(String str, String ans) {

		try {
			if (str.length() == 0) {
				per.add(ans);
			}
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				String ros = str.substring(0, i) + str.substring(i + 1);

				getPermutation(ros, ans + ch);
			}

		} catch (Exception e) {
			System.out.println("Error in getPermutation");
		}
		return per;
	}

// This method will provide all the possible permutation and combination in array list
	ArrayList<String> getAllWords(String word) {
		tempComb = getCombination(word, new StringBuffer(), 0);
		try {
			for (int i = 0; i < tempComb.size(); i++) {
				finalList = getPermutation(tempComb.get(i), "");
			}
		} catch (Exception e) {
			System.out.println("Error in getAllWords");
		}
		return finalList;
	}

}
