import java.util.LinkedList;

public class task1 {
    public static void main(String [] args) {
        LinkedList <Integer> nums = new LinkedList<Integer>();
        for (int i = 1; i < 10; i++) {
            nums.add(i);            
        }
        showList(nums);
        nums = reverseList(nums);
        showList(nums);
    }
    
    public static LinkedList reverseList(LinkedList <Integer> list) {
        LinkedList <Integer> reverse = new LinkedList<>();
        for (int n : list) {
            reverse.add(0,n);
        }
        return reverse;
    }

    public static void showList(LinkedList <Integer> list) {
        for (int n : list) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}