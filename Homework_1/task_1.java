import java.util.Scanner;

public class task_1{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scan.hasNextInt()){
            int user_num = scan.nextInt(); 
            int user_sum = triangleNum(user_num);
            int user_fact = factorial(user_num);
            System.out.printf("Треугольная сумма числа %d равна %d.\n",user_num, user_sum);
            System.out.printf("Факториал числа %d равен %d.",user_num, user_fact);
        } else{
            System.out.println("Некорректный ввод. Необходимо ввести целое число. Попробуйте заново.");
        }
        scan.close();
    }

    static int triangleNum(int n){
        int sumNums = 0;
        for (int i = 1; i <= n; i++){
            sumNums += i;
        }
        return sumNums;
    }

    static int factorial (int n){
        if (n == 1){
            return n;
        } else{
            return n*factorial(n-1);
        }
    }
}