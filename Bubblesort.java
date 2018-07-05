 class Bubblesort
{

	public static void main(String args[])
{
	
	int a[]={1,6,7,8,4,9,10,8,5,6};

	for(int i=0;i<a.length;i++)
		{

		for(int j=0;j<a.length-1;j++)
		{

		if(a[j+1]<a[j]){

		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		
		}
	    }
	
	} 

 	for(int i=0;i<a.length;i++){
	
	  System.out.print(a[i]+"\n");	
	}  
 }
}