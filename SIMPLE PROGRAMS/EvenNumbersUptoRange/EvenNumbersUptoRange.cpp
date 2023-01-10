#include<iostream>

class even{
    public:
        even(int l){
            
            int count=1;
            for(int i=0;i<=l;i++){
                if((i%2)==0){
                    std::cout<<"\t"<<count<<") "<<i;
                    count++;
                    std::cout<<"TOTAL EVEN NUMBER IS "<<count;
        }
    }


        }
};

int main(){

    int l;

    std::cout<<"ENTER THE RANGE :";
    std::cin>>l;

    even key(l);

return 0;
}