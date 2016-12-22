#include<stdio.h>
#include<conio.h>
void main()
{

    int num;
    printf("enter the no:");
    scanf("%d",&num);
    if(num>0)
        printf("the given number is positive");
    else if(num<0)
        printf("the given number is negative");
    else
        printf("the given number is zero");
    getch();
}
