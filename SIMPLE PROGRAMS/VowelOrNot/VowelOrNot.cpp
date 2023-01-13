#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    string input="";

    cout<<"ENTER THE SEQUENCE ";
    cin>>input;

    for(int i=0;i<input.length();i++)
    {
        switch(input[i]){

        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            cout<<input[i]<<"  "<<"That Is Vowel"<<endl;
            break;
        default:
            cout<<input[i]<<"  "<<"Not a Vowel"<<endl;
        }
    }
    return 0;
}
