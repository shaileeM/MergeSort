package mergeSort;

public class mergeSort {
	  int mid = 0;
	
	public void divide(int[] arr,int l, int r)
	{
		if(l<r)
		{
			mid = l+(r-l)/2;
			divide(arr,l,mid);
			divide(arr,mid+1,r);
			
			merge(arr,l,r,mid);
			
		}
	}
      
	public void merge(int[] arr,int l, int r, int mid) {
		//find sizes of 2 sub arrays which are to be merged
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		//create 2 array of above size
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		//copy data to above arrays
		for(int i =0;i<arr1.length; i++) {
			arr1[i]=arr[l+i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = arr[mid+1+i];
		}
		
		//Merge both arrays
		int x =0;
		int y = 0;
		//Starting index of merged array
		int k = l;
		while(x<arr1.length && y < arr2.length)
		{
			if(arr1[x]<arr2[y])
			{
				arr[k]= arr1[x];
				x=x+1;
			}
			else
			{
				arr[k]=arr2[y];
				y = y+1;
			}
			k= k+1;
				
		}
		//if one of the array is left(being large)
		while(x<arr1.length)
		{
			arr[k]= arr1[x];
			x=x+1;
			k = k+1;
		}
		while(y<arr2.length)
		{
			arr[k]= arr2[y];
			k=k+1;
			y=y+1;
		}
		
		
	}
	
	public void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
      
      public static void main(String[] args)
      {
    	  int[] arr = {38,27,43,3,9,82,10};
    	  int l = 0;
    	  int r = arr.length-1;
    	  mergeSort ms = new mergeSort();
    	  ms.divide(arr,l,r);
    	  ms.printArr(arr);
    	  
    	  
      }
      
}
