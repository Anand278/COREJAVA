package threadPrac;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		PrintMessage p = new PrintMessage();
		MyRunnable r = new MyRunnable(p);
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();
//		try {
//			th1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}

class MyRunnable implements Runnable{
	PrintMessage p;
	MyRunnable(PrintMessage p) {
		this.p = p;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
//		synchronized (p) {
//			p.printMsg();
//		}
		p.printMsg();
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}

class PrintMessage{
	void printMsg() {
	//synchronized void printMsg() {
		System.out.println("=========================");
		synchronized (this) {
			
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
		//System.out.println(Thread.currentThread().getName()+" finished");
		}
	}
}