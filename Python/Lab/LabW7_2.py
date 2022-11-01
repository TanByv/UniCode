import LabW7_1

def isPrime(num):
    if num > 1:
        for i in range (2, num):
            if (num % i) == 0:
                return False
            else:
                return True
            
print(isPrime(eval(input("Enter number: "))))