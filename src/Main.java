//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Thread = A thread of excecution in a program (kind of like virtual CPU )
//        //          The JVM allows an application to have multiple threads running concurrently
//        //          Each thread can execute parts of your code in parallel with the main thread
//        //          Each thread has a priority
//        //          Threads with higher priority are executed in preference compared to threads with a lower priority
//
//        System.out.println(Thread.activeCount());
//
//        //Change the priority name
//        Thread.currentThread().setName("MAINNNNNNN");
//
//        //Get the name of the priority
//        System.out.println(Thread.currentThread().getName());
//
//        //Set the priority
//        Thread.currentThread().setPriority(10);
//
//        //Get the priority
//        System.out.println(Thread.currentThread().getPriority());
//
//        //Check if thread is alive
//        System.out.println(Thread.currentThread().isAlive());
//
//        for (int i = 5; i>0;i--){
//            System.out.println(i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println("You are done!");

        MyThread thread2 = new MyThread();
        thread2.start();
        System.out.println(thread2.isAlive());

        thread2.setName("eduuuu");

        System.out.println(thread2.getName());

        System.out.println("--------------------------------");
//        thread2.setPriority(9);
        System.out.println(thread2.getPriority());


        System.out.println(Thread.activeCount());


    }
}