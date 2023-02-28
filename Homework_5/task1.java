import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String [] args) {
        Map <String, String> phones = new HashMap<>();
        phones.put("+79000000000", "Анна");
        phones.put("+79000000001", "Василий");
        phones.put("+79000000002", "Петр");

        Scanner scan = new Scanner(System.in,"cp866");
        String message = "Выберите операцию (1-добавить номер, 2-вывести список номеров, 3-выйти): ";
        int userChoice = choice(scan, message);
        while(userChoice != 3){
            if (userChoice == 1) addNumber(phones, scan);
            else if (userChoice==2) showNumbers(phones);
            else System.out.println("Некорректный ввод. Попробуйте снова.");
            userChoice = choice(scan, message);
        }
        scan.close();        
    }

    public static Map<String,String> addNumber (Map <String,String> map, Scanner sc) {
        System.out.print("Введите номер телефона: ");
        String number = sc.next();
        System.out.print("Введите имя человека: ");
        String name = sc.next();
        map.put(number, name);
        return map;
    }

    public static int choice(Scanner sc, String mes){
        int number;
        System.out.print(mes);
        while (!sc.hasNextInt()) {
            System.out.print(mes);
            System.out.println("Некорректный ввод. Попробуйте снова.");
            sc.next(); 
        }
        number = sc.nextInt();
        return number;
    }

    public static void showNumbers(Map <String,String> map) {
        for (var item : map.entrySet()) {
            System.out.printf("%s, %s \n", item.getKey(), item.getValue());
        }
        
    }
}
