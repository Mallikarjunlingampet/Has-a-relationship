package interfa;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		banks b1 = new banks("savings", "HYD");
		banks b2 = new banks("savings", "NZB");
		banks b3 = new banks("savings","KMR");
		
		banks b[]= new banks[1];
		b[0]=b1;
		
		banks ab[]= new banks[2];
		ab[0]=b1;
		ab[1]=b3;
		
		customers c= new customers("Mallik", 28, b);
		c.disp();
		
		customers c11 = new customers("Hari", 21,ab);
		c11.disp();
		

	}

}
