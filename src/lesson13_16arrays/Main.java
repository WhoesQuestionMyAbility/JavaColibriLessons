package lesson13_16arrays;

public class Main {

    static int[] nums = new int[10];
    static String[] ss = new String[3];
    public static void main(String[] args) {

        nums[0] = 9;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 56;
        nums[4] = 18;
        nums[5] = 21;
        nums[6] = 40;
        nums[7] = 14;
        nums[8] = 12;
        nums[9] = 0;

        for (int n : nums){
            System.out.print(n + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < nums.length; i++){
            System.out.println(i + " : " +nums[i] + " ");
        }

        ss[0]= "Hello";
        ss[1]= " ";
        ss[2]= "World!";

        for(int i = 0; i < ss.length; i++){
            System.out.print(ss[i]);
        }
    }
}
