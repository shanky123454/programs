#include<iostream>
using namespace std;
void max(int arr1[] , int size)
{
    int greatest = arr1[0];
    int i=1;
    for( i=1; i<size; i++)
    {
        if(arr1[i] > greatest)
        {
         greatest = arr1[i];
        }
   }
    cout << "greatest element is" << greatest << endl;
}
void min(int arr1[] , int size)
{
    int smallest = arr1[0];
    int i=1;
    for( i=1; i<size; i++)
    {
        if(arr1[i] < smallest)
        {
         smallest = arr1[i];
        }
   }
    cout << "smallest element is" << smallest << endl;
}
int main()
{
     int n;
     cout << " enter the number of elemnt in array"<< endl;
     cin >> n;
     int a[n];
     cout<< "enter the elements of the array"<< endl;
     for(int i=0;i<n;i++)
     {
        cin >> a[i];
     }
     cout << "printing the array" << endl;
     for (int i=0; i<n;i++)
     {
        cout<< a[i] << " ";
     }
     cout << endl;
     int size= sizeof(a)/sizeof(int);
     cout << "size is" << size <<" "<< endl;
     min(a,size);
     max(a,size);
     return 0;
}