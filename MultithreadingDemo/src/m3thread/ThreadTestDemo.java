package m3thread;

public class ThreadTestDemo {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i+"  * 2: "+2*i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
		};
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i+"  * 4: "+4*i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
		};
		
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i+"  * 8: "+8*i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();t2.start();t3.start();
		try {
			t1.join();t2.join();t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
