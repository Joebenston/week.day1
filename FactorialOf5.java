package Day2;

public class FactorialOf5 {

	public static void main(String[] args) {
	
		int input=5;
		
		int fact=1;
		
		for (int i = 1; i <=5; i++) {
			fact=fact*i;
		}	
			System.out.println("fact of 5 is" + fact); 
	}

}
