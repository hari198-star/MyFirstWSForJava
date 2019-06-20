package JVMMemoryPractices;

public class ClassNotFoundPractice {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mycollpractices.Employee1");
			System.out.println("Found class employee...");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

	}

}
