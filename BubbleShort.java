public class BubbleShort {
    public static void main(String[] args) {
        int nums[] = {5,2,4,7,9,6,1};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for(int num : nums){
            System.out.println(num +" ");
        }


        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("After Shorting: ");
        for(int num: nums){
            System.out.println(num+" ");
        }
    }
}
