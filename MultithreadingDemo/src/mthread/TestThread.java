package mthread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println("Main Thread is going to Execute...");
		DemoA oba = new DemoA();
		DemoB obb = new DemoB();
		
		oba.start();
		obb.start();
		
		  try { oba.join(); obb.join(); } catch (InterruptedException e) {
		  e.printStackTrace(); }
		 
		
		System.out.println("Main Thread is going to Exit...");
		

	}

}
