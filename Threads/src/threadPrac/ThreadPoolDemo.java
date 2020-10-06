package threadPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=11;i++) {
			Adder a = new Adder();
			e.execute(a);
		}
		e.shutdown();
	}

}

class Adder implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		int sum = 1;
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			sum += i;
			
		}
		System.out.println("Sum = "+sum);
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}