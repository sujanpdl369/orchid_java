package classworks;

public class ThreadExample {
	public static void main(String [] args) {
		MyThread m = new MyThread();
		Thread th = new Thread(m);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		Thread th4 = new Thread(m);
		th.start();
		th1.start();
		th2.start();
		th4.start();
		
		
	}

}
class MyThread implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("i = "+i);
		}
	}
	
}
