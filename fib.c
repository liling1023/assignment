#include <stdio.h>
int fib(int n)
{ 
   if(n==0||n==1)
	  return n;
  else 
	  return fib(n-1)+fib(n-2);
 
}
void  output(n){
	int i;
	for(i=0;i<n+1;i++)
	{ printf("%d  ",fib(i));
	}
    printf("\n");
}
int main()
{int n;
 printf("������һ������:",n);
 scanf("%d",&n);
  if(n<0)
  {
    printf("���������������������",n);
    scanf("%d",&n);
  }
  else
  { printf("��쳲���������Ϊ��");
  }
   output(n);
   return 0;
}
