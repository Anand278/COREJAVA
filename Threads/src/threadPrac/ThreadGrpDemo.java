package threadPrac;

public class ThreadGrpDemo {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("TG-1");
		Thread th1 = new Thread(tg,new MyRunnable1());
		Thread th2 = new Thread(tg,new MyRunnable1());
		Thread th3 = new Thread(tg,new MyRunnable1());
		
		th1.start();
		th2.start();
		th3.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		tg.stop();
	}

}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName()+" --> "+i);
		}	
	}
}
