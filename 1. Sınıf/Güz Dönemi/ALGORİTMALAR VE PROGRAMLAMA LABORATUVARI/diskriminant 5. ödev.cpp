//Egemen Özden 20253074
#include <stdio.h>
float diskriminant_hesapla(float a,float b,float c,float d);
int main()
{
	float a,b,c,d,Q,R,D;
	scanf("%f",&a);
	scanf("%f",&b);
  	scanf("%f",&c);
	scanf("%f",&d);
	
	D=diskriminant_hesapla(a,b,c,d);
	{
	if (D>0)      printf ("1");
	else if (D=0) printf ("2");
	else          printf ("3");
    }
	return 0;
}

    float diskriminant_hesapla(float a,float b,float c,float d)
    { float Q,R,D;
	Q=(3*a*c-b*b)/(9*a*a);
	R=(9*a*b*c)-(27*a*a*d)-(2*b*b*b);
	D=(Q*Q*Q)+(R*R);
	return D;
    }
    
