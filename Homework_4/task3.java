import java.io.IOException;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task4 {
    public static void main(String [] args) {
        Logger logger = Logger.getLogger(task4.class.getName());
        Deque <String> deque = new ArrayDeque<>();
        try {
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            Scanner scan = new Scanner(System.in);
            String mes1 =  "Введите число: ";
            double userNum1 = getValue(scan,mes1); 
            deque.addLast(String.valueOf(userNum1));
            logger.info("Пользователь ввел число " +userNum1);
            
            System.out.print("Введите операцию (+,-,*,/, о - отмена, в - выход): "); 
            String operation = scan.next().toLowerCase(); 
            deque.addLast(operation);
            logger.info("Операция " +operation);
            double result = 0;

            while (!operation.equalsIgnoreCase("в")){
                if (!operation.equalsIgnoreCase("о") && !operation.equalsIgnoreCase("в")){
                    String mes2 = "Введите число: ";
                    double userNum2 = getValue(scan,mes2);
                    deque.addLast(String.valueOf(userNum2));
                    logger.info("Пользователь ввел число " +userNum2);

                    if (operation.equals("+")) result = sumNums(userNum1,userNum2);
                    else if (operation.equals("-"))result = diffNums (userNum1,userNum2);
                    else if (operation.equals("*"))result = multiNums (userNum1,userNum2);
                    else if (operation.equals("/"))result = divNums (userNum1,userNum2);
                    System.out.printf("Результат = %.2f\n",result);
                    deque.addLast(String.valueOf(result));
                    logger.info("Результат операции " +result);
                    userNum1 = result;

                } else if (operation.equalsIgnoreCase("о")) {
                    for (int i = 0; i < 4; i++) deque.pollLast();
                    System.out.println(deque);
                    userNum1 = Double.parseDouble(deque.peekLast());
                    System.out.printf("Последний результат равен %.2f\n", userNum1);
                    logger.info("Пользователь отменил операцию.");
                }

                System.out.print("Введите операцию (+,-,*,/, о - отмена, в - выход): ");
                operation = scan.next().toLowerCase();
                deque.addLast(operation);
                logger.info("Операция " +operation);

            }
            System.out.println("Работа программы завершена.");
            logger.info("Работа программы завершена.");
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