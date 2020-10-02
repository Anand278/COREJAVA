package threadlec;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("main Method");
		MyThread th = new MyThread();
		th.start();
		System.out.println("finished Method");

	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}


