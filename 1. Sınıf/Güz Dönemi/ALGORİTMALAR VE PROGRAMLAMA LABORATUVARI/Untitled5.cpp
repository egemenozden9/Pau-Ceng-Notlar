#include <stdio.h>
#include <conio.h>

int main ()

{
	
	int a=3,b=5,c=-1,x1,x2,x3;
	
	x1 = ((a<b) && !(1));
	x2 = ((a!=c) || (0==1));
	x3 = ((b=c) || (a==3));
	
	printf ("x1 degeri: %d\n",x1);
	printf ("x2 degeri: %d\n",x2);
	printf ("x3 degeri: %d\n",x3);
	
	getch();
	return 0;
	
}
