from tkinter.messagebox import YESNO


print("123456789")
print("{0:^5s}{1:<20s}{2:>6s}".format("Rank", "Player", "HR"))
print("{0:^5n}{1:<20s}{2:>6n}".format(1, "Barry Bonds", 762.25))
print("{0:^5n}{1:<20s}{2:>6n}".format(2, "Hank Aaron", 755.48))
print("{0:^5n}{1:<20s}{2:>6n}".format(3, "Babe Ruth", 714.12))

names = []
grades = []

var = input("\nEnter your first name: ")
names.append(var)
var = input("Enter your second name: ")
names.append(var)
var = input("Enter your third name: ")
names.append(var)
var = input("Enter your fourth name: ")
names.append(var)
var = input("Enter your fifth name: ")
names.append(var)

numberVar = float(input("\nEnter your first grade: "))
grades.append(numberVar)
numberVar = float(input("Enter your second grade: "))
grades.append(numberVar)
numberVar = float(input("Enter your third grade: "))
grades.append(numberVar)
numberVar = float(input("Enter your fourth grade: "))
grades.append(numberVar)
numberVar = float(input("Enter your fifth grade: "))
grades.append(numberVar)

average = sum(grades) / len(grades)

print("{0:<20s}{1:>6s}".format("\nStudent Names", "Grades"))
print("{0:<20s}{1:>6n}".format(names[0], round(grades[0],2)))
print("{0:<20s}{1:>6n}".format(names[1], round(grades[1],2)))
print("{0:<20s}{1:>6n}".format(names[2], round(grades[2],2)))
print("{0:<20s}{1:>6n}".format(names[3], round(grades[3],2)))
print("{0:<20s}{1:>6n}".format(names[4], round(grades[4],2)))
print("{0:<20s}{1:>6n}".format("Average", round(average,2)))

NamesRead = []
GradesRead = []

with open(r'c:/users/bayavt/desktop/Names.txt', 'w') as fp:
    for item in names:
        fp.write("%s\n" % item)
        fp.close()
        
with open(r'c:/users/bayavt/desktop/Grades.txt', 'w') as fp:
    for item in grades:
        fp.write("%s\n" % item)
        fp.close
        
with open(r'c:/users/bayavt/desktop/Names.txt', 'r') as fpp:
    for line in fpp:
        x = line[:-1]
        NamesRead.append(x)
        fpp.close()

with open(r'c:/users/bayavt/desktop/Grades.txt', 'r') as fpp:
    for line in fpp:
        y = line[:-1]
        GradesRead.append(y)
        fpp.close()

print(NamesRead)
print(GradesRead)