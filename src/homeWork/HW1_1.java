package homeWork;

public class HW1_1 {
    public static void main(String[] args) {

        final int valueStart = 1;
        final int valueEnd = 2_000_000;
        final int middle = (valueEnd - valueStart + 1) / 2;

        HwThread1_1 thread1 = new HwThread1_1(valueStart, middle);
        HwThread1_1 thread2 = new HwThread1_1(middle + 1, valueEnd);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int sumCount = thread1.getCount() + thread2.getCount();
        System.out.println(sumCount);
    }
}
