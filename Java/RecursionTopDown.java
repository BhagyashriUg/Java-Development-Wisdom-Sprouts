public class RecursionTopDown {

    //Way Up Recursion
    public static void OneToNum(int n){
        if(n==0){
            return;
        }
        OneToNum(n-1);
        System.out.println(n);
    }
     public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int a = Factorial(n-1);
        int Fact = n*a;
        return Fact;
    }

    public static void RevArr(int[] arr ,int a){
        if(a == arr.length){
            return;
        }
        RevArr(arr, a+1);
        System.out.println(" "+arr[a]);
    }

    public static int PowerOfNum(int Num,int Pow){
        if(Pow == 0){
            return 1;
        }
        int a = PowerOfNum(Num, Pow-1);
        return Num*a; 
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Factorial is : "+Factorial(5));

        RevArr(arr, 0);
        System.out.println("Power is : "+PowerOfNum(4, 2));

    }
    
}
