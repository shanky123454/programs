#include<iostream>
using namespace std;
int c1( int a)
{
    int count=0;
    while (a!=0)
    {
        if(a&1==1)
        {
            count++;
        }
         a = a>>1;
    }
    return count;
}
int main()
{
    int num1;
    cout << "enter the first number\n" << endl;
    //int num2;
   // cout<< "enter the second number" << endl;
    cin >> num1 ;
    int ans1=c1(num1);
    //int ans2=c2(num2);
    cout << "total set bits is :" << ans1 << endl;
    return 0;
} 
