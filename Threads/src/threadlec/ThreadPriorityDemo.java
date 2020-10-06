package threadlec;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Counter c = new Counter();
		Thread t = new Thread(c);
		t.setPriority(Thread.NORM_PRIORITY-3);

		Counter c1 = new Counter();
		Thread t1 = new Thread(c1);
		t1.setPriority(Thread.NORM_PRIORITY+3);
		
		t.start();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		c.flag = false;
		c1.flag= false;
		try {
			t.join();
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("count 1 = "+c.count);
		System.out.println("count 2 = "+c1.count);
	}

}

class Counter implements Runnable{
	int count;
	volatile boolean flag = true;
	@Override
	public void run() {
		while(flag) {
		count++;
		}
		
	}
}