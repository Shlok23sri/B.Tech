print("================ Loops ================ ")

count = 1

while count <= 5:
    print("hello",count)
    count += 1

print("")

# Print the multiplication table of a number n.

# n = int(input("Enter a number : "))
n = 2
i = 1

while i <=10:
    print(n,"X",i,"=", n*i)
    i +=1

print("")

# Print the elements of the following list using a loop.

nums = [1,4,9,16,25,36,49,64,81,100]

idx = 0

while idx < len(nums):
    print(nums[idx])
    idx +=1

print("")

# Search for a number X in this tuple using loop.

sq = (1,4,9,16,25,36,49,64,81,100)


x = 25
a = 0

while a < len(sq):
    if(x == sq[a]):
        print("The Searched no. =",sq[a],", Found at idx =",a)
    else:
        print("finding...")
    a += 1

print("")


# ============== For loop ==============

name = "Shlok"

for ch in name:
    print(ch)

print("")

values = (1,4,9,16,25,36,49,64,81,100,36)
b = 36
idx = 0
for i in values:
    if(i == b):
        print("number found at idx",idx)
        break
    idx += 1

print("")


# =========== range(start?,stop,step?) ===========


# for i in range(6): # range(stop)
#     print(i)

# print("")

# for i in range(2, 10): # range(start, stop)
#     print(i)

# print("")

for i in range(2, 10, 2): # range(start, stop, step)
    print(i)

print("")


tb = 11

for i in range(1,11):
    print(tb,"X",i,"=",tb*i)

print("")


for i in range(50):
    pass

print("")

