package practise;

/* Calculate sum of odd all possible sub arrays
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/

public class sumOfOddLengthArrays {
	   public static int sumOddLengthSubarrays(int[] arr) {
	        int res = 0;
	        for (int window = 1; window <= arr.length; window += 2) {
	            int currSum = 0, start = 0;
	            for (int i = 0; i < arr.length; i++) {
	                currSum += arr[i];
	                if (i - start + 1 > window) currSum -= arr[start++];
	                if (i - start + 1 == window) res += currSum;
	            }
	        }
	        return res;
	    }
public static void main(String[] args)
{
	int[] arr = {1,4,2,5,3};
	System.out.println(sumOddLengthSubarrays(arr));  
}
}
