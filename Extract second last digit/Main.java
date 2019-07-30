#include<stdio.h>
int main()
{
  int n,num,last;
  scanf("%d",&n);
  num=n%100;
  last=num/10;
  printf("%d",last);
  return 0;
}