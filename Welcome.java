class Myclass {
	
	int num;  //instance;
	static int mystaticVar;    //static
	
	public static void main (String[] args) {
		
		int num1=10;  //local 
		String s="Preeti";
	
		System.out.println("My number is :" + num1);
		System.out.println("My Name : "+s);
	}
	 
	 public void print() {
		 
		 System.out.println("mystaticVar : "+mystaticVar);

	}
}

//Local, Instance, Static 