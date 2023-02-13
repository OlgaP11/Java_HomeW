import java.util.Scanner;

public class task_3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String mes1 =  "Введите первое число: ";
        double user_num1 = getValue(scan,mes1); 
        String mes2 = "Введите второе число: "; 
        double user_num2 = getValue(scan,mes2); 
        System.out.print("Введите символ операции: "); 
        String operation = scan.next(); 
        double result = 0;
        if (operation.equals("+")) result = sumNums(user_num1,user_num2);
        else if (operation.equals("-"))result = diffNums (user_num1,user_num2);
        else if (operation.equals("*"))result = multiNums (user_num1,user_num2);
        else if (operation.equals("/"))result = divNums (user_num1,user_num2);
        System.out.printf("Результат = %.2f",result);
        scan.close();
    }

    static double getValue(Scanner sc, String message){
        double number;
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            System.out.println(message);
            System.out.println("Некорректный ввод. Попробуйте снова.");
            sc.next(); 
        }
        number = sc.nextDouble();
        return number;
    }

    static double sumNums(double n1, double n2){
        return n1+n2;
    }

    static double diffNums(double n1, double n2){
        return n1-n2;
    }

    static double multiNums(double n1, double n2){
        return n1*n2;
    }

    static double divNums(double n1, double n2){
        return n1/n2;
    }
}