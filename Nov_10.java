/*
You have a queue of integers, you need to retrieve the first unique integer in the queue.

Implement the FirstUnique class:

FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
void add(int value) insert value to the queue. */


class FirstUnique {
    
    Set<Integer> visited = new LinkedHashSet<Integer>();
    Set<Integer> unique = new HashSet<Integer>();
    public FirstUnique(int[] nums) {
      for(int each:nums){
         add(each);
      } 
    }
    
    public int showFirstUnique() {
        if(!visited.isEmpty() ) {
            return visited.iterator().next();
        }
           
        return -1;
    }
    
    public void add(int value) {
        
        if(unique.contains(value)) {
            visited.remove(value);
        }
        else {unique.add(value);
             visited.add(value);
             }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
 
 /* find first bad version by reducing calls to API as much possible*/
 /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(mid)({ high = mid - 1;}
      else int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1, high = n;
        int mid=0;
        while(low < high)
        {
            // System.out.println(low+" "+high);
            mid = low+(high-low)/2;
            
            if(isBadVersion(mid)) high = mid;
            else low = mid+1;
        }
        
        return low;
        // if(isBadVersion(low)) return low;
        // else return -1;
    }
     
}
