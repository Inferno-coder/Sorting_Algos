//program to perform the radix sort
class Main{
	public static void main(String []args){
		int a[]={170,45,75,90,802,24,2,66};
		Main sort=new Main();
		sort.radixSort(a);
	
	}
	void radixSort(int a[]){
		int n=a.length;
		int max=max(a,n);
		for(int pos=1;max/pos>0;pos*=10){
			countingSort(a,n,pos);
		}
			for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
	}
	int max(int a[],int n){
	int max=a[0];
	for(int i=0;i<n;i++){
		if(max<a[i])max=a[i];
	}
	return max;
	}
	void countingSort(int a[],int n,int pos){
	    int b[]=new int[n];
	    int count[]=new int[10];
	    int i;
	 
	    for(i=0;i<n;i++){
	        ++count[(a[i]/pos)%10];
	    }
	    for(i=1;i<10;i++){
	        count[i]=count[i]+count[i-1];
	    }
	    for(i=n-1;i>=0;i--){
	        b[--count[(a[i]/pos)%10]]=a[i];
	    }
	    for(i=0;i<n;i++){
	        a[i]=b[i];
	    }
	}
}
