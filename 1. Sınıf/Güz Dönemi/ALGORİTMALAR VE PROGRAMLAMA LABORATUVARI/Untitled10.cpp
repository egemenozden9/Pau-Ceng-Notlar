#include <stdio.h>
#include <conio.h>

int main()

{
	int x,top=0,i=0;
	
	bas1:
	printf ("Bir cift tam sayi giriniz.\n");
	scanf ("%d",&x);
	
	if (x<=0) printf ("Pozitif bir sayi giriniz.");
	goto bas1;
 	
	if ((x%2)==1) printf ("Cift sayi giriniz.");
	goto bas1;
    
    //int  i = 1
    
    bas2:
	i=i+2;
    top=top+i;
    if (i%2)==0 top=top+i; 
	printf ("Toplam: %d", top);
	getch();
	return 0;
	
	
	
	
	
}
