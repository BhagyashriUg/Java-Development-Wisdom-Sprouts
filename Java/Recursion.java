import java.util.*;
public class Recursion {

    public static int  Fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int num = Fibonacci(n-1) + Fibonacci(n-2);
        return num;
    }
    
    public static int findMax(int[] nums, int index){
        if(index == nums.length-1){
            return nums[index];
        }
        else{
            int m1 = findMax(nums, index+1);
            if(m1 > nums[index]){
                return m1;
            }
            else{
                return nums[index];
            }
        }
    }

    public static void basicRevArr(int[] arr,int n){
        if(n<0){
            return;
        }
        System.out.println(arr[n]);
        basicRevArr(arr,n-1);

    }

    public static void basicArr(int[] arr,int n){
        if(n==arr.length){
            return;
        }
        System.out.println(arr[n]);
        basicArr(arr,n+1);

    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }else{
        return n*Factorial(n-1);
        }
    }
    //resursion
    public static void RevNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        RevNum(n-1);
    }
    // iteration 
    public static void RevPrintNum(int num){
        for(int i=num ;i>=1 ;i--){
             System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Number : ");
        // int num = sc.nextInt();
        // System.out.println("Using Iteration");
        // RevPrintNum(num);
        // System.out.println("Using Recursion");
        // RevNum(num);
        //System.out.println("Factorial is : "+Factorial(num));
        int[] arr = {10,20,30,40};
       // basicArr(arr,0);
        //basicRevArr(arr,(arr.length-1));
        //System.out.println(findMax(arr,0));

        int n = Fibonacci(5);
        System.out.println(n);
    }
}
