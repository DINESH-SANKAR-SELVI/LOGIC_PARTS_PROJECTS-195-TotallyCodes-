#include<iostream>

class multi{
    public:
        multi(){
        
        	int i,j,result,t,l;
        
        	std::cout<<"ENTER THE TILL TABLE   : ";
        	std::cin>>t;
        	std::cout<<"ENTER THE LENGTH TABLE : ";
        	std::cin>>l;
            
             for(i=1;i<=l;i++){
             	for(j=1;j<=t;j++){
             		result=process(i,j);
		        std::cout<<i<<"X"<<j<<"="<<result<<" ";
		}
		std::cout<<std::endl;
	     }
        }
        int process(int ,int);
};
int multi::process(int i,int j){

    return i*j;
}

int main(){
    multi s;
return 0;
}
