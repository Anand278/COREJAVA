package threadlec;

public class SyncThreadDemo {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread().getName()+" Started");
			PrintMessage pm = new PrintMessage();
			MyRunnable3 r = new MyRunnable3(pm);
			Thread th1 = new Thread(r);
			Thread th2 = new Thread(r);
			th1.start();
			th2.start();
			System.out.println(Thread.currentThread().getName()+" Finished");

		}
	}

	class MyRunnable3 implements Runnable{
		PrintMessage p;
		 MyRunnable3(PrintMessage p) {
			this.p = p;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" Started");
			p.printmsg();
			System.out.println(Thread.currentThread().getName()+" Finished");
		}
	}

	class PrintMessage{
		synchronized void printmsg() {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":-"+i);
			}
		}
	}

