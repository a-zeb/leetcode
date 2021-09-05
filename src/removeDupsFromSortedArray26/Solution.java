package removeDupsFromSortedArray26;

import java.util.Arrays;

//26. Remove Duplicates from Sorted Array
class Solution {
	
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 2, 2, 4, 7, 7, 9, 9, 1};
		Solution myObj = new Solution();
		myObj.removeDuplicates(test);
	}
	
    public int removeDuplicates(int[] nums) {
		int currentElement;
		int elementInArray;
		int i;
		int k = 0;
		Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
		
		for (i = 0; i < nums.length; i++) {
			currentElement = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				elementInArray = nums[j];
				if (currentElement == elementInArray) {
					nums[j] = 999;
				}
			}
			if (nums[i] != 999) {
				k++;
			}
		}
		Arrays.sort(nums);
		return k;
    }
   
}