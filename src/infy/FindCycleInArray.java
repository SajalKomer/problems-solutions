package infy;

import java.util.ArrayList;

/*
Detect cycle in array. To find the number of steps to complete a ‘cycle’ in an array, given the starting index.
The value of the element present in the given index would give you the next index.

Input:{1,2,1,2,1,1}
o/p-true
Test case: Input Array:{1,2,3,2}​​
Input:{1,2}
o/p-False
 */
public class FindCycleInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        //{2,4,1,0,5,3 }
        // {1,2,3,1}
        //{1,2,3,2};
        System.out.println(findCycle(arr));
    }

    public static int findCycle(int[] arr){
        ArrayList<Integer> visited = new ArrayList<>();
        Integer pos = 0;
        boolean flag = false;
        while(pos<=arr.length){
            if(pos==0 && flag)
                break;
            else{
                visited.add(pos);
                pos=arr[pos];
                if(pos>arr.length || (visited.contains(pos) && pos!=0))
                    return -1;
                flag=true;
            }

        }
        int count = visited.size()-visited.indexOf(pos);
        return count;

    }

}
