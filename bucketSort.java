//program to perform the bucket sort
class Main{
	public static void main(String []args){
		int a[]={34,42,74,57,99,84,9,5};
		int n=a.length;
		Main obj=new Main();
		obj.bucketSort(a,n);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	int max(int a[],int n){
		int max=a[0];
		for(int i=1;i<n;i++){
			if(max<a[i])max=a[i];
		}
		return max;
	}
	void bucketSort(int a[],int n){
		int i,j;
		int max=max(a,n);
		int b[]=new int[max+1];
		for(i=0;i<=max;i++){
			b[i]=0;
		}
		for(i=0;i<n;i++){
			++b[a[i]];
		}
		for(i=0,j=0;i<=max;i++){
			while(b[i]>0){
				a[j++]=i;
				b[i]--;
			}
		}
	}
}
