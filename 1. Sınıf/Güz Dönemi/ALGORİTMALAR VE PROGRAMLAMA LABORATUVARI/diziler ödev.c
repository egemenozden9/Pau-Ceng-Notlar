//Egemen ÖZDEN 20253074
#include<stdio.h>

int main()
{ 
int A[20],B[4],i,j,top=0,enkucuk;

   for (i=0;i<20;i++)
   {
   	 scanf("%d",&A[i]);
   }

   for (i=0;i<5;i++)
   {  if (i==0){
   	  enkucuk = A[i];
      }
      if (A[i] < enkucuk){
      enkucuk = A[i];
      }
   }
   B[0]=enkucuk;
   
   for (i=5;i<10;i++)
   {  if (i==5){
   	  enkucuk = A[i];
      }
      if (A[i] < enkucuk){
      enkucuk = A[i];
      }
   }
   B[1]=enkucuk;
   
   for (i=10;i<15;i++)
   {  if (i==10){
   	  enkucuk = A[i];
      }
      if (A[i] < enkucuk){
      enkucuk = A[i];
      }
   }
   B[2]=enkucuk;
   
   for (i=15;i<20;i++)
   {  if (i==15){
   	  enkucuk = A[i];
      }
      if (A[i] < enkucuk){
      enkucuk = A[i];
      }
   }
   B[3]=enkucuk;
   
    for (j=0;j<=3;j++)
	{
		top=top+B[j];
	}
        printf("%d",top);
    
 return 0;    
}