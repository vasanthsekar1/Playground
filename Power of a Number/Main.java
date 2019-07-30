#include <stdio.h>
#include<math.h>
int main()
{
  	int b,e,i;
  scanf("%d%d",&b,&e);
  if(e>=0)
  {
    i=pow(b,e);
  printf("%d",i);
  }
  else
    printf("Wrong input");
    return 0;
}