package threadlec;

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started");
		MyRunnable1 r = new MyRunnable1();
		Thread th = new Thread(r);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Finished");

	}
}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+" Finished");
	}
}


