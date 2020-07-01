
public class Encapsulations {
	
	private int i=10;

	public int getI() {
		System.out.println(i);
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulations e=new Encapsulations();
		e.setI(50);
         e.getI();

}}
