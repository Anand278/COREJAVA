package threadlec;

public class ThreadCommDemo {

	public static void main(String[] args) {
			Adder1 a = new Adder1();
			Reader1 r = new Reader1(a);
			
			Thread addr = new Thread(a);
			Thread read = new Thread(r);
		
			read.start();
			addr.start();
		//	read.start();
	}
}

class Adder1 implements Runnable{
	int sum;
	boolean flag = false;
	@Override
	synchronized public void run() {
		for(int i=1;i<=1000;i++) {
			sum += i;
			try {
				Thread.sleep(1);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		flag = true;
		notify();
		System.out.println("notified=================");
	}
}

class Reader1 implements Runnable{
	Adder1 ad;
	public Reader1(Adder1 ad) {
		super();
		this.ad = ad;
	}
	@Override
	public void run() {
		synchronized (ad) {
		
		if (!ad.flag) {
			try {
				System.out.println("waiting for notify++++++++");
				ad.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("sum = "+ad.sum);
		}
	}
}