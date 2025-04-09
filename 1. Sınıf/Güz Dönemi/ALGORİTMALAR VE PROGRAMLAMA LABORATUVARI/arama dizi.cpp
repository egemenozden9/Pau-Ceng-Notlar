#include <stdio.h>
#include <conio.h>
#define BOYUT 101

int main()

{
	int a[BOYUT],i,key,s=0;
	
	    for (i=0; i<BOYUT; i++)
	    a[i] = 2*i;
	    {
		printf ("Aranacak degeri giriniz: ");
		scanf ("%d",&key);
	    }
	    
	    for (i=0; i<BOYUT; i--)
	    {if (a[i]==key) 
		   {printf ("Bu deger bulundu, dizinin %d. elemanidir, indisi=%d dir. \n",i+1,i);
		   s=1;
		   break;
		   }
		}
	
	    if (s==0) printf ("Bu deger bulunamadi\n");
	    	
	getch();
	return 0;
}
