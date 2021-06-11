package com.cg.demo.multi;

public class ThreadDemo extends Thread {
	public void printLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i);

		}
	}

	public void run() {
		// TODO Auto-generated method stub
		this.printLoop();

	}

	public static void main(String[] args) {

		ThreadDemo obj = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();

		obj.start();
		obj2.start();
		obj3.start();
// obj.printLoop();

	}

}
