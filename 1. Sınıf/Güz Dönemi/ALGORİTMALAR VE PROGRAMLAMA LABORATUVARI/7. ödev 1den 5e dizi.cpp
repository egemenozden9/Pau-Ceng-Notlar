//Egemen Özden 20253074
#include <stdio.h>
#include <stdlib.h>
int *enuzundizi(int B[10]);

int main(){
	int *A,i,n=10,m,*y;
	int uzunluk;
	
	A = (int*) malloc(sizeof(int)*n);            
	if(A==NULL)
	{exit(1);}
	
	for (i=0;i<n;i++)
	{
	scanf("%d",(A[i])); 
	}
	
	y =int *enuzundizi(int B[10]);
	printf("%d",*y);
	  
return 0;    
}


int *enuzundizi(int A[10])
{
int n,m,x,uzunluk;
int puzunluk = &uzunluk;

	for (int i=0;i<n;i++)
	{
		if (A[i]==1)
		{
		   for(m=n;m>i;i--)
		   {
		   	  if (A[m]==5)
		   	  {
		   	  	 int uzunluk=m-n+1;
		   	  	 puzunluk= &uzunluk
		   	  	 return puzunluk;
			  }
		   }
		}
	}
}
