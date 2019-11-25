package m4thread;

public class DemoClass {
	Runnable r1 = new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
			System.out.println(i+" * 2: "+2*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		
	};
	
	Runnable r2 = new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
			System.out.println(i+" * 4: "+4*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	};
	
	Runnable r3 = new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
			System.out.println(i+" * 6: "+6*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	};
	
	Runnable r4 = new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
			System.out.println(i+" * 8: "+8*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	};
	
	Runnable r5 = new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
			System.out.println(i+" * 10: "+10*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	};
	public static void main(String[] args) throws InterruptedException {
		DemoClass d = new DemoClass();
		Thread t1 = new Thread(d.r1);
		Thread t2 = new Thread(d.r2);
		Thread t3 = new Thread(d.r3);
		Thread t4 = new Thread(d.r4);
		Thread t5 = new Thread(d.r5);
		t1.start();t2.start();t3.start();t4.start();t5.start();
		t1.join();t2.join();t3.join();t4.join();t5.join();

	}

}
