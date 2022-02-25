package Day2;

public class PrintDuplicatesInArray {

public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int len =arr.length;
		// declare an int variable named count
		int count;
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i; j < arr.length-1; j++) {
				count=0;
						
						if(arr[i]==arr[j]);{
							if (count>1) {
								
							}
							System.out.println(arr[i]);
						}
				
						
						
			}
		}
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			
			
		
	}

}