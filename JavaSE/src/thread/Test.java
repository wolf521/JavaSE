package thread;

public class Test {
	public static void main(String[] args) {
		ThreadSource source = new ThreadSource();
		source.start();
		new Thread(new RunnableSource()).start();
	}
}
