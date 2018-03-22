package polymorphic;

public class Pol extends MoreState {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	public void eat() {
		super.eat();
	}
	
	public void drink() {
		System.out.println("ºÈË®");
	}
	
	public static void main(String[] args) {
		MoreState moreState = new Pol();
		moreState.eat();
	}
}