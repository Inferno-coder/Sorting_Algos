//program to perform the heap sort
class Main{
    public static void main(String []args){
    int a[]={5,4,3,2,1};
    
    Main sort=new Main();
    sort.heapSort(a);
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
    }
    }
    void heapSort(int a[]){
    int i,j;
    int n=a.length;
    for(i=n/2-1;i>=0;i--){
        heapify(a,n,i);
    }
    for(i=n-1;i>0;i--){
    int temp=a[i];
    a[i]=a[0];
    a[0]=temp;
    heapify(a,i,0);
    }
    }
    void heapify(int a[],int n,int i){
    int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 if (l < n && a[l] > a[largest])
            largest = l;
 if (r < n && a[r] > a[largest])
            largest = r;
    if(largest!=i){
    int temp=a[i];
    a[i]=a[largest];
    a[largest]=temp;
    heapify(a,n,largest);
    }
    }
}
