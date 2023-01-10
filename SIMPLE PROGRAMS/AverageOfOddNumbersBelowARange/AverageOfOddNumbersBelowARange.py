from multiprocessing.sharedctypes import Value


class oddavg:

    def __init__(self):

        global value,count

        limt = int(input("ENTER THE LIMIT :"))

        result=self.process(limt)

        print("THE VALUE IS  :",result)
    def process(self,l):
        self.l=l
        value=0
        count=0
        for i in range(0,l+1,1):
            if((i%2)!=0):
                value+=i
                count+=1
        return value/count;        
key=oddavg()