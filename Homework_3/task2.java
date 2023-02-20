import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String [ ] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        int curLength = 5;
        FillList(curLength, nums);
        ShowList(nums);
        int curMax = FindMax(nums);
        int curMin = FindMin(nums);
        int curAverage = Average(nums);
        System.out.printf("Максимальное число %d.\n", curMax);
        System.out.printf("Минимальное число %d.\n", curMin);
        System.out.printf("Среднеарифметическое число %d.\n", curAverage);
    }

    public static void FillList(int length, ArrayList <Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            list.add(rand.nextInt(100));
        }
    }

    public static void ShowList(ArrayList <Integer> list) {
        for (Integer num : list) {
            System.out.printf("%d ",num);
        }
        System.out.println();
    }

    public static int FindMax(ArrayList <Integer> list) {
        int maxNum = 0;
        for (Integer num : list) {
            if (num>maxNum) maxNum = num;
        }
        return maxNum;
    }
    public static int FindMin(ArrayList <Integer> list) {
        int minNum = list.get(0);
        for (Integer num : list) {
            if (num<minNum) minNum = num;
        }
        return minNum;
    }

    public static int Average(ArrayList <Integer> list) {
        int sumNums = 0;
        for (Integer num : list) {
            sumNums += num;
        }
        return sumNums/list.size();
    }
}
