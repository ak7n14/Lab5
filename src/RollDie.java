import java.lang.Thread;
import java.util.Random;

class RollDieThread implements Runnable{
	public int threadNo;
	public RollDieThread(int pThreadNo){
		threadNo = pThreadNo;
	}
	public void run() {
		Random rand = new Random();
		
		try {
			Thread.sleep((threadNo*threadNo*threadNo)*5);
		} catch (InterruptedException e) {}
		if(threadNo==20){
				System.out.printf("%d \n", rand.nextInt(5)+1);
		}
	}
}

public class RollDie {
	public static void main(String[] args){
		for(int i = 1; i<=20;i++){
			RollDieThread r1 = new RollDieThread(i);
			Thread t1 = new Thread(r1);
			t1.start();
		}
	}
}
