package basic;

public class LearnVariable {
	
	
	int a = 5;
	int b = 6;
	
	int c = 5;
	int d = b;
	
	// declare Variable
	int age;
	
	// declare and initialize value
	int salary = 5000;
	
	//Non static global variable
	int number = 50;

	
	//static Global Variable
	static int quantity = 37;
	static int quality = 100;
	static double length = 23.5;
	static double hight = 6;
	
	
	public static void main(String args[]) {
		
		int price = 30;
		/**
		 * global variable
		 * 
		 * 
		 * static global variable
		 */
		System.out.println(LearnVariable.quantity);
		System.out.println(LearnVariable.length);
		System.out.println( HelloWorld.number2);
		System.out.println(LearnVariable.quantity);
		System.out.println(LearnVariable.hight);
		System.out.println(HelloWorld.reciept4);
		System.out.println(HelloWorld.number10);
		
		
		 //Non static global variable
		//create object
		//className objectName = new constructorOfClass()
		
		LearnVariable obj = new LearnVariable();
		System.out.println(obj.salary);
		
		 HelloWorld hrv = new  HelloWorld();
		 System.out.println( hrv.number3);
		 
		 HelloWorld wv = new  HelloWorld();
		 System.out.println(wv.number5);
		 
		 LearnVariable abc = new  LearnVariable();
		 System.out.println(abc.a);
		 
		 LearnVariable xs = new  LearnVariable();
		 System.out.println(xs.age);
		 
		 LearnVariable zx = new  LearnVariable();
		 System.out.println(zx.b);
		 
		 LearnVariable td = new  LearnVariable();
		 System.out.println(td.number);
		 
		 LearnVariable bd = new  LearnVariable();
		 System.out.println(bd.b);
		 
		 
	}
	
	

}
