package com.cg.demo.multi;

////1. implementing the interface

//public class LambdaDemo implements MyInt {
//
//	public static void main(String[] args) {
//
//		LambdaDemo obj = new LambdaDemo();
//		obj.absMethod();
//	}
//
//	@override
//	public void absMethod() {
//		System.out.println("absMethod");
//	}
//
//}



//2. by anonymous inner class 
//public class LambdaDemo {
//	public static void main(String[] args) {
//		MyInt obj = new MyInt() {
//			@Override
//			public void absMethod() {
//				System.out.println("absMethod");
//			}
//		};
//		obj.absMethod();
//	}
//}




//3. by lambda expression ->
public class LambdaDemo {

	public static void main(String[] args) {
//
//		MyInt obj = (int i ) -> {
//			System.out.println("absMethod");
//
//		};
//		obj.absMethod();

		MyInt obj = (int i ) ->	System.out.println("absMethod");
		obj.absMethod(10);
	}

}
