print("================ Resursion ================ ")


def show(n):
    if(n == 0):
        return
    print(n, end=" ")
    show(n-1)




def fact(n):
    if(n == 0 or n == 1):
        return 1
    else:
        return n * fact(n-1)


print(fact(5))
