class Main{
    public static void main(String []args){
    int a[]={43,23,76,0,34,7};
    Main obj=new Main();
    obj.sort(a,0,a.length-1);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
    //program to perform the sorting algorithm
    void sort(int a[],int l,int r){
       if(l<r){
       int mid=(l+r)/2;
       sort(a,l,mid);
       sort(a,mid+1,r);
       merge(a,l,mid,r);
    }
    }
    
    void merge(int a[],int l,int mid,int r){
       	int n1=mid-l+1;
	int n2=r-mid;
	
	int x[]=new int[n1];
	int y[]=new int[n2];
	
	for(int i=0;i<n1;i++){
	x[i]=a[l+i];
	}
	for(int j=0;j<n2;j++){
	y[j]=a[mid+1+j];
	}
	
	int i=0,j=0,k=l;
	
	while(i<n1 && j<n2){
	 if(x[i]<=y[j])a[k++]=x[i++];
	 else a[k++]=y[j++];
	
	}
	
	if(i>mid)while(j<n2)a[k++]=y[j++];
	
	else while(i<n1)a[k++]=x[i++];
	
    }
    
}
