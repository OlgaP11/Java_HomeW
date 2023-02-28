import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String [] args) {
        String [] workers [] = {
            {"Иван", "Иванов"},
            {"Светлана", "Петрова"},
            {"Кристина", "Белова"},
            {"Анна", "Мусина"},
            {"Анна", "Крутова"},
            {"Иван", "Юрин"},
            {"Петр", "Лыков"},
            {"Павел", "Чернов"},
            {"Петр", "Чернышов"},
            {"Мария", "Федорова"},
            {"Марина", "Светлова"},
            {"Мария", "Савина"},
            {"Мария", "Рыкова"},
            {"Марина", "Лугова"},
            {"Анна", "Владимирова"},
            {"Иван", "Мечников"},
            {"Петр", "Петин"},
            {"Иван", "Ежов"} 
        };

        Map <String, Integer> repeatNames = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < workers.length;i++) {
            if (!repeatNames.containsKey(workers[i][0])){
                for (int k = 0; k < workers.length; k++) {
                    if (workers[i][0].equals(workers[k][0])) counter++;
                }
                repeatNames.put(workers[i][0],counter);
                counter = 0;
            }
        }

        Map <String, Integer> sortedMap = new HashMap<>();
        for (var elem : repeatNames.entrySet()) {
            String maxK = "";
            int maxV = 0;
            for (var item : repeatNames.entrySet()){
                if (!sortedMap.containsKey(item.getKey()) && item.getValue() >= maxV){
                    maxV = item.getValue();
                    maxK = item.getKey();
                } 
            }
            sortedMap.put(maxK, maxV);
            System.out.printf("%s: %d\n", maxK, maxV);
            maxV = 0;
        }
        
    }
}
