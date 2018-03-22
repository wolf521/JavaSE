package thread;

public class RunnableSource implements Runnable{

	@Override
	public void run() {
		System.out.println("开启另一个线程");	
	}
}
