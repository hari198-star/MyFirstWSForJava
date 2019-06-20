package JVMMemoryPractices;

public class StackOverflowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOverflowPractice sop = new StackOverflowPractice();
		sop.repeat(10);
	}
	
	private void repeat(int i) {
		if(i == 0) return;
		repeat(i);
	}

}
