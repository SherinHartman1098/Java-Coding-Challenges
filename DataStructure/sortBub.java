package DataStructure;

public class sortBub {
    public static void main(String[] args) {
        int nums[]={6,5,8,9,4};
        int size= nums.length;
        int temp=0;
        System.out.println("Before Sorting:");
        for(int num:nums){ //enhanced forloop
            System.out.print(num+" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){ //size-i-1 because the last last element is already sorted. This helps with the speed.
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Before Sorting:");
        for(int num:nums){ //enhanced forloop
            System.out.print(num+" ");
        }
    }
}
