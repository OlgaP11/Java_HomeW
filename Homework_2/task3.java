import java.util.Scanner;

public class task3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите строку для проверки на палидромность: ");
        String user_text = scan.nextLine();
        checkPalodrom(user_text);
        
    }

    static void checkPalodrom(String text){
        text = text.replace(",","")
                    .replace(" ","").replace("!","").replace("?","")
                    .replace("-","").replace(".","").replace(":","").replace(";","");
        int j = text.length()-1;
        boolean flag = true;
        for (int i = 0; i < text.length()/2; i++) {
            if (Character.compare(text.charAt(i),text.charAt(j))!=0) flag = false;
            j--;
        }
        if (flag == true) System.out.println("Строка является палидромом.");
        else System.out.println("Строка не является палидромом.");
    }
}
