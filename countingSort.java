//program to perform thhe counting sort
class Main{
	public static void main(String []args){
		int a[]={4,2,2,8,3,3,1};
		int n=a.length;
		Main sort=new Main();
		int max=sort.max(a,n);
		sort.countsort(a,n,max);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	int max(int a[],int n){
		int max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max)max=a[i];
		}
		return max;
	}
	void countsort(int a[],int n,int k){
		int i;
		int count[]=new int[k+1];
		int b[]=new int[n+1];
		for(i=0;i<k;i++){
			count[i]=0;
		}
		for(i=0;i<n;i++){
				++count[a[i]];
		}
		for(i=1;i<=k;i++){
			count[i]=count[i]+count[i-1];
		}
		for(i=n-1;i>=0;i--){
			b[--count[a[i]]]=a[i];
		}
		for(i=0;i<n;i++){
			a[i]=b[i];
		}
	}
}

