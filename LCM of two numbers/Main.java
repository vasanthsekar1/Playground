#include<stdio.h>
int main()
{
  int n1,n2,hcf,lcm,small,i;
  scanf("%d%d",&n1,&n2);
 small=n1>n2?n2:n1;
  for(i=small;i>=1;i--)
  {
    if(n1%i==0 && n2%i==0)
    {
     hcf=i;   
      break;
    }
  }    
    
    lcm=(n1*n2)/hcf;
    printf("%d",lcm);
   return 0;
}