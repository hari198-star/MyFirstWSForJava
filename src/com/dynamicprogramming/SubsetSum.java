package com.dynamicprogramming;

import java.util.Stack;

public class SubsetSum {
	
	Stack<Integer> subsetStack = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private void printSubsets(int[] a, int sum) {
		
	}
	
	private void findSubsets(int[] a, int sum, int start) {
		if(sum == 0) return;
		
		for(int i = start; i < a.length; i++) {
			if(a[i] < sum) {
				subsetStack.push(a[i]);
				findSubsets(a, (sum - a[i]), i+1);
			}else {
				if(a[i] == sum) {
					System.out.println(subsetStack+ " , " + a[i]);
				}
				else return;
			}
		}
	}

}
