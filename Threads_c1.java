package Threads;

/*
 * Chú ý: đối với threads thì có 3 cách để khổi tạo,
 * và mỗi cách được khởi tạo sẽ có một cách để gọi nó thực hiện khác nhau.
 * Tránh nhầm lẫn giữa các cách nhé
 * */

/*Cách khởi tạo 1*/
class runThreads extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello everyone" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				/* Bắt lỗi */
				e.printStackTrace();
			}
		}
	}

}
/*Cách khởi tạo 2*/
class runThreads_01 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am Pham Trung Ky" + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


/*Cách thứ 3 tôi sẽ thể hiện ở bài Threads_c2*/
public class Threads_c1 {

	public static void main(String[] args) {
		
		/*Gọi tới Threads đã tạo ở trên để chạy*/
		runThreads t1 = new runThreads();
		/* Cần phải gọi phương thức start để chạy */
		t1.start();
		Thread t2 = new Thread(new runThreads_01());
		t2.start();
		/*Cách 3*/
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Á hí hí" + i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}

			
		});
		t3.start();
		
	}

}
