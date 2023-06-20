#include<iostream>
using namespace std;
void sum(int num)
{
    int ans =0;
    while(num!=0)
    {
        int digit = num%10;
        ans = digit + ans;
        num =num/10;
    }
    cout << ans << endl;
}
int main()
{
    int num=0;
    cout << "enter the number\n"<<endl;
    cin >> num;
    sum(num);
    return 0;
}