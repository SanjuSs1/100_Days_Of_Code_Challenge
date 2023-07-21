//Java program to count frequencies 
package com.Hashing;

import java.util.*;
class FrequencyCount {
	static void frequency(int arr[], int size)
	{
		HashMap<Integer, Integer> freq
			= new HashMap<Integer, Integer>();

		for (int i=0;i<size;i++) {
			if (freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			}
			else {
				freq.put(arr[i], 1);
			}
		}
		for (Map.Entry entry : freq.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 2, 1, 1, 2, 5, 2};
		int size = arr.length;
		frequency(arr,size);
	}
}

