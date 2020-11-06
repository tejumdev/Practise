   public int findNumbers(int[] nums) {
        int even_digits=0,count=0;
       for(int each:nums)
       {
            count = 0;
           while(each > 0)
           {
               each /= 10;
               count++;
           }
           if(count % 2 == 0) even_digits++;
       }
        return even_digits;
    }

   public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int arr_len = arr.length;
    	long count = IntStream.range(0,arr_len)
	.filter(currIndex -> {
		int j=currIndex+1;
		int k=currIndex+2;
		if(currIndex <= arr_len - 3) {
//             System.out.println(Math.abs(arr[currIndex] - arr[j]) +" "+Math.abs(arr[j] - arr[k])+" "+Math.abs(arr[currIndex] - arr[k]) );
			if((Math.abs(arr[currIndex] - arr[j]) <= a)& (Math.abs(arr[j] - arr[k]) <= b)& (Math.abs(arr[currIndex] - arr[k]) <= c)) {return true;}	
			else return false;
		}
		else return false;
		
		}).count();
	
	// System.out.println(count);
        return (int) count;
    }
