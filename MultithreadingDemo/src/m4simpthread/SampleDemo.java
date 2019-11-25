package m4simpthread;
import java.util.Scanner;

public class SampleDemo {

	public static void main(String[] args) {
		/*
		 * Thread t1 = new Thread( new Runnable() {@Override public void run() { for(int
		 * i=0;i<10;i++) { System.out.println("Hello"); } }
		 * 
		 * } );
		 */
		/*
		 * Thread t1 = new Thread( () ->{ for(int i=0;i<10;i++) {
		 * System.out.println("Hello"); } } ); t1.start();
		 */
		
		
		  new Thread( () ->{ for(int i=0;i<10;i++) { System.out.println("Hello"); try {
		  Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		  } } ).start();
		  
		  new Thread( () ->{ for(int i=0;i<10;i++) { System.out.println("Hi"); try {
		  Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		  } } ).start();
		 
	}

}
