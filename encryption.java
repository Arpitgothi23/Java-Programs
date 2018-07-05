class encryption{
      public static void main(String args[]){
	
	String pt=args[0],ct="",et="";
 	int key=Integer.parseInt(args[1]);
   
        for(int i=0;i<pt.length();i++)
{
	ct=ct+(char)(pt.charAt(i)+key);

}
 	System.out.println(ct);


	 
        for(int i=0;i<ct.length();i++)
{
	et=et+(char)(ct.charAt(i)-key);

}
 	System.out.println(et);
}
 

}