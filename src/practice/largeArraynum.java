package practice;

public class largeArraynum {
	


		public static void main(String[] args) {
			
			
			System.out.println("your largest numbers ");
			int [] numbers = new int[] {1,2,3,4,5,6,8,22,22,33,11,0 };
			
			int largest = numbers[0];
			for (int i = 0; i < numbers.length; i++) {
				if(largest < numbers[i]) {
					largest = numbers[i];
				}
			}
			System.out.println(largest);



	}



}
