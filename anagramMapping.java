package practise;

import java.util.stream.IntStream;

public class anagramMapping {
	
    public static int[] anagramMappings(int[] A, int[] B) {
        int a_len = A.length;
       int[] res = new int[a_len];
       for(int i=0; i < a_len; i++)
       {
           int ele = A[i];
           res[i] = IntStream.range(0,a_len).filter(index -> ele == B[index]).findFirst().orElse(-1);
       }
       return res;
    }
    
    public static void main(String[] args)
    {
    	int[] A = {12, 28, 46, 32, 50};
    	int[] B = {50, 12, 32, 46, 28};
    	int[] res = anagramMappings(A,B);
    	IntStream.of(res).forEach(each -> System.out.println(each));
    }

}
