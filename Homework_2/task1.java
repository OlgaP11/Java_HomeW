import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task1{
    public static void main(String [] args) {
        try{
            FileWriter writer = new FileWriter("for_task_1.txt", false);
            int [] nums = new int []{5,2,3,4,6,1,7};
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i]>nums[j]){
                        temp = nums[j];
                        nums[j]=nums[i];
                        nums[i] = temp;
                    }
                }
                String strNums = Arrays.toString(nums);
                writer.write(strNums+"\n");
            }
            writer.close();
        } catch(IOException e){
            System.out.println("Ошибка.");
        }
    }
}