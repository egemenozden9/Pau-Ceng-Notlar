#include <stdio.h>
#include <conio.h>

int main()

{
	
int a,b,c;
printf ("Birinci kenari giriniz: ");
scanf("%d",&a);
printf ("Ikinci kenari giriniz: ");
scanf("%d",&b);
printf ("Ucuncu kenari giriniz: ");
scanf("%d",&c);

 if ((a==b) && (b==c)) printf ("Eskenar ucgendir\n");
   else if ((a!=b) && (b!=c) && (a!=c)) printf ("Cesitkenar ucgendir.");
       else printf ("Ikizkenar ucgendir.");
       
getch();
return 0;

	
}
