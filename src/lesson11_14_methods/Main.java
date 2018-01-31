package lesson11_14_methods;

public class Main {
    public static void main(String[] args) {
        int val = calcSum(2, 4);
        System.out.println(val);
    }

    static int calcSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
