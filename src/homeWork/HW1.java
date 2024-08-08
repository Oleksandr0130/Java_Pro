package homeWork;

public class HW1 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 2_000_000; i++) {
            if (i % 21 == 0 && valueHaveThree(i)){
                count++;
            }
        }
        System.out.println("1 поток: " + count);
    }

    private static boolean valueHaveThree(int value) {
        while (value > 0){
            if (value % 10 == 3){
                return true;
            }
            value /= 10;
        }
        return false;
    }

}
