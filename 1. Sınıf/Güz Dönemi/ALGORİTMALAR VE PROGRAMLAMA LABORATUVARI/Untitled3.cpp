#include <stdio.h>
#include <conio.h>

int main()

{
	
int x,y;
printf("Iki sayi giriniz: ");
scanf ("%d %d",&x,&y);
printf ("Toplam: %d\n", x + y);
printf ("Fark: %d\n", x - y);
printf ("Carpim: %d\n", x * y);	
printf ("Bolum: %d\n", x / y);
printf ("Mod: %d\n", x % y);
	
getch();
return 0;

}
