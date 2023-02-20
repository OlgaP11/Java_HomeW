import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String [] args) {
        int curLength = 10;
        LinkedList <Integer> nums = new LinkedList<Integer>();
        FillList(curLength,nums);
        ShowList(nums);
        DelEvenNums1(nums);
        DelEvenNums2(nums);        
    }
    public static void FillList(int length, LinkedList <Integer> list) {
        Random rand= new Random();
        for (int i = 0; i < length; i++) list.add(rand.nextInt(100));
    }

    public static void ShowList (LinkedList <Integer> list){
        for (Integer num : list) {
            System.out.printf("%d ",num);
        }
        System.out.println();
    }
    public static void DelEvenNums1 (LinkedList <Integer> list){
        Iterator <Integer> iter = list.iterator();
        while (iter.hasNext()){
            Integer num = iter.next();
            if (num%2 == 0) iter.remove();
        }
        ShowList(list);
    }
    public static void DelEvenNums2 (LinkedList <Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0) list.remove(i);
        }
        ShowList(list);
    }
}
