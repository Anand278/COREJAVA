package threadlec;

public class ThreadCommDemo2 {

	public static void main(String[] args) {
			Adder11 a = new Adder11();
			Reader11 r = new Reader11(a);
			
			Thread addr = new Thread(a);
			Thread read = new Thread(r);
		
			addr.start();
			read.start();
	}
}

class Adder11 implements Runnable{
	int sum;
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			sum += i;
			try {
				Thread.sleep(10);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

class Reader11 implements Runnable{
	Adder11 ad;
	public Reader11(Adder11 ad) {
		super();
		this.ad = ad;
	}
	@Override
	public void run() {
		System.out.println("sum = "+ad.sum);
		
	}
}