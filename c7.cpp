#include<iostream>
using namespace std;
#include<math.h>
void b2d(int num)
{
    int ans =0;
    int i=0;
    while(num!=0)
    {
        int digit =num%10;
      if(digit==1)
      {
        ans= ans + pow(2,i);
      }
      i++;
       num=num/10;
    }
    cout << ans << endl;
}
int main()
{
    int number =0;
    cout << "enter the number :" << endl;
    cin >> number;
    b2d(number);
}