#include<stdio.h>
int main()
{
	int n,a,d,l;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    l=(n+1)/2;
    n=a+(l-1)*d;
    printf("%d",n);
  }
  else
  {
    a=0,d=1;
    l=n/2;
    n=a+(l-1)*d;
    printf("%d",n);
  }
return 0;
}