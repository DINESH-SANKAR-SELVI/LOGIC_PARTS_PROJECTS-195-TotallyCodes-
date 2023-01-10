#include<iostream>

class AreaAndPerimeterOfASquareAndRectangle
{
public:
    AreaAndPerimeterOfASquareAndRectangle(int,int);
};

AreaAndPerimeterOfASquareAndRectangle::AreaAndPerimeterOfASquareAndRectangle(int a,int b)
{
    std::cout<<"THE VALUE OF AREA IS "<<a*b<<"THE VALUE OF PERIMETER IS "<<(2*(a+b));

}
int main(){

        int a,b;

        std::cout<<"ENTER THE LENGTH OF RECTANGLE : ";
        std::cin>>a;
        std::cout<<"ENTER THE WIDTH OF RECTANGLE  : ";
        std::cin>>b;

        AreaAndPerimeterOfASquareAndRectangle(a,b);

    return 0;
    }

