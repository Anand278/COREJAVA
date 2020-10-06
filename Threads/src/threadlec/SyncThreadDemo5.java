package threadlec;

public class SyncThreadDemo5 {
	
	public static void main(String[] args) {
			Adder a = new Adder();
			Reader r = new Reader(a);
			
			Thread addr = new Thread(a);
			Thread read = new Thread(r);
		
			addr.start();
			read.start();
	}
}

class Adder implements Runnable{
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

class Reader implements Runnable{
	Adder ad;
	public Reader(Adder ad) {
		super();
		this.ad = ad;
	}
	@Override
	public void run() {
		System.out.println("sum = "+ad.sum);
		
	}
}