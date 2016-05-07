import java.lang.Thread;
import java.util.Random;
public class Question3 {
	public static void main(String[] args){
		Random rand = new Random();
		int Vector[][] = new int[10][10];
		int j=0;
		for(int i=0 ; i< 100;i++){
			if(i%10==0 && i!=0){
				j++;
			}
			Vector[j][i%10] = rand.nextInt(500);
		}
		
		System.out.printf("\n\n\n");
		
		Runnable r0 = new AePrime(Vector[0]);
		Runnable r1 = new AePrime(Vector[1]);
		Runnable r2 = new AePrime(Vector[2]);
		Runnable r3 = new AePrime(Vector[3]);
		Runnable r4 = new AePrime(Vector[4]);
		Runnable r5 = new AePrime(Vector[5]);
		Runnable r6 = new AePrime(Vector[6]);
		Runnable r7 = new AePrime(Vector[7]);
		Runnable r8 = new AePrime(Vector[8]);
		Runnable r9 = new AePrime(Vector[9]);
		Thread t0 = new Thread(r0);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		Thread t7 = new Thread(r7);
		Thread t8 = new Thread(r8);
		Thread t9 = new Thread(r9);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
		
	}
}


class AePrime implements Runnable {
	private int Vector[];
	public AePrime(int vector[]){
		setVector(vector);
	}
    public static boolean checkPrime(int n) {
        int primes55[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,
                          53,59,61,67,71,73,79,83,89,97,101,103,107,
                         109,113,127,131,137,139,149,151,157,163,
                         167,173,179, 181,191,193,197,199,211,223,
                         227,229,233,239,241,251,257};
 
        for(int i=0;i < 55;i++) {
        if (n % primes55[i] == 0) {
            if (n == primes55[i]) {
                return true;
            }
            else {
                return false;
            }
        }
        }
 
        int maxtest = n/16;
 
        for(int i=259; i < maxtest; i+=2)
            if (n % i == 0)
                return false;
 
        return true;
    }
	public int[] getVector() {
		return Vector;
	}
	public void setVector(int vector[]) {
		Vector = vector;
	}
	public void run() {
		for(int i = 0 ; i<10 ; i++){
			if(checkPrime(Vector[i])){
				System.out.printf("%d is Prime\n", Vector[i]);
			}
			else{
				System.out.printf("%d is not Prime\n", Vector[i]);
			}
		}
		
	}
}