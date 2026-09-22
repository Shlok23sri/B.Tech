# Write a program to input 2 numbers & print their sum


a = int(input("Enter num1: "))
b = int(input("Enter num2: "))
c = a + b
print("The sum is:", c)

# WAP to input side of a square & print its area

side = float(input("Enter the side of the square: "))
area = side * side
print("The area of the square is:", area)

# WAP to input 2 floating point numbers & print their average

num1 = float(input("Enter val1 :"))
num2 = float(input("Enter val2 :"))
average = (num1 + num2) / 2
print("The average is:", average)

# WAP to input 2 int numbers, a and b. Print True if a is greater than or equal to b. If not print False

val1 = int(input("Enter a: "))
val2 = int(input("Enter b: "))
print(val1 >= val2)


# WAP to input user name & print its length

name = input("Enter your name : ")
print("The length of name :", len(name))
# print("The total count of 's' in name :",name.count("s"))



# WAP to find the sum of first n numbers. (using while)

n = 1
sum = 0

while n <= 5:
    sum += n
    n += 1

print(sum)

print("")

# WAP to find the factorial of first n numbers. (using for)

m = 5
idx = 1
fact = 1

while idx <= m:
    fact *= idx
    idx += 1

print("factorial =",fact)
