package homework_6;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Lenovo1", "8", "256", "Window", "grey");
        NoteBook notebook2 = new NoteBook("Tecno T1", "16", "512", "Linux", "black"); 
        NoteBook notebook3 = new NoteBook("ASUS 14x", "16", "512", "Window", "grey"); 
        NoteBook notebook4 = new NoteBook("ASUS G14", "32", "1000", "Window", "black"); 
        NoteBook notebook5 = new NoteBook("Apple MacBook", "8", "256", "MacOS", "white");

        HashMap <String, String> map1 = homework_6.NoteBook.createMap(notebook1);
        HashMap <String, String> map2 = homework_6.NoteBook.createMap(notebook2);
        HashMap <String, String> map3 = homework_6.NoteBook.createMap(notebook3);
        HashMap <String, String> map4 = homework_6.NoteBook.createMap(notebook4);
        HashMap <String, String> map5 = homework_6.NoteBook.createMap(notebook5);


        userRequest(map1, map2, map3, map4, map5);
        
    }

    public static void userRequest(HashMap <String, String> map1, HashMap <String, String> map2, HashMap <String, String> map3, HashMap <String, String> map4, HashMap <String, String> map5) {
        System.out.println("Добро пожаловать в магазин \"Твой лэптоп\"!");
        Scanner scan = new Scanner(System.in, "cp866");
        HashMap <String, String> mapUser = new HashMap<>();
        
        System.out.print("Выберите параметр:1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет, 5 - Закончить ввод параметров: ");
        int choice = scan.nextInt();

        while (choice != 5){
            if (choice == 1){
                System.out.print("Введите интересующий объем оперативной памяти: ");
                int userRam = scan.nextInt();
                String uRam = "" + userRam;
                mapUser.put("RAM", uRam);
            }
            else if (choice == 2){
                System.out.print("Введите интересущий объем жесткого диска: ");
                int userHdd = scan.nextInt();
                String uHdd = "" + userHdd;
                mapUser.put("HDD", uHdd);
            }
            else if (choice == 3){
                System.out.print("Выберите операционную систему (1-Windows, 2-Linux, 3-MacOS): ");
                int answer1 = scan.nextInt();
                if (answer1 == 1) mapUser.put("OS", "Windows");
                else if (answer1 == 2) mapUser.put("OS","Linux");
                else if (answer1 == 3) mapUser.put("OS","MacOS");
            }
            else if (choice == 4){
                System.out.print("Выберите цвет (1-черный, 2-серый, 3-белый): ");
                int answer2 = scan.nextInt();
                if (answer2 == 1) mapUser.put("Color", "black");
                else if (answer2 == 2) mapUser.put("Color","grey");
                else if (answer2 == 3) mapUser.put("Color","white");
            }
            System.out.print("Выберите параметр:1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет, 5 - Закончить ввод параметров: ");
            choice = scan.nextInt();
        }
        scan.close();
        
        System.out.println("Под ваши параметры подходят следующие модели: ");
        if (compareParams(mapUser, map1)){
            System.out.println(map1.get("model"));
        } else if (compareParams(mapUser, map2)){
            System.out.println(map2.get("model"));
        } else if (compareParams(mapUser, map3)){
            System.out.println(map3.get("model"));
        } else if (compareParams(mapUser, map4)){
            System.out.println(map4.get("model"));
        } else if (compareParams(mapUser, map5)){
            System.out.println(map5.get("model"));
        } else {
            System.out.println("К сожалению, подходящего ноутбука нет.");
        }
        
    }
    
    public static boolean compareParams(HashMap<String, String> map, HashMap<String, String> map1) {
        boolean flag = true;
        if (!map.get("RAM").equals(map1.get("RAM"))) flag = false;
        else if (!map.get("HDD").equals(map1.get("HDD"))) flag = false;
        else if (!map.get("OS").equals(map1.get("OS"))) flag = false;
        else if (!map.get("Color").equals(map1.get("Color"))) flag = false;

        return flag;
    }
    

}
