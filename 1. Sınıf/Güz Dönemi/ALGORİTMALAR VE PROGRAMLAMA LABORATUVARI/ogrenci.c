#include<stdio.h>
int main(){
 
int a,b,i,obeb,okek,top;
    bas:
    printf("Pozitif iki tam sayi giriniz: \n");
    scanf("%d %d",&a,&b);
    
    if ((a<=0) || (b<=0)) {
	printf ("Negatif sayi girdiniz, lutfen tekrar giriniz: \n");
    goto bas;  }
     
    for(i=1; i<=a && i<=b; ++i) {
        if(a%i==0 && b%i==0)
            obeb = i; }

    okek = (a*b)/obeb;
    top = obeb+okek;
    printf("%d",top);

return 0;    
}
