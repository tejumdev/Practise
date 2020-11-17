/*
Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the increment to all indices.
*/

public int oddCells(int n, int m, int[][] indices) {
        
        int [] row = new int[n];
        int [] col = new int[m];
        for(int[] indice : indices){
            row[indice[0]]++;
            col[indice[1]]++;
        }
        
        int rowEO[] = findOddAndEven(row);
        int colEO[] = findOddAndEven(col);
        return rowEO[0]*colEO[1] + rowEO[1]*colEO[0];
        
    }
    
    private int[] findOddAndEven(int[] input){
        int output[] = new int[2];
        for(int i : input) output[(i%2 == 0 ? 1 : 0)]++;
        return output;
    }
    
    /*The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.

Given a positive integer N, return true if and only if it is an Armstrong number.*/
     public boolean isArmstrong(int N) {
        int num_placeholder = N,digits,ArmStrong=0;
        digits = String.valueOf(N).length();
        while(num_placeholder != 0)
        {
            
            ArmStrong += Math.pow(num_placeholder % 10,digits);
            
            num_placeholder /= 10;
        }
        
        return ArmStrong == N;
    }
/*
You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.
*/
public boolean canFormArray(int[] arr, int[][] pieces) {
Map<Integer, int[]> map = new HashMap<>();

    for(int[] piece : pieces)
        map.put(piece[0], piece);
    
    int index = 0;
    
    while(index < arr.length){
        if(!map.containsKey(arr[index]))
            return false;
        
        int[] p = map.get(arr[index]);
        
        for(int i = 0; i < p.length; i++){
            if(arr[index++] != p[i])
                return false;
        }
    }
    return true;
}
