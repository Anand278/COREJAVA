package threadlec;

public class SyncThreadDemo2 {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread().getName()+" Started");
			PrintMessage1 pm = new PrintMessage1();
			MyRunnable4 r = new MyRunnable4(pm);
			Thread th1 = new Thread(r);
			Thread th2 = new Thread(r);
			th1.start();
			th2.start();
			System.out.println(Thread.currentThread().getName()+" Finished");

		}
	}

	class MyRunnable4 implements Runnable{
		PrintMessage1 p;
		 MyRunnable4(PrintMessage1 p) {
			this.p = p;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" Started");
			synchronized (p) {
				p.printmsg();
			}
			
			System.out.println(Thread.currentThread().getName()+" Finished");
		}
	}

	class PrintMessage1{
		void printmsg() {
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

