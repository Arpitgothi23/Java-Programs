class cal{

		static int addition(int a,int b){
		return (a+b);
		}
	
		static int substraction(int a,int b){
		return (a-b);
		}

		static int multiplaction(int a,int b){
		return (a*b);
		}

		static int division(int a,int b){
		return (a/b);
		}


	public static void main(String args[]){

		int a =Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
		char c=args[2].charAt(0);
		
		
		if(a>=0 && b>=0){
		switch(c){
		
			case '+': System.out.println("Addition of value is\t"+addition(a,b));
				 break;
			case '-': System.out.println("Substraction of value is\t"+substraction(a,b));
				 break;
			case '*': System.out.println("Multiplaction of value is\t"+multiplaction(a,b));
				 break;
			case '/': System.out.println("Division of value is\t"+division(a,b));
				 break;
			default : System.out.println("Invalid Value");
				
				
		}
		}
		else{

		System.out.println("Invalid details");

		}
		

}		

}