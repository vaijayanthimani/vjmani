#include<stdio.h>
#include<conio.h>
void main()
{

    int n,i,sum=0;
    printf("enter the no of natural nos to be added:");
    scanf("%d",&n);
    for(i=0;i<=n;i++)
       sum+=i;
    printf("sum=%d",sum);
    getch();
}
