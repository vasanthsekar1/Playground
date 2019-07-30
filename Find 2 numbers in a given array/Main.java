#include<stdio.h>
int main()
{
   int n,i,f_index=-1,s_index=-1,f,s;
   scanf("%d",&n);
   int a[n];
   for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&f,&s);
  for(i=0;i<n;i++)
  {
    if(f==a[i] && f_index==-1)
    {
      f_index=i;
    }
    if(s==a[i] && s_index==-1)
    {
      s_index=i;
    }
  }
    printf("Element 1 index = %d\nElement 2 index = %d",f_index,s_index);
    return 0;
  
}