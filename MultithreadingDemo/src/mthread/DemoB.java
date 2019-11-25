package mthread;

public class DemoB extends Thread {
	public void GetTen() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" * 10 = "+10*i);
		}
	}
	
	public void run() {
		GetTen();
	}

}
