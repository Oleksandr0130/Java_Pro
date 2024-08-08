package task_01;

public class Task1 {
    public static void main(String[] args) {

        //Два способа создания потоков
        // 1. Наследование от класса Thread
        // 2. Реализация интерфейса Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // Это просто вызов метода run. НОВЫЕ Потоки не создаются
//        myThread1.run();
//        myThread2.run();
        // При создании наследования вызываем метод Start
        myThread1.start();

        // При имплементации - сначала нужно создать обьект класса Thread
        // При создании передаем обьект нашего класса имплементирующий Runnable
        // У созданного обьекта Thread вызываем метод start()
        Thread thread = new Thread(myThread2);
        // Делаем поток Daemon- потоком
        thread.setDaemon(true);
        thread.start();


        // main-поток
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
