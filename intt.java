package interfa;

interface demo22
{
	void disp();
	default void show() {
		System.out.println(" i am in interface");
	}
}

class demo23 implements demo22
{

	
	public void disp() {
		
		System.out.println("i am inherited");
	}
	
}








public class intt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo23 ddd= new demo23();
		ddd.disp();
		ddd.show();
	}

}
