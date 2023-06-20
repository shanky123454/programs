#include<iostream>
using namespace std;

     void cal(int num1)
    {
        int num = num1;
        int choice =1;
         int rs100 =0;
         int rs50=0;
         int rs20=0;
         int rs1=0;
        //cout << "enter the choice\n" << endl;
        //cin >> choice;
        switch(choice)
        {
            case 1 : rs100= num/100;
                     num=num%100;
                     cout << "no: of rs100 is :" << rs100<< endl;

            case 2 : rs50 = num/50;
                     num=num%50;
                     cout<< " no: of rs50 is "<< rs50 <<endl;

            case 3 : rs20= num/20;
                    num=num%20;
                    cout << " no: of rs20 is :" << rs20 << endl;

            case 4 : rs1= num/1;
                        num=num%1;
                        cout << "no of rs1 is:" << rs1 << endl;

        }
        cout << "total no of notes is :" << rs100+ rs50+ rs20+ rs1 << endl;
    }

int main()
{
    int num=0;
    cout << " enter the number or rupya\n" <<endl;
    cin >> num;
     cal(num);
}
