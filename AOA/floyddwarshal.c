#include<stdio.h>

#define INF 9999

int main(){
    int arr[4][4] = {
        {0, 3, INF,5},
        {2, 0, INF,4},
        {INF, 1, 0, INF},
        {INF, INF,2, 0}
    };
    int n = 4;
    for(int k=0; k<n; k++)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i][k] + arr[k][j] < arr[i][j])
                    arr[i][j] = arr[i][k] + arr[k][j];
            }
        }
    }
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
 return 0;
}