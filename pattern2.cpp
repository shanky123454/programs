#include<iostream>
using namespace std;
int main()
{
    int num =0;
    cout << "enter the number"<< endl;
    cin>> num;

    int i=1;
    //int count =1;
    while(i<=num)
    {
        int j=1;
        int a=i;
        while(j<=i)
        {
            cout << a<<" ";
            //count++;
            a++;
            j++;
        }
        cout <<endl;
        i++;
    }
}