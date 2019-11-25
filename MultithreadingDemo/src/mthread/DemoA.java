package mthread;


public class DemoA extends Thread {
	public void GetFive() {
		for(int i=1;i<=10;i++) {
			
			  try { Thread.sleep(500); } catch (InterruptedException e) {
			  e.printStackTrace(); }
			 
			System.out.println(i+" * 5  = "+5*i);
		}
	}
	
	public void run() {
		GetFive();
	}

}
