package m2thread;

public class A implements Runnable {
	public void GetA() {
		for(int i=1;i<=10;i++) {
			System.out.println("A : "+i);
		}
	}
	public void run() {
		GetA();
	}

}
