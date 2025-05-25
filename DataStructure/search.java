package DataStructure;
public class search{
    public static void main(String[] args) {
        int nums[]={5,7,9,11,13};

        int target=11;

        //int result=linearSearch(nums, target);
        int result=binarySearch(nums, target);

        if(result!=-1){
            System.out.println("Element found at Index :"+result);
        }
        else{
            System.out.println("Element not found");

        }
    }



    public static int linearSearch(int[] nums, int target){
        int steps=0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target)
            System.out.println("No.of steps in linear:"+steps);
            return i;
        }
        System.out.println("No.of steps in linear:"+steps);

        return -1;
    }
    // binary search without recursive function
    public static int binarySearch(int[] nums, int target){
        int left=0;
        int right= nums.length-1;
        int steps=0;
        while(left<right){
            steps++;
         int mid= (left+right)/2;
         if(nums[mid]==target){
            System.out.println("No.of steps in binary:"+steps);

             return mid;
         }
         else if(nums[mid]<target){
             left= mid+1;
         }
         else {
             right= mid-1;
         }
 
        }
        System.out.println("No.of steps in binary:"+steps);

         return -1;
     }

     //Recursive binary function
     public static int binarySearch(int[] nums, int target,int left,int right){
        
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]< target)
            return binarySearch(nums, target, mid+1, right);
            else
            return binarySearch(nums, target, left, mid-1);
        }
       
        return-1;
     }
}