
class areaAndPerimeter:

    def __init__(self):

        a=input("ENTER THE LENGTH OF RECTANGLE : ")
        b=input("ENTER THE WIDTH OF RECTANGLE  : ")

        a =int(a)
        b =int(b)

        print("THE VALUE OF AREA IS {} AND PERIMETER IS {}".format((a*b),(2*(a+b))))

key = areaAndPerimeter()