#include<stdio.h>
int main(){
    int a,b,i,j,count=0;
   
    scanf("%d%d",&a,&b);
    for(i=0;i<a;i++){
      scanf("%d",&j);
       
       if( j% b== 0){
         count++;
     }
    }
 
 printf("%d",count);
 return 0;
}
