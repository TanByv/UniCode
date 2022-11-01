def convert_celsius_to_fahrenheit(celsius):
    fahrenheit = (float(celsius) * 9 / 5 + 32)
    return fahrenheit

def convert_fahrenheit_to_celsius(fahrenheit):
    celsius = (float(fahrenheit - 32) * 5 / 9)
    return celsius

def isPrime(num):
    if num > 1:
        for i in range (2, num):
            if (num % i) == 0:
                return False
            else:
                return True