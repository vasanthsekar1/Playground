#include <stdio.h>
int main() {
	int n,i,temp=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d\n",temp);
    temp=temp+2;
  }
	return 0;
}