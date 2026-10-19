import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strig to be reversed :");
        String word = sc.nextLine();
       // int i = word.length();
        for(int i =word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));     
           }
        sc.close();
    }
    
}
