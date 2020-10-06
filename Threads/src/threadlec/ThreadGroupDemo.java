package threadlec;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("g1");
		
		Thread t1 = new Thread(tg,new MyRunnable());
		Thread t2 = new Thread(tg,new MyRunnable());
		Thread t3 = new Thread(tg,new MyRunnable());
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tg.stop();
	}

}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}
}