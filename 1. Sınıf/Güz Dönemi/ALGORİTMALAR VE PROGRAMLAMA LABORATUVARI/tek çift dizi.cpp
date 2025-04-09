#include <stdio.h>
#include <conio.h>

int main()

{
	int A[25],B[25],x,i=-1,j=-1,k;
	
	for (k=1;k<=50;k++)
	{
		if (k%2==1)
		{i++;
		A[i]=k;}
		
		  else 
		  { j++;
		  B[j]=k;}
	}
	
	printf("Tek sayilar  Cift sayilar \n");
	for (i=0;i<25;i++)
	{
		printf ("%4d%16d\n",A[i],B[i]);
	}
		
	getch();
	return 0;
	
}
