from Python.Lab.LabW7_1 import convert_celsius_to_fahrenheit, convert_fahrenheit_to_celsius, isPrime

cel = eval(input("Enter celsius: "))
print(convert_celsius_to_fahrenheit(cel), "fahrenheit")

fer = eval(input("Enter fahrenheit: "))
print(convert_fahrenheit_to_celsius(fer), "celsius")  
        
print(isPrime(eval(input("Enter number: "))))