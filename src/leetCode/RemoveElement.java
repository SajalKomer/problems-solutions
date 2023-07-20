package leetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int insertIndex =0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[insertIndex] = nums[j];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
