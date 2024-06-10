#include <stdio.h>
void merge(int arr[],int low,int mid,int high)
{
    int i,j,k;
    int B[high-low+1];
    i=low;
    j=mid+1;
    k=0;
while(i<=mid && j<=high)
{
    if(arr[i]<arr[j])
    {
        B[k++]=arr[i++];
    }else{
        B[k++]=arr[j++];
    }
}
while(i<=mid)
{
    B[k++]=arr[i++];
}
while(j<=high)
{
    B[k++]=arr[j++];
}
for(i=low , k=0 ; i<=high ; i++ , k++)
{
    arr[i]=B[k];
}
}

void mergesort(int arr[],int low, int high)
{
  if (low < high)
  {
    int mid=(low+high)/2;
    mergesort(arr,low,mid);
    mergesort(arr,mid+1,high);
    merge(arr,low,mid,high);
  }

}
int main(){
    int arr[7]={4,6,8,3,2,2,1};
    mergesort(arr,0,6);
    for(int i=0; i<7;i++){
        printf("%d",arr[i]);
    }
    return 0;
}
