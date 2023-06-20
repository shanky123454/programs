#include<iostream>
using namespace std;
void swap_alt(int b[], int size)
{
        int swap;
        for(int i=0; i<size;i+=2)
        {
            if(i<=size-2)
            {
            swap = b[i];
            b[i]= b[i+1];
            b[i+1]=swap;
            }
        }
        for(int i=0; i<size;i++)
        {
            cout << b[i]<< endl;
        }
   // System.out.println

}
int main()
{
    cout << "enter the size of the array\n"<< endl;
    int num=0;
    cin >> num;
    int a[num];
    cout << "enter the elemnts of the array\n" << endl;
    for(int i=0; i<num;i++)
    {
        cin >> a[i];
    } 
    int size = sizeof(a)/sizeof(int);
    cout << "size is :" << size << endl;
    cout << "elemnts of the array is"<< endl;
    for(int i=0; i<size;i++)
    {
        cout << a[i] << " "<< endl;
    }
    swap_alt(a,size);
    return 0;
}
