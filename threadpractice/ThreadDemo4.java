package threadlec;

public class ThreadDemo4 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started");
		MyRunnable2 r = new MyRunnable2();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName()+" Finished");

	}
}

class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":-"+i);
		}
		System.out.println(Thread.currentThread().getName()+" Finished");
	}
}


