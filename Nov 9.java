
/* Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.*/
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
       List<Integer> res = new ArrayList<Integer>();
        for(int each:arr1)
        {
            if(IntStream.of(arr2).anyMatch(i -> i==each) && IntStream.of(arr3).anyMatch(j -> j== each)) res.add(each);
        }
        return res; 
    }
    
    
    /* A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S. */
    public String removeOuterParentheses(String S) {
        int paran_count = 0,start=0,end=0;
        int S_len = S.length();
        String res="";
        for(int i=0;i< S_len;i++)
        {
          
            
            if(S.charAt(i) == '(') paran_count++;
            if(S.charAt(i) == ')') paran_count--;
            if(paran_count == 0 )
            {
                 
                if(S.charAt(i) == '(') start = i;
                else 
                {
                    
                    end = i;
                    if(start+1 != end) res = res.concat(S.substring(start+1,end));
                    if(end+1 < S_len) start = end+1;
                }
            }
           
           
               
         
        }
        return res;
    }
    
    /*
    Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal. */
    
    
       public int diagonalSum(int[][] mat) {
     int sum = 0;		
   for(int i = 0; i < mat.length; ++i) {
        sum += mat[i][i];
        if(i != mat.length - i -1)
            sum += mat[i][mat.length - i - 1];
    }
    
    return sum;
    }
