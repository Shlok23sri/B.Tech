

age = 20

if(age >= 18):
    if(age >= 80):
        print("cannot drive")
    else:
        print("Can drive")
else:
    print("cannot drive")


marks = 86
if(marks >= 90):
    print("Grade -> 'A'")
elif(marks >= 80 and marks < 90):
    print("Grade -> 'B'")
elif(marks >= 70 and marks < 80):
    print("Grade -> 'C'")
elif(marks < 70):
    print("Grade -> 'D'")
else:
    print("Fail")