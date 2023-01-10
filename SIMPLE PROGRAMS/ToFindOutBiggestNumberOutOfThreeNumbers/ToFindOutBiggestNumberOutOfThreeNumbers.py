class biggest:

    def __init__(self):
        __a=int(input("ENTER THE FIRST VALUE  :"))
        __b=int(input("ENTER THE SECOND VALUE :"))
        __c=int(input("ENTER THE THIRD VALUE  :"))
        print("THE BIGGEST VALUE IS :",self.check(__a,__b,__c))
        
    def check(self,a,b,c):
        self.a=a
        self.b=b
        self.c=c
        if((a>b)and(a>c)):
            return int(a)
        elif((b>a)and(b>c)):
            return int(b)
        else:
            return int(c)
A=biggest()