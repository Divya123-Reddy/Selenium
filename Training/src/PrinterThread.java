
public class PrinterThread extends Thread {
	public void run() {
		
	}
	
	public void print(int n) {
		System.out.println("printing the table...");
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
