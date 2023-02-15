package classworks;

public class ThreadSleep{
	public static void main(String [] args) {
		Thread th1=new Thread();
		System.out.println("Thread name"+th1.getName());
		
		ThreadS m = new ThreadS();
		Thread th = new Thread(m);
		th.start();
		System.out.println("Thread name is :"+th.getName());
	}

}

class ThreadS implements Runnable{
	
	@Override
	public void run() {
		try {
			for(int i=1; i<=10;i++) {
				System.out.println("Thread Sleep:"+i);
				Thread.sleep(1000);
				Thread t = new Thread();

			}
		}
		catch(Exception ex) {
			System.out.println("Exception found:"+ex);
		}
	}
	
}
