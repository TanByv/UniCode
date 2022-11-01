def convert_celsius_to_fahrenheit(celsius):
    fahrenheit = (float(celsius) * 9 / 5 + 32)
    return fahrenheit

def convert_fahrenheit_to_celsius(fahrenheit):
    celsius = (float(fahrenheit - 32) * 5 / 9)
    return celsius

# cel = eval(input("Enter celsius: "))
# print(convert_celsius_to_fahrenheit(cel), "fahrenheit")

# fer = eval(input("Enter fahrenheit: "))
# print(convert_fahrenheit_to_celsius(fer), "celsius")