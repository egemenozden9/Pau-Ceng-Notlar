#include <stdio.h>
#include <conio.h>

int main()

{
	int A[5],B[5],C[5],i;
	
	printf ("A dizisinin elemanlarini giriniz: \n");
	for (i=0; i<5; i++) {
	printf ("%d. elemani giriniz: ",i+1);
	scanf ("%d",&A[i]);
    } printf ("\n");
	
	printf ("B dizisinin elemanlarini giriniz: \n");
	for (i=0; i<5; i++) {
    printf ("%d. elemani giriniz: ",i+1);
	scanf ("%d",&B[i]);
	} printf ("\n");
	
	for (i=0; i<5; i++)
	C[i]=A[i]+B[i];
	
	printf ("C dizisini elamanlari asagidadir: \n");
	for (i=0;i<5;i++)
	printf ("C dizisinin %d. elemani: %d \n",i+1,C[i]);
		
	getch();
	return 0;
}
