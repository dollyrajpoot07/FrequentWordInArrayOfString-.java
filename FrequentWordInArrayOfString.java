Given an array of words arr[],  The task is to find the most occurring word in arr[].


import java.io.*;

class FrequentWordInArrayOfString {
static void mostFrequentWord(String arr[], int n) {

	int freq = 0;

	String res = "";

	for (int i = 0; i < n; i++) {
	int count = 0;
	for (int j = i + 1; j < n; j++) {
		if (arr[j].equals(arr[i])) {
		count++;
		}
	}

	if (count >= freq) {
		res = arr[i];
		freq = count;
	}
	}

	System.out.println("The word that occurs most is : " + res);
	System.out.println("No of times: " + freq);
}

public static void main (String[] args) {
	String arr[] = { "geeks", "for", "geeks", "a", "portal",
					"to",	 "learn", "can", "be", "computer",
					"science", "zoom", "yup", "fire", "in",
					"be",	 "data", "geeks" };
	int n = arr.length;

	mostFrequentWord(arr, n);
}
}

// This code is contributed by aadityaburujwale.
