class encryption2{
      public static void main(String args[]){
	
	String pt="This is a String",ct="",et="";
 	int key[]={1,2,3,4};
	int l=key.length;
   	

        for(int i=0;i<pt.length();i++)
{
	int c=i%4;

	ct=ct+(char)(pt.charAt(i)+key[c]);

}
 	System.out.println(ct);


	 
        for(int i=0;i<ct.length();i++)
{
	int c=i%4;	
	et=et+(char)(ct.charAt(i)-key[c]);

}
 	System.out.println(et);
}
 

}