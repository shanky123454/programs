#include<iostream>
using namespace std;
void reverse(int arr[], int len)
{
    int i=0;
    int j=len-1;
    int temp;
    for(i,j;i<=j;i++,j--)
    {
        //swap(arr[i],arr[j]);
       
         temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        // i++;
        //j--;
    }

 cout << " after revrsing " << endl;
    for(int k=0; k<len ;k++)
    {
        cout << arr[k] << endl;
    }

}
int main()
{
    int num;
    cout << "enter the number of elements in array" << endl;
    cin >> num;
    int a[num];
    //Arrays.sort();
    //System.arraycopy();
    //int[] b = a.clone();
    //Arrays.copyOf();
    //Arrays.copyOfRange();
    //Arrays.deepEquals();
    //Arrays.equals();
    //Arrays.toString();
    cout << "enter the elements of the array\n" << endl;
    for(int i=0; i< num; i++)
    {
        cin >> a[i];
    }
    cout << " printing the elements of the array\n" << endl;
    int length= sizeof(a)/sizeof(int);
    for(int i=0; i<length; i++)
    {
        cout << a[i] << endl;
    }
    reverse(a,length);
}