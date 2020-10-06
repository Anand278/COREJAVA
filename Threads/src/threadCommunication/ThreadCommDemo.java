package threadCommunication;

public class ThreadCommDemo {

	public static void main(String[] args) {
		Adder a = new Adder();
		Reader r = new Reader(a);
		Reader1 r1 = new Reader1(a);
		Thread add = new Thread(a);
		Thread read = new Thread(r);
		Thread read1 = new Thread(r1);
		
		read1.start();
		add.start();
		read.start();
	//	read1.start();
		
	}

}

class Adder implements Runnable{
	int sum;
	boolean flag = false;
	@Override
	synchronized public void run() {
		for(int i=1;i<=1000;i++) {
			sum += i;
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		flag = true;
		notifyAll();
		System.out.println("Notifed++++++++++++++");
	}
	
//	//extra code 
//	int k = 0;
//	for(int j=1;j<=10;j++) {
//		k =+ j;
//	}
//	System.out.println(" random thread ----k : "+k);
//	}
}

class Reader implements Runnable{
	Adder a;

	public Reader(Adder a) {
		super();
		this.a = a;
	}

	@Override
	public void run() {
		synchronized (a) {
			
		if(!a.flag) {
			try {
				System.out.println("waiting for notify ----------");
				a.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("sum = "+a.sum);
		}
	}
}

class Reader1 implements Runnable{
	Adder a;

	public Reader1(Adder a) {
		super();
		this.a = a;
	}

	@Override
	public void run() {
		synchronized (a) {
			
		if(!a.flag) {
			try {
				System.out.println("waiting for notify 1----------");
				a.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("sum 1= "+a.sum);
		}
	}
}