package com.cg.demo.multi;

public class ThreadDemo2 implements Runnable {
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

		Thread obj = new Thread(new ThreadDemo2());
		Thread obj2 = new Thread(new ThreadDemo2());
		Thread obj3 = new Thread(new ThreadDemo2());
		obj.start();
		obj2.start();
		obj3.start();
		// obj.printLoop();

	}

}
