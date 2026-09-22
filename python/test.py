# WAP to check if a number entered by the user is even or odd 

num = int(input("Enter a number : "))

if(num %2 == 0):
    print("Number is Even")
else:
    print("Number is Odd")


# WAP to find the greatest of 3 numbers entered by the user.

a = int(input("Enter a : "))
b = int(input("Enter b : "))
c = int(input("Enter c : "))

if(a > b and a > c):
    print("A is greatest")
elif(b > a and b > c):
    print("B is greates")
else:
    print("C is greatest")


# WAP to chech if a number is multiple of 7 or not.

val = int(input("Enter a number : "))

if(val %7 == 0):
    print("Multiple of 7")
else:
    print("Not Multiple of 7")



