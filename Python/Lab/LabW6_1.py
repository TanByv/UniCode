NumbersRead = []

with open(r'c:/users/bayavt/desktop/Numbers.txt', 'r') as fpp: # Sorter
    for line in fpp:
        x = line[:-1]
        NumbersRead.append(eval(x))
        
print("Full list:",NumbersRead)

NumbersSorted = [i for i in NumbersRead if i > 50]

print("\nList with numbers greater than 50:",NumbersSorted)
print("\nSum of above list:",sum(NumbersSorted))

fpp.close()

n = int(input("\nEnter the number of rows: ")) # Triangle
for i in range(0, n):  
        for j in range(0, i + 1):  
            print("* ", end="")       
        print() 
        
print()

k = 0
for i in range(1, n+1): # Pyramid
    for space in range(1, (n-i)+1): 
        print(end="  ")
   
    while k!=(2*i-1):
        print("* ", end="")
        k += 1
   
    k = 0
    print()

print()
        
for x in range(1, 6): # Multiplication Table
    for y in range (1, 6):
        print (x,"x", y, "=", (x*y), "\t", end="    ")
    print()