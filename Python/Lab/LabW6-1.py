NumbersRead = []

with open(r'c:/users/bayavt/desktop/Numbers.txt', 'r') as fpp:
    for line in fpp:
        x = line[:-1]
        NumbersRead.append(eval(x))
        
print("Full list:",NumbersRead)

NumbersSorted = [i for i in NumbersRead if i > 50]

print("\nList with numbers greater than 50:",NumbersSorted)
print("\nSum of above list:",sum(NumbersSorted))

fpp.close()