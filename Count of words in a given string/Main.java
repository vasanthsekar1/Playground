#include<stdio.h>

int main()
{
  char str[100];
  int i,count=0;
  scanf("%[^\n]s",str);
  for(i=1;str[i]!='\0';i++)
        {
    if(str[i]==' ')
    {
          count++;
        }
  }
        count++;

  printf("%d",count);
    return 0;
}