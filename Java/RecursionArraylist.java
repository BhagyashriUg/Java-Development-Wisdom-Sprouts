import java.util.ArrayList;
public class RecursionArraylist {

   
    public static void RemoveOccurrences(ArrayList<Integer> list,int target,int index){
        if(index>=list.size()){
            return;
        }
        if(list.get(index) == target){
            list.remove(index);
             RemoveOccurrences(list, target, index);
        }else
        RemoveOccurrences(list, target, index+1);
       
    }

    public static int CountOccurrence(ArrayList<Integer> list,int target,int index){
        int CurrentCount = 0;
        if(index>=list.size()){
            return 0;
        }
        if(list.get(index) == target){
            CurrentCount = 1;
        }
        int count = CountOccurrence(list, target, index+1);
        return (CurrentCount + count);
    }

    public static boolean Palindrome(ArrayList<Integer> list ,int start ,int end){
        if(start>=end){
            return true ;
        }
        if(!list.get(start).equals(list.get(end))){
            System.out.println("Not Palindrome");
            return false;
        }
        return Palindrome(list, start+1, end-1);
    }

    public static int AddElements(ArrayList<Integer> list){
        if(list.isEmpty()){
            return 0;
        }
        int CurrentItem = list.remove(0);
        return (CurrentItem+AddElements(list));
    }

    public static void Reverse(ArrayList<Integer> list,int start,int end){
        if(start>=end){
            return;
        }
        int temp = list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);
        Reverse(list, start+1, end-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
       //System.out.println("Sum of all the elements are : "+AddElements(list));
    //    Reverse(list, 0, (list.size()-1));
    //    System.out.println("Reverse is : "+ list);
       
       System.out.println("is Palindrome : "+Palindrome(list, 0,list.size()-1)); 

       System.out.println("1 Occurs : "+CountOccurrence(list, 1, 0)+" Times");
       RemoveOccurrences(list,2,0);
       System.out.println(list);
    }
}
