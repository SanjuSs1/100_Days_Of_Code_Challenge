package com.Hashing;

	import java.util.HashMap;
	import java.util.Map;
	public class HighestLowestFreqElement
	{
	    public static int getMaximumDiff(int arr[], int n)
	    {
	        HashMap<Integer,Integer> freq = new HashMap<>();
	        for (int i = 0 ; i < n; i++)
	        {
	            if(freq.containsKey(arr[i]))
	            {
	                freq.put(arr[i], freq.get(arr[i])+1);
	            }
	            else
	            {
	                freq.put(arr[i], 1);
	            }
	        }
	        int maxfreq = 0, minfreq = n;
	        for (Map.Entry<Integer,Integer> x : freq.entrySet())
	        {
	            maxfreq = Math.max(maxfreq, x.getValue());
	            minfreq = Math.min(minfreq, x.getValue());
	        }
	        return (maxfreq - minfreq);
	    }
	    public static void main(String[] args)
	    {
	        int arr[] = {1, 2, 3, 1, 5, 2, 3, 1 };
	        int n = arr.length;
	        System.out.println(getMaximumDiff(arr, n));
	    }
	}

