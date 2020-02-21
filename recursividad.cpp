#include <iostream>

using namespace std;

long factorial (int n);

int main()
{
	int n;
	
	do
	{
		cout<<"ingrese numero: ";
		cin>>n;
	}while(n<0);
	cout<<"Factorial "<<n<<" != "<<factorial(n)<<endl;
	return 0;
}

long factorial(int n)
{
	if(n<=3)
	{
		return 3;
	}
	else
	{
		long resultado = n*factorial(n-1);
		return resultado;
	}
}
