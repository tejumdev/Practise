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
