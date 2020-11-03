package practise;


import java.util.stream.IntStream;

public class anagramMapping {
	
    public static int[] anagramMappings(int[] A, int[] B) {
        int a_len = A.length;
        int b_len = B.length;
        int size =   IntStream.of(B).max().getAsInt();
        
        int[] pos = new int[size+1];
        
        for(int i=0; i< b_len;i++)
        {
        	pos[B[i]] = i;
        }
        
        for(int i=0;i<a_len;i++)
        {
        	A[i] = pos[A[i]];
        }
     
        return A;
    }
    
    public static void main(String[] args)
    {
    	int[] A = {12, 28, 46, 32, 50};
    	int[] B = {50, 12, 32, 46, 28};
    	int[] res = anagramMappings(A,B);
    	IntStream.of(res).forEach(each -> System.out.println(each));
    }

}
