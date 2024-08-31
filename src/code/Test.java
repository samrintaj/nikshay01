package code;

public class Test {

	public static void main(String[] args) {
	
		try {
			for(int i=1;i<=25;i++) {
				System.out.println("Number: "+i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
