NumbersRead = []

with open(r'c:/users/bayavt/desktop/Numbers.txt', 'r') as fpp:
    for line in fpp:
        x = line[:-1]
        NumbersRead.append(eval(x))
        
print(NumbersRead)

NumbersSorted = [i for i in NumbersRead if i > 50]

print(NumbersSorted)
print(sum(NumbersSorted))