name = "Shlok"
age = 20
cgpa = 8.88
is_student = True
address = None

print("Name:", name)
print("Age:", age)
print("CGPA:", cgpa)
print("Is Student:", is_student)
print("Address:", address)

print(" ")

print(type(name))
print(type(age))
print(type(cgpa))
print(type(is_student))
print(type(address))


# ==================== Data types ====================

# Integers
# String
# Float
# Boolean
# None

# ================ Types of operator ==================

# Arithmetic operator = ( +,-,*,/,%,** )
# Relational/Comparison operator  = ( ==,!=,<,>,<=,>= )
# Assignment operator = ( =,+=,-=,*=,/=,%=,**= )
# Logical operator = ( or, and , not )



# =============== Arithmetic Operator ================

a = 5
b = 2

print("=============== Arithmetic Operator ================")

print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a % b)
print(a ** b)



# =============== Relational/Comparison Operator ================


c = 50
d = 20

print("=============== Relational/Comparison Operator ================")

print(a == b)
print(a != b)
print(a > b)
print(a < b)
print(a >= b)
print(a <= b)


# =============== Assignment Operator ================

e = 10
e *= 10


print("=============== Assignment Operator ================")

print(e)


# =============== # Logical Operator ================

f = 20
g = 30

val1 = True
val2 = False


print("=============== # Logical Operator ================")

print(not (f > g))
print(val1 or val2)
print(val1 and val2)


# =============== Type Casting ================

print("=============== Type Casting ================")

# Implicit Type Casting
x = 5
y = 2.0
z = x + y
print("Implicit Type Casting:", z)

# Explicit Type Casting
q = 5
w = 2
r = float(q) + float(w)
print("Explicit Type Casting:", r)


# =============== take user Input ================

fname = input("Enter your name : ")
fage = int(input("Enter your age : "))
print("Your Name :",fname)
print("Your Age :",fage)