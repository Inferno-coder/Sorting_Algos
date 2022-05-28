//program to perform the inserrtion sort
class Main{
	public static void main(String []args){
		int a[]={5,4,3,2,1};
		Main obj=new Main();
		obj.insertionSort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	void insertionSort(int a[]){
		int i,j,temp;
		for(j=1;j<a.length;j++){
			temp=a[j];
			i=j-1;
			while(i>=0 && temp<a[i]){
				a[i+1]=a[i];
				i--;
			}a[i+1]=temp;
		}
	} 
}