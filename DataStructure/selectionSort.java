package DataStructure;

public class selectionSort {
    public static void main(String[] args) {
        int nums[]={6,5,2,8,9,4};
        int size= nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.println("Before Sorting:");
        for(int num:nums){ //enhanced forloop
            System.out.print(num+" ");
        }
        
            for( int i=0;i<size-1;i++){
                minIndex=i;
                for(int j=i+1;j<size;j++){
                    if(nums[minIndex]>nums[j]){
                        minIndex=j;     // we are just finding the min value in th inner loop
                    }
                }
                temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;
                System.out.println();
                for(int num:nums){ //enhanced forloop
                    System.out.print(num+" ");
                }
                
            }
       
        System.out.println();
        System.out.println("Before Sorting:");
        for(int num:nums){ //enhanced forloop
            System.out.print(num+" ");
        }
    }
}
