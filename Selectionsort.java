class Selectionsort
{
	public static void main(String[] args)
	{
		int a[]={2,4,1,6,8};
		int min;
		for(int i=0;i<(a.length);i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					int temp=a[j];
					a[j]=a[min];
					a[min]=a[j];
				}
			}
		}
		
		System.out.println("after sorting");
	
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}

		
			
		