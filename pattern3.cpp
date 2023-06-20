#include<iostream>
using namespace std;
int main()
{
    int num =0;
    cout << "enter the number"<< endl;
    cin>> num;
    int i=1;
    char a ='A';
    while(i<=num)
    {
         int j =1;
    while(j<=num)
    {
        cout<< char(a) << " ";
        j++;
        //a++;
    }
    cout << endl; 
    i++;
    a++;
    }
}