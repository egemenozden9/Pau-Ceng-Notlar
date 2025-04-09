#include <stdio.h>
#include <conio.h>

int main ()

{
	
int a;
printf ("a degerini giriniz: ");
scanf ("%d",&a);
printf ("Girilen a degeri = %d\n",a);
if (a>20) a++;
   else
     a--;
     
     printf ("Son a degeri = %d",a);
     getch();
     return 0;
	
}	
