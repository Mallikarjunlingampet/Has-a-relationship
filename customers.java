package interfa;

public class customers {
	private String name;
	private int age;
	
	private banks[] banks;

	public customers(String name, int age, banks[] bank) {
		super();
		this.name = name;
		this.age = age;
		banks = bank;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public banks[] getBank() {
		return banks;
	}
	public void disp() {
		 System.out.println("=========customer details================");
		 System.out.println("Customer name :: " + name);
		 System.out.println("Customer age  :: " + age);
		 System.out.println(" ");
		 System.out.println("===========Customer's bank details==============");
		 for(banks banks: banks) {
			 System.out.println("Account type :: " + banks.getAcctype());
			 System.out.println("branch name  :: " + banks.getBranchid());
		 }
	 }
	

}
