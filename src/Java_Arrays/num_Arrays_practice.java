package Java_Arrays;

public class num_Arrays_practice {
	public static void main (String arg []) {
		
		int nums[] = {5, 7, 9, 3, 1};
		
		for (int i =0; i<5; i++) {
		System.out.println(nums[i]);
		
		}
		System.out.println("length of your string  :"+ " " + nums.length);
		
		
		for(int i = 0; i<nums.length; i++) {
			
			if(nums[i] == 9) {
				System.out.println(i);
			}
		}
	}

}
