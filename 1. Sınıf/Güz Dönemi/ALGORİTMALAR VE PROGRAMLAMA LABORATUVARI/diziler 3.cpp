#include <stdio.h>
#include <conio.h>

int main()
{
   int A[6],i;
	
	for (i=1; i<=6; i++)
	{
		printf ("%d. ogrencinin notunu giriniz: ",i);
		scanf ("%d", &A[i]);
	}
	printf ("%s%14s\n", "Ogrenci", "Notu");
	for (i=0; i<6;i++)
	{
		printf ("%3d%16d\n", i+1,A[i]);
	}
		
	getch();
	return 0;
}
