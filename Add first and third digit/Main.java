#include<stdio.h>
int main()
{
 int n,add,first,last;
  scanf("%d",&n);
  first=n/100;
  last=n%10;
  add=first+last;
  printf("%d",add);
  return 0;
}