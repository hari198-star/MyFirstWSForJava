package com.dynamicprogramming;

public class UglyNumbers {

	public static void main(String[] args) {
		
		int n = 100;
		
		int[] uglyNum = new int[n];
		
		int i2, i3, i5 = 1;
		
		i2 = 1;
		i3 = 1;
		
		int k = 1;
		
		uglyNum[0] = 1;
		
		int next_ugly_num = 1;
		
		int nex_multiple_of_two = 1 * 2;
		int nex_multiple_of_three = 1 * 3;
		int nex_multiple_of_five = 1 * 5;
		
		while(k < n) {
			next_ugly_num = Math.min(Math.min(nex_multiple_of_two, nex_multiple_of_three),
					nex_multiple_of_five);
			
			uglyNum[k] = next_ugly_num;
			k++;
			
			if(next_ugly_num == nex_multiple_of_two) {
				i2 = i2 + 1;
				nex_multiple_of_two = i2 * 2;				
			}
			if(next_ugly_num == nex_multiple_of_three) {
				i3 = i3 + 1;
				nex_multiple_of_three = i3 * 3;				
			}
			if(next_ugly_num == nex_multiple_of_five) {
				i5 = i5 + 1;
				nex_multiple_of_five = i5 * 5;				
			}
		}
		
		System.out.println("Printing ugly numbers : ");
		for(int i=0; i<uglyNum.length; i++) {
			System.out.print(uglyNum[i] + " , ");
		}

	}

}
