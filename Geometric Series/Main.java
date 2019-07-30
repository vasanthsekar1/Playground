#include<stdio.h>
#include<math.h>
int main()
{
  int a,num,b,x;
  scanf("%d",&a);
  if(a%2==0)
  {
     num =a/2;
    x=num-1;
     b=pow(3,x);
    printf("%d",b);
  }
  else
  {
     num =(a+1)/2;
     x=num-1;
     b=pow(2,x);
    printf("%d",b);
  }
  return 0;
}