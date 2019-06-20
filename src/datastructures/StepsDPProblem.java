package datastructures;

import java.util.HashMap;
import java.util.Map;

public class StepsDPProblem {
	
	Map<Holder, Integer> oldValues;
	
	public StepsDPProblem() {
		oldValues = new HashMap<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StepsDPProblem prob = new StepsDPProblem();
		
		System.out.println(
				"Ways to reach 5th step with 1,2 combinations : " 
		+ prob.findNumberOfWaysWrapper(4, 3));

	}
	
	int findNumberOfWaysWrapper(int n, int m) {
		return findNumberOfWays(n+1, m);
	}
	
	int findNumberOfWays(int n, int m) {
		if(n <= 1) return n;
		
		int ways = 0;
		
		int temp = 0;
		
		for(int i = 1; i <= m && i <= n; i++) {			 
			temp = findNumberOfWays(n - i, m);
			oldValues.put(new Holder(n - i, m), temp);
			ways += temp;
		}
		
		return ways;
	}
	
	class Holder {
		int step;
		int m;
		
		public Holder(int s, int m) {
			this.step = s;
			this.m = m;
		}
		
		public boolean equals(Holder h) {
			return (this.step == h.step) && (this.m == h.m);
		}
	}

}
