//program to implement the quick sort---------------Inferno-Coder
class Main{
	public static void main(String[]args){
	Main obj=new Main();//creating an object for an Main class
	int arr[]={5,4,3,2,1};
	obj.quickSort(arr,0,arr.length-1);
	System.out.println("The Sorted Array is:");
	for(int i=0;i<arr.length;i++){//printing the array in the console
	    System.out.print(arr[i]+" ");
	}
	}
	//methid to perform the quickSort
	public void quickSort(int arr[],int l,int r){
	if(l<r){
	int mid=partition(arr,l,r);
	quickSort(arr,l,mid-1);
	quickSort(arr,mid+1,r);
	}
	}
	//method to get the mid position of the array
	int partition(int a[],int l,int r){
	int pivot=a[r];
	int i=l-1;
	for(int j=l;j<=r-1;j++){
	if(a[j]<pivot){
	i++;
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	int temp=a[i+1];
	a[i+1]=a[r];
	a[r]=temp;
	return i+1;//returning the mid value
	}
}





