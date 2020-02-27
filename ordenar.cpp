#include <iostream>
#include <stdlib.h>
#include <vector>
using namespace std;

void intercambiar(int& x, int& y)
{
	int aux = x;
	x = y;
	y = aux;
}

void ordIntercambio(int a[], int n)
{
	int i, j;
	
	for(i = 0; i < n-1; i++)
	{
		for(j = i; j < n; j++)
		{
			if(a[i] > a[j])
			{
				intercambiar(a[i], a[j]);
			}
		}
	}
}

int main()
{
	int vector[] = {2,1,4,3,5};
	int x, y;
	int z = 5;
	intercambiar(x, y);
	ordIntercambio(vector, z);
	for(int i = 0; i<5; i++)
	{
		cout<<vector[i];
	}
	return 0;
}

