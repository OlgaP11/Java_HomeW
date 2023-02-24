import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        LinkedList <Integer> nums = new LinkedList<Integer>();
        for (int i = 1; i < 10; i++) {
            nums.add(i);            
        }
        System.out.println("Список имеет следующий вид: ");
        showList(nums);
        System.out.print("Введите номер операции, которую хотите выполнить:\n" +
        "1 - перемещение элемента в конец очереди\n"+
        "2 - возвратить первый элемент из очереди и удалить его\n"+
        "3 - возвратить первый элемент.\n");
        int choice = scan.nextInt();
        if (choice == 1){
            System.out.println("Введите номер элемента, который надо перенести: ");
            int elem = scan.nextInt();
            if (elem > nums.size() || elem < 0) System.out.println("Элемента с таким индексом нет.");
            else enqueue(nums, elem); 
        }
        else if (choice == 2) dequeue(nums);
        else if (choice == 3) first(nums);
        else System.out.println("Некорректный ввод.");
        scan.close();
    }

    public static void showList(LinkedList <Integer> list) {
        for (int n : list) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
    
    public static void enqueue (LinkedList <Integer> list, int num) {
        list.add(list.remove(num));
        showList(list);
    }

    public static void dequeue(LinkedList<Integer> list){
        list.remove(0);
        showList(list);
    }

    public static void first (LinkedList<Integer> list){
        System.out.printf("Первый элемент %d", list.get(0));
    }
}
