#include<iostream>

class ToFindOutBiggestNumberOutOfThreeNumbers
{
public:
    int bigger(int a,int b,int c);
};
int ToFindOutBiggestNumberOutOfThreeNumbers::bigger(int a,int b,int c){
        if((a>b)&&(a>c)){return a;}

        else if((b>a)&&(b>c)){return b;}

        else{return c;}
}

int main(){

     ToFindOutBiggestNumberOutOfThreeNumbers key;

    int a[4],p;

    for(int i=1;i<=3;i++){
        printf("ENTER THE %d VALUE ",i);
        scanf("%d",(a+i));
    }
    p = key.bigger(*(a+1),*(a+2),*(a+3));

    std::cout<<"THE BIGGEST VALUE IS : "<<p;

return 0;
}
