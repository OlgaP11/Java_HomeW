import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String [] args) {
        File file = new File ("for_task_2.txt");
        try {
            FileReader freader = new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);
            outputToConsole(breader);
            freader.close();
            breader.close();
        } catch (Exception e) {
            System.out.println("Тут ошибочка вышла -_-'...");
        }
        
    }
    static void outputToConsole(BufferedReader br){
        try{
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine()) != null){
                line = line.replace(":"," ").replace(","," ").replace("\"","");
                String [] arr = line.split(" ");
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals("фамилия")) sb.append("Студент ");
                    else if (arr[j].equals("оценка")) sb.append(" получил ");
                    else if (arr[j].equals("предмет")) sb.append(" по предмету ");
                    else sb.append(arr[j]);
                }
                sb.append(".\n");
            }
            System.out.println(sb);
        } catch (IOException e){
            System.out.println("Тут ошибочка вышла -_-'...");
        }
    }
    
}