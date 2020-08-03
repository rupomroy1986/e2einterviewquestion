
public class Overloading {
	
	public int rupom(int a, int b)
	 {
		 return a+b;
				 
	 }
	 
	 public int rupom(int a, int b ,int c)
	 {
		 return a+b+c;
				 
	 }

	public static void main(String[] args) {
		Overloading a=new Overloading();
		   int c   =  a.rupom(10, 20);
		   System.out.println(c);
		
		   int d   =  a.rupom(10, 20,30);
		   System.out.println(d);
		 
		 
	}

}
