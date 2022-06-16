#include<stdio.h>
int main(){
    int T ;
    scanf("%d",&T); // no.of test case
    int a,b;
     for(int i=1;i<=T;++i){
       
    scanf("%d%d",&a,&b);
        printf("%d\n",a+b);
    }
    return 0;

}