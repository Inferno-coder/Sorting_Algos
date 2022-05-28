//program to perform the selection sort
class Main{
	public static void main(String []args){
	int a[]={5,4,3,2,1};
	Main obj=new Main();
	obj.selectionSort(a);
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}
	void selectionSort(int a[]){
		int i,j,min;
		for(i=0;i<(a.length);i++){
			min=i;
			for(j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			//swapping the values
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
}