package threadlec;

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("main Method");
		MyRunnable r = new MyRunnable();
		Thread th = new Thread(r);
		th.start();
		System.out.println("finished Method");

	}
}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}


