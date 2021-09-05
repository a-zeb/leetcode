package removeElements27;

import java.util.Arrays;

//27. Remove Element
class Solution {

	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 2, 2, 4, 7, 7, 9, 9, 1};
		int testValue = 2;
		Solution myObj = new Solution();
		myObj.removeElement(testArray, testValue);
	}
	
    public int removeElement(int[] nums, int val) {
		int elementInArray;
		int i;
		int k = 0;
		Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
		
        //for every element in the array
		for (i = 0; i < nums.length; i++) {
			elementInArray = nums[i];
				if (val == elementInArray) {
					nums[i] = 999;
				}
			if (nums[i] != 999) {
				k++;
			}
		}
		Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
		return k;
    }
    
}