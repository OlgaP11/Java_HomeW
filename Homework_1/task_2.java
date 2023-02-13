import java.util.Scanner;

public class task_2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: "); 
        if (scan.hasNextInt()){
            int user_num = scan.nextInt(); 
            primeNums(user_num);
        } else{
            System.out.println("Некорректный ввод. Необходимо ввести целое число. Попробуйте заново.");
        }
        scan.close();
    }
    static void primeNums(int n){
        int count = 0;
        String nums = "";
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <= i/2; j++){
                if (i%j == 0) count++;
            }
            if (count==1) nums += i + " ";
            count = 0;
        }
        System.out.println(nums);
        
    }
}

