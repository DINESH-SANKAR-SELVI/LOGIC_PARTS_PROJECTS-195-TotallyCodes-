#include<iostream>

class netsal{
public:
    void input();
    int process();

};
int *net;

int main(){

    char d='y';

    net =(int *) std::calloc(8,sizeof(int));

    netsal key;

    do{

        key.input();

        std::cout<<"\nDO YOU CONTINUE AGAIN..!(Y/N):";
        std::cin>>d;

    }while(d=='y');


return 0;
}

void netsal::input(){

    for(int i=0;i<8;i++){

        switch(i)
        {
        case 0 :
            printf("ENTER THE BASIC SALARY :-");
            scanf("%d",net+i);
            break;
        case 1 :
            printf("ENTER THE HRA SALARY :-");
            scanf("%d",net+i);
            break;
        case 2 :
            printf("ENTER THE PF :-");
            scanf("%d",net+i);
            break;
        case 3 :
            printf("ENTER THE INSURENCE :-");
            scanf("%d",net+i);
            break;
        case 4 :
            printf("ENTER THE BOUNS :-");
            scanf("%d",net+i);
            break;
        case 5 :
            printf("ENTER THE TA SALARY :-");
            scanf("%d",net+i);
            break;
        case 6 :
            printf("ENTER THE FBPA SALARY :-");
            scanf("%d",net+i);
            break;
        case 7 :
            printf("ENTER THE INCOMETAX SALARY :-");
            scanf("%d",net+i);
            break;
        default:
            printf("OUT OF RANGE....!");
            break;
        }
    }
    int result=process();
    printf("THE VALUE OF NET SALARY IS %d",result);
}
int netsal::process(){

    return (*(net+0)+*(net+1)+*(net+4)+*(net+5)+*(net+6)-(*(net+2)+*(net+3)+*(net+7)));
}
