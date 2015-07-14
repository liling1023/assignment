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
 printf("请输入一个整数:",n);
 scanf("%d",&n);
  if(n<0)
  {
    printf("输入错误，请重新输入整数",n);
    scanf("%d",&n);
  }
  else
  { printf("此斐波那契数列为：");
  }
   output(n);
   return 0;
}
