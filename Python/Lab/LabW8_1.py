import math

def sum_greater(list1, threshold):
    list2 = [item for item in list1 if item > threshold]
    return sum(list2)
    
listXD = [1, 2, 3, 4, 5, 6, 7, 8]
threshXD = 5

print(sum_greater(listXD, threshXD))

def roots(a,b,c):
    d = b**2-4*a*c #discriminant
    if a != 0:
        if d < 0:
            x11 = complex(-b/(2*a), -(d**0.5)/(2*a))
            x22 = complex(-b/(2*a), (d**0.5)/(2*a))
            return (x11, x22)
        elif d == 0:
            x = (-b+math.sqrt(b**2-4*a*c))/2*a
            return (x, x)
        else:
            x1 = (-b+math.sqrt((b**2)-(4*(a*c))))/(2*a)
            x2 = (-b-math.sqrt((b**2)-(4*(a*c))))/(2*a)
            return (x1, x2)
    else:
        return ("error")
        
print(roots(1, -3, 2))
print(roots(1, 2, 3))
print(roots(0, 1, 2))

x=[]
for num in range(0,101):
    if (num % 2 == 0) and (num % 7 == 0):
        x.append(num)      
print(x)