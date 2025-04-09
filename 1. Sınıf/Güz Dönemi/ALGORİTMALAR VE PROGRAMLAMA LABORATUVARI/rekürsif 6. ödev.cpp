//Egemen Özden 20253074 (Rekürsif fonksiyonsuz) 
#include <stdio.h>
int main()
{ 
    int a,b,x,i,top=0,enk,enb;

	do{
		scanf("%d",&a);
		scanf("%d",&b);
	}while (a<=0 || b<=0);  //pozitif sayý kontrolü
	scanf("%d",&x);
	
	if (a>b) { 
	enb=a; enk=b;           //for içinde sýnýr deðerleri belirleme
	} else { 
	enb=b; enk=a; 
	}         
           
	if (x==1)  //çift(1) sayilarin toplami
	{
		for (i=enk;i<=enb;i++)
		  if(i%2==0) top+=i;
	}
	
	if (x==0)  //tek(0) sayilarin toplami
	{
		for (i=enk;i<=enb;i++)
		  if(i%2==1) top+=i;
	}
	printf("%d",top);
	return 0;
}
--------------------------------------------------------------------------------
//CELÝL <3
#include<stdio.h>
int fonk(int sayi1,int sayi2,int t){
    if(sayi1>sayi2){
        return 0;
    }
    else if(t==0&&sayi1<=sayi2&&sayi1%2!=0){
       return sayi1+fonk(sayi1+2,sayi2,t);
    }
    else if(t==1&&sayi1<=sayi2&&sayi1%2==0){
        return sayi1+fonk(sayi1+2,sayi2,t);
    }
    else{
        return fonk(sayi1+1,sayi2,t);
    }
}
int main(){
int sayi1,sayi2,t,top;
scanf("%d %d %d",&sayi1,&sayi2,&t);
if(sayi1>sayi2){
    top=fonk(sayi2,sayi1,t);
}
else{
    top=fonk(sayi1,sayi2,t);
}
printf("%d",top);
return 0;    
}
---------------------------------------------------------------------------------
//Egemen Özden 20253074
#include <stdio.h>
int fonk(int a,int b,int x);

int main()
{
	int a,b,x,top=0;
	do{ scanf("%d",&a);         //pozitif sayý kontrolü
		scanf("%d",&b);
	}while (a<=0 || b<=0);
	scanf("%d",&x);
	
	if(a>b){
    top=fonk(b,a,x);
    }
    else{
    top=fonk(a,b,x);
    }
    
    printf("%d",top);
    return 0;    
}

int fonk(int a,int b,int x){
    if(a>b){
        return 0;
    }
    else if(x==0 && a<=b && a%2!=0){
        return a+fonk(a+2,b,x);
    }
    else if(x==1 && a<=b && a%2==0){
        return a+fonk(a+2,b,x);
    }
    else{
        return fonk(a+1,b,x);
    }
}

