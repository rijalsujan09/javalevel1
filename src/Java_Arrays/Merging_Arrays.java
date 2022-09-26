package Java_Arrays;
  
import java.util.Arrays;

public class Merging_Arrays {
	    public static void main(String[] args) {
	        int[]array1 = {1,2,3,4};
	        int[]array2 = {4,5,6};
	        int[]mergedarray = new int[array1.length +array2.length];
	        int pos = 0;
	        for(int i = 0; i < array1.length; i ++) {
	            mergedarray[pos++] = array1[i];

	        }
	            int count = array1.length;
	            for(int j = 0; j < array2.length; j ++) {
	                mergedarray[count] = array2[j];
	                count++;
	            }
	           
	            System.out.println(Arrays.toString(mergedarray));
	        }
	    }


