print("================ Functions ================ ")


def calc_sum(a, b):
    sum = a + b
    print(sum)
    return sum


# calc_sum(2,3)


def calc_avg(a, b, c):
    avg = (a + b + c) / 3
    print("Average =",avg)
    return avg

# calc_avg(1,2,3)



# WAP to print the length of a list. (list is the parameter)

items = [1, 2, 3, 4, 5]

def print_listLen(lt):
    print("List length =",len(lt))

print_listLen(items)



# WAP to print the elements of a list in a single line. (list is a parameter)


def print_list(lt):
    for i in lt:
        print(i, end=" ")
    print("")

print_list(items)


# WAP to find the factorial of n. (n is the parameter)



def factorial(n):
    fact = 1
    for i in range(1, n+1):
        fact *= i
    print("Factorial of", n, "=",fact)

factorial(4)


# WAP to convert USD to INR


def usd_inr_converter(n):
    inr = n * 83
    print(n,"USD =", inr, "INR")


usd_inr_converter(6)


# WAP to check the number is either even or odd.


def odd_even(n):
    if(n%2 == 0):
        print("Even Number")
    else:
        print("Odd Number")


odd_even(4)


