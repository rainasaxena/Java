#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    int i,j;
    int n,m;

    printf("Enter the rows and columns: ");
    scanf("%d %d",&n,&m);

    int arr[n][m];

    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%d",&arr[i][j]);
            
        }
    }

    // for(i=0;i<n;i++){
    //     for(j=0;j<m;j++){
    //         printf("%d   ",arr[i][j]);
    //     }
    //     printf("\n");
    // }

    printf("The diagonal elements are: ");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(arr[i]==arr[j]){
                printf("%d  ",arr[i][j]);
            }
        }
    }
    
    return 0;
}