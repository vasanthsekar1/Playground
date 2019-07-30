#include<stdio.h>
#include<math.h>
int main()
{
  float o,a,t,h;
  scanf("%f%f",&o,&a);
  t=(o*o)+(a*a);
  h=sqrt(t);
  printf("%.2f",h);
  return 0;
}