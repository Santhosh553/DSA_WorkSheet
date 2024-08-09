import java.util.Scanner;
import java.util.HashMap;
public class TwoSum
{
    // O(N^2)
    public static int[] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
		    for(int j=i+1;j<nums.length;j++){
		        if(nums[i]+nums[j]==target)//2+7=9
		        return new int[] {i,j};//0,1
		    }
		}
		return null;
    }
    
    
    // O(N)
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i]; //1. 9-2=7  2. 9-7=2
            if (map.containsKey(t)) { //1. false  2. true
                return new int[] {map.get(t), i};  //2. 0,1
            }
            map.put(nums[i], i); //1. 2,0
        }
        return null;
    }
    
    public static void display(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
		    nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
        int[] arr1=twoSum1(nums,target);
        int[] arr2=twoSum2(nums,target);
        
        display(arr1);
        display(arr2);

	}
}
