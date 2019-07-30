#include <stdio.h>
int main() {
	char n;
  scanf("%c",&n);
  if(n>='A' && n<='Z')
    printf("%c",n+32);
  else if(n>='a' && n<='z')
    printf("%c",n-32);
	return 0;
}