class even:
    def __init__(self):

        n= int(input("ENTER THE LIMT TO FIND EVEN : "))
        self.even1(n)
    def even1(self,n):
        self.n=n
        count=1
        for i in range(0,n+1,1):
            if ((i%2)==0):
                print(count,") ",i)
                count+=1

key = even()