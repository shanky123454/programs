#include<iostream>
using namespace std;

void cal (int c, int d )
{
    int ans =1;
    int i=1;
    for (int i =1; i <= d; i++)
    {
        ans = ans * c;
    }
    cout << "ans is :" << ans<< endl;
}
int main(){
    int a,b=0;
    cout << "enter the number:" << endl;
    cin >> a >> b;
    cal(a,b);


}