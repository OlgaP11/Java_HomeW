import java.util.Scanner;

public class task_4 {
    public static void main(String [] args) {
        System.out.println("Восстановление уравнения типа q + w = e, где q, w, e >= 0.");
        Scanner scan = new Scanner (System.in);   
        System.out.print("Введите первое число (вместо неизвестной цифры '?'): ");     
        String s1 = scan.nextLine();
        System.out.print("Введите второе число (вместо неизвестной цифры '?'): ");     
        String s2 = scan.nextLine();
        System.out.print("Введите результат: ");
        int result = scan.nextInt();
        scan.close();
        int num1 = getNums(s1);
        int num2 = getNums(s2);
        int answer = result - num1 - num2;
        if (answer >=0){
            int minNum = Math.min(num1,num2);
            int maxNum = Math.max(num1,num2);
            num1 = maxNum+answer%10;
            num2 = minNum+(answer - answer%10);
            System.out.printf("Первоначальный вид: %d + %d = %d", num1, num2, result);  
        } else{
            System.out.println("Нет решения.");
        }
    }
        
    static int getNums (String s){
        int digits = 1;
        for (int i = 1; i < s.length(); i++){
            digits *=10;
        }
        int num = 0;
        if (s.length() > 1){
            for (int i = 0; i < s.length();i++){
                if (Character.isDigit(s.charAt(i))){
                    num += Character.digit(s.charAt(i), 10)*digits;
                } 
                digits/=10;
            }
        }
        return num;  
    }
}