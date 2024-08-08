package homeWork;

public class HwThread1_1 extends Thread {

    private int start;
    private int end;
    private int count;

    public HwThread1_1(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
         count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 21 == 0 && valueHaveThree(i)) {
                count++;
            }
        }
        System.out.println("Tread: " + count);
    }
    public int getCount() {
        return count;
    }

    private static boolean valueHaveThree(int value) {
        while (value > 0) {
            if (value % 10 == 3) {
                return true;
            }
            value /= 10;
        }
        return false;
    }

}

