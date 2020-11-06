  public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int str_len = str.length();
        for(int i=0;i<str_len;i++)
        {
            char chr = str.charAt(i);
            if(chr >= 'A' && chr <= 'Z') chr += 32;
            sb.append(chr);
        }
        return sb.toString();
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length-1;i++){
            sum+=Math.max(Math.abs(points[i][0]-points[i+1][0]), Math.abs(points[i][1]-points[i+1][1]));
        }
        return sum;
    }
public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        
        while(index1 < arr1.length && index2 < arr2.length && index3 < arr3.length) {
            if(arr1[index1] == arr2[index2] && arr1[index1] == arr3[index3]) {
                res.add(arr1[index1]);
                index1++;
                index2++;
                index3++;
            }
            else {
                //find the maximum at current index
                int max = arr1[index1];
                if(max < arr2[index2]) {
                    max = arr2[index2];
                }
                if(max < arr3[index3]) {
                    max = arr3[index3];
                }
                
                //increment index
                while(index1 < arr1.length && arr1[index1] < max) {
                    index1++;
                }
                while(index2 < arr2.length && arr2[index2] < max) {
                    index2++;
                }
                while(index3 < arr3.length && arr3[index3] < max) {
                    index3++;
                }
            }
        }
        return res;
    }
