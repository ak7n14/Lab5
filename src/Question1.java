import java.lang.Thread;

class MyThread implements Runnable{
	public int threadNo;

	public MyThread(int pThreadNo){
		threadNo = pThreadNo;
	}
	public void run() {
		
		try {
			Thread.sleep((4- threadNo)*500);
		} catch (InterruptedException e) {}
		System.out.printf("Thread%d Has Terminated\n", threadNo);
	}
}




public class Question1 {
	public static void main(String[] args){
		MyThread r1 = new MyThread(1);
		MyThread r2 = new MyThread(2);
		MyThread r3 = new MyThread(3);
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		Thread thread3 = new Thread(r3);

		thread1.start();
		thread2.start();
		thread3.start();
	}
	

}
