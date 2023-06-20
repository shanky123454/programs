#include<iostream>
using namespace std;
int main()
{
    int num =0;
    cout << "enter the number"<< endl;
    cin>> num;

    int i=1;
    int count =1;
    while(i<=num)
    {
        int j=1;
        while(j<=i)
        {
            cout << count<<" ";
            count++;
            j++;
        }
        cout <<endl;
        i++;
    }
}