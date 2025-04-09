#include<stdio.h>
int main() {
int x1,x2,i,ebob,ekok,top,enkucuk;
printf("iki tam sayi giriniz.");
bas1:
scanf("%d %d",&x1,&x2);
if ((x1<=0) || (x2<=0)) {
printf ("pozitif iki tam sayi giriniz");
goto bas1; }

if (x1<x2) enkucuk=x1;
else  enkucuk=x2;

for (i=1;i<=enkucuk;i++) {
if(x1%i==0 && x2%i==0)
ebob=i;}

ekok=(x1*x2)/ebob;
top=ebob+ekok;
printf("%d",top);
return 0;
}
