package com.cg.demo.multi;

public class DeomonThread extends Thread {
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");

		} else {

			System.out.println("non-daemon thread");

		}
	}

	public static void main(String[] args) {

		DeomonThread t1 = new DeomonThread();

		DeomonThread t2 = new DeomonThread();

		t1.setDaemon(true);

		t1.start();

		t2.start();

	}

}

//public class DeomonThread extends Thread  {
//	public void run() {
//		System.out.println("Thread is running");
//
//	}
//
//public static void main(String[] args) { MtDemo13 t1 = new MtDemo13();
//
//t1.start();
//
//// IllegalThreadState Exception (Call method t1 before thread so error)
//
//t1.setDaemon (true);

//Methods for daemon threads:

//*setDaemon (boolean status): used for making a user thread to Daemon thread or vice versa.  
//*It can only be called before starting the thread. Else it throws IllegalThreadState Exception.
//*isDaemon(): used for checking the status of a thread.
//