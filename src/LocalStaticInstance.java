
public class LocalStaticInstance {
	String name;
	String address; // instance variables
	/*
	 * static String city="BANGALORE"; static int i=0;
	 */

	static String city;
	static int i;
	static {
		city = "BANGALORE";
		i = 0;
	}

	/*
	 * public LocalStaticInstance(String name, String address, String city) {
	 * this.name = name; this.address = address; // local variables, used this to
	 * declare the variable globally. this.city = city; }
	 */

	public LocalStaticInstance(String name, String address) {
		this.name = name;
		this.address = address; // local variables, used this to declare the variable globally.
		i++; // if we dont give static, everytime new object will created and the value will
				// be initialized from the beginning.
				// if we give static, it will increment it.
		System.out.println(i);

	}

	public String getData() {
		return address;
	}

	public void getDataOne() {
		System.out.println(address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LocalStaticInstance l = new LocalStaticInstance("rupom", "munnekolala",
		 * "bangalore"); LocalStaticInstance l1 = new LocalStaticInstance("victor",
		 * "wipro gate", "bangalore");
		 */
		LocalStaticInstance l = new LocalStaticInstance("rupom", "munnekolala");
		LocalStaticInstance l2 = new LocalStaticInstance("victor", "wirpo gate");
		/*
		 * System.out.println(l.address); System.out.println(l1.address);
		 * l.getDataOne(); l1.getDataOne();
		 */
		l.getDataOne();
		l2.getDataOne();
		System.out.println(LocalStaticInstance.city);

	}

}
