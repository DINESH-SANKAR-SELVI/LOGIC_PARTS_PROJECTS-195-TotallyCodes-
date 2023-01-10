#include<iostream>

class oddavg{

    public:
            oddavg(int l){
                int value=0,count=0;

                for(int i=0;i<=l;i++){
                    if((i%2)!=0){
                        value +=i;
                        ++count;
                    }
                }
            std::cout<<"AVERAGE OF LIMIT IS :"<<value/count;
            }
};
int main(){

    int l;

    std::cout<<"ENTER THE LIMIT ";
    std::cin>>l;

    oddavg key(l);

return 0;
}
