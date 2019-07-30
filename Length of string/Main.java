#include<stdio.h>
int main()
{
  int len,i;
  char str[100];
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++);
  printf("%d",i);
  return 0;
}