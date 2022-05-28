//program to perform bubble sort
public class Main{
	public static void main(String []args){
		int a[]={5,4,3,2,1};
		Main obj=new Main();
		obj.bubbleSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	void bubbleSort(int a[]){
		int i,j;
		for(i=0;i<a.length-1;i++){
			for(j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
