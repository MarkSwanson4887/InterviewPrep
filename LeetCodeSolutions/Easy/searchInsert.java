class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        //Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
        int targetIndex = 0;
        for(int i = 0; i < nums.length;i++){
            if(target == nums[i]){
                return i;
            }
            if(nums[i] < target){
                targetIndex = i + 1;
            }
        } 
        return targetIndex;
    }
    public static void main(String args[]){
        int[] test1 = {1,2,4,5};
        int[] test2 = {1,7};
        int[] test3 = {};
        int[] test4 = {1,2,2,2,5,6};

        System.out.println(searchInsert(test1, 3) + ": Answer should be 2");
        System.out.println(searchInsert(test2, 3) + ": Answer should be 1");
        System.out.println(searchInsert(test3, 3) + ": Answer should be 0");
        System.out.println(searchInsert(test4, 3) + ": Answer should be 4");
    }
}