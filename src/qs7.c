#include<stdio.h>
int main(){
	int a,b,t,i,c;
	//printf("enter the number of test case: ");
	scanf("%d",&t);
	for(i=0;i<t;i++){
	
	//printf("enter the two number: ");
	scanf("%d%d",&a,&b);
	
	c=a%b;
	printf("%d\n",c);
	c=0;
}
	return 0;
}