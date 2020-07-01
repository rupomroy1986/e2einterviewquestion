import com.javaprogram.abcDemo;

public class accessModifiers extends abcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abcDemo c1=new abcDemo();
		System.out.println(c1.a);
		
		//System.out.println(c1.b);//as it is default it cant b access from outside the package
		//System.out.println(c1.c); //ypu cannot access method or variables outside the class
		accessModifiers ac=new accessModifiers();
		System.out.println(ac.d);
		System.out.println(ac.e);
	
		
	}

}
