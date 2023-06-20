#include<iostream>
#include<math.h>
using namespace std;
void d2b(int n)
{
    int ans=0;
    int i =0;
       while(n!=0)
       {
        int digit =n&1;
        ans= (digit * pow(10,i)) +ans;
        n=n>>1;
        i++;
       }
        cout << ans << endl;
    
}
int main()
{
    int num;
    cout << " enter the number :" << endl;
    cin >> num;
    d2b(num);
    return 0;
}