package Shyam;
import java.util.*;
public class MaxSubArraySum {
	public static void Arraycc(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i; j<numbers.length;j++) {
				int end = j;
				currSum = 0;
				for(int k=start;k<=end;k++) {
					currSum += numbers[k];
				}
				System.out.println(currSum);
				if(maxSum<currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println(" max sum is:"+maxSum);
	}
    public static void main(String arg[]) {
    	int numbers[]= {1,3,4,5,6,3,2};
    	Arraycc(numbers);
    }
}
//Time Complexicity:n^3;