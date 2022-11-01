from LabW7_1 import *

cel = eval(input("Enter celsius: "))
print(convert_celsius_to_fahrenheit(cel), "fahrenheit\n")

fer = eval(input("Enter fahrenheit: "))
print(convert_fahrenheit_to_celsius(fer), "celsius\n")  
        
print(isPrime(eval(input("Enter number to check if its prime: "))))
print()

mylist = [2, 5, 4, 3, 10]
outlist = [square(x) for x in mylist if x % 2 == 0]
print(outlist)