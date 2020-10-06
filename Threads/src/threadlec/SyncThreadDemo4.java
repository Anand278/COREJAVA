package threadlec;

public class SyncThreadDemo4 {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread().getName()+" Started");
			PrintMessage3 pm = new PrintMessage3();
			MyRunnable5 r = new MyRunnable5(pm);
			Thread th1 = new Thread(r);
			Thread th2 = new Thread(r);
			th1.start();
			th2.start();
			System.out.println(Thread.currentThread().getName()+" Finished");

		}
	}

	class MyRunnable5 implements Runnable{
		PrintMessage3 p;
		 MyRunnable5(PrintMessage3 p) {
			this.p = p;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" Started");
			p.printmsg();
			System.out.println(Thread.currentThread().getName()+" Finished");
		}
	}

	class PrintMessage3{
		void printmsg() {
			System.out.println("==============================");
			synchronized (this) {
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
	}

