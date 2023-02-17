import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task4 {
    public static void main(String [] args) {
        Logger logger = Logger.getLogger(task4.class.getName());
        try {
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            Scanner scan = new Scanner(System.in);
            String mes1 =  "Введите первое число: ";
            double user_num1 = getValue(scan,mes1); 
            logger.info("Пользователь ввел первое число " +user_num1);

            String mes2 = "Введите второе число: "; 
            double user_num2 = getValue(scan,mes2); 
            logger.info("Пользователь ввел второе число " +user_num2);

            System.out.print("Введите символ операции: "); 
            String operation = scan.next(); 
            logger.info("Символ операции " +operation);

            double result = 0;
            if (operation.equals("+")) result = sumNums(user_num1,user_num2);
            else if (operation.equals("-"))result = diffNums (user_num1,user_num2);
            else if (operation.equals("*"))result = multiNums (user_num1,user_num2);
            else if (operation.equals("/"))result = divNums (user_num1,user_num2);
            System.out.printf("Результат = %.2f",result);
            logger.info("Результат операции " +result);

            scan.close();
        } catch (IOException e) {
            System.out.println("Тут ошибочка вышла -_-'...");
        }
    
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