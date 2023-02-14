import math

class ArmstrongNumber:
    input = 0
    def __init__(self,ip):
        self.ip = ip
        self.input = ip
    
    def armstrongNumber(self):
        output = self.input
        input1 = 0
        finalPut = 0
        while (True):
            if(output>9) :
                input1 = output % 10
                output = output / 10
                input1 = int(math.pow(input1, 3))
                finalPut = finalPut + input1
            else:
                input1 = output
                input1 = int(math.pow(input1,3))
                finalPut = finalPut + input1
                break
        if(self.input == finalPut):
            return True 
        else:
            return False
    
iput =int(input("ENTER THE INPUT : "))
a = ArmstrongNumber(iput)

if(a.armstrongNumber()):
    print("It's a Armstrong Number : ",a.input)
else:
    print("It's Not a Armstrong Number : ",a.input)