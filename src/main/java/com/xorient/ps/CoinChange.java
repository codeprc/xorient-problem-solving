package com.xorient.ps;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
	public static void main(String[] args) {
		
		// the change to be given back from 100rs
		int change = 99; 		
		
		// the denomnation of notes availbale in India
		int denomination[]  = {1,2,5,10,20,50};
		
		Map<Integer, Integer> map = findDenominations(change, denomination);
		
		for(Integer deno : map.keySet()) {
			System.out.println(deno + ":" + map.get(deno));
		}
		
	}

	private static Map<Integer, Integer> findDenominations(int change, int[] denomination) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> denominationMap = new HashMap<Integer, Integer>();
		int i = denomination.length -1;
		int usages = 0;
		
		
		while(change > 0 ) {
			if(denomination[i] <= change) {
			usages = 0;
			usages = (change - (change % denomination[i])) / denomination[i];
			change =  change%denomination[i];
			denominationMap.put(denomination[i], usages);
			}
			i--; // as i must reduce , thus keeping out of if
		}
		
		return denominationMap;
	}
	
	
}
