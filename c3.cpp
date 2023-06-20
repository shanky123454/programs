#include<iostream>
#include<math.h>
using namespace std;
int fact(int n)
{
     if (n==0)
     {
        return 1;
     }
     else{
    int ans=1;
    int i=1;
    for(i=1;i<=n;i++)
    {
        ans = ans*i; 
    }
    return ans;
     }
}
int ncr( int n, int r)
{
    int ans=0;
    if ( n==0 || r==n)
    {
        return 1;
    }
    else if( n < r)
    {
        return 0;
    }
    else {
       ans = fact(n)/ (fact(n-r)*fact(r));
    }
    return ans;
}
int main()
{
    int n=0;
    int r=0;
    cout << "enter the number n:" << endl;
    cin >> n ;
    cout << "enter the number r:" << endl;
    cin >> r;
    int res= ncr(n,r);
    cout << " fact of number is :" << res << endl;
    return 0;
}