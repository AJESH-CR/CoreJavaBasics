package m2thread;

public class B extends C implements Runnable {
	public void GetB() {
		for(int i=1;i<=10;i++) {
			System.out.println("B : "+i);
		}
	}
	public void run() {
		GetC();
	}

}
