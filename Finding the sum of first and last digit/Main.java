#include <stdio.h>
int main() {
	int n,f,l,sum;
  scanf("%d",&n);
  l=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  f=n;
  sum=f+l;
  printf("%d",sum);
	return 0;
}