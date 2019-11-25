package m2thread;

public class ThreadTest {

	public static void main(String[] args) {
		A oba = new A();
		B obb = new B();
		Thread t1 = new Thread(oba);
		Thread t2 = new Thread(obb);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
