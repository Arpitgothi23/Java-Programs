import java.util.Scanner;
public class GCD{
	
		static int f(int a[],int n){
						
			int r=a[0];
			for(int i=0;i<n;i++){

			    r= gcd(a[i],r);
			}
			return r;
		}
	  	 static int gcd(int r1,int r2){

      				  if (r1 == 0)
           			 return r2;
       				 return gcd(r2 % r1, r1);
		  }
		
		  public static void main(String args[]){
		 Scanner x=new Scanner(System.in);
		
		 System.out.println("Number of value :");
       		 int n=x.nextInt();
		int a[]=new int[n];
       		for(int i=0;i<n;i++){
       		 	System.out.println("Enter Number"+(i+1));
        		a[i]=x.nextInt();
        		}
		  System.out.println("GCD="+f(a,n));
		}

}