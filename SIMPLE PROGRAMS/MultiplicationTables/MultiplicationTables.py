class multiply:

    def __init__(self):

        no_of_table = int(input("ENTER THE TABLE TILL :"))

        len_of_table = int(input("ENTER THE LENGTH    :"))
        
        self.process(no_of_table,len_of_table)

    def process(self,no_of_table,len_of_table):
        self.__no_of_table=no_of_table
        self.__len_of_table=len_of_table

        for i in range(1,no_of_table+1):
            for j in range(1,len_of_table+1):
                print("{}X{}={}".format(i,j,(i*j)))
            print("\n")
key=multiply()