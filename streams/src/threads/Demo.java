package threads;

 class Hi implements  Runnable {
	 public void run() {
		 for (int i =0; i <= 5; i++) {
			 System.out.println("hello");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 }
	
}
 
 class Hello implements  Runnable {
	 public void run() {
		 for (int i =0; i <= 5; i++) {
			 System.out.println("hi");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 }
	
}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();	
		t1.join(); // makes the main thread wait
		t2.join();
		System.out.println("Bye");

	}

}
