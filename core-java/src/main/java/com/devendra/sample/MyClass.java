package thread;
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("in run() method");
           for(int i=0;i<5;i++){
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());}}}
public class MyClass {
    public static void main(String...args) throws InterruptedException{
           System.out.println("In main() method");
           MyRunnable runnable=new MyRunnable();
           Thread thread1=new Thread(runnable);
           Thread thread2=new Thread(runnable);
           thread1.start();
           thread1.join();
           thread2.start();
           thread2.join();

           System.out.println("end main() method");
    }
}
/* NOTE:In short - calling thread1.join()  made main thread to wait until Thread-1 dies.*/
/*OUTPUT
In main() method
in run() method
i=0 ,ThreadName=Thread-0
i=1 ,ThreadName=Thread-0
i=2 ,ThreadName=Thread-0
i=3 ,ThreadName=Thread-0
i=4 ,ThreadName=Thread-0
in run() method
i=0 ,ThreadName=Thread-1
i=1 ,ThreadName=Thread-1
i=2 ,ThreadName=Thread-1
i=3 ,ThreadName=Thread-1
i=4 ,ThreadName=Thread-1
end main() method
  
*/