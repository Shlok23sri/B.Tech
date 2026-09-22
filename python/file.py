print("================ File I/O ================ ")

# Read file

# f = open("python/demo.txt", "r")

# data = f.read()
# print(data)
# print(type(data))
# f.close()



# Write file

# f = open("python/demo.txt", "a")

# data = f.write("\nThis is a high level language.")
# print(data)
# f.close()






# 'with' syntax


# with open("python/demo.txt","r") as f:
#     data = f.read()
#     print(data)


# with open("python/demo.txt", "a") as f:
#     data = f.write("\nNew data")
#     print(data)


with open("python/practice.txt","w") as f:
    f.write("Hi everyone,\nWe are learning File I/O\n")
    f.write("using Java.\nI like programming in Java.")



def check_for_word():
    word = "learning"
    with open("python/practice.txt","r") as f:
        data = f.read()
        if(data.find(word) != -1):
            print("Found")
        else:
            print("not found")

check_for_word()


# with open("python/practice.txt","r") as f:
#         data = f.read()

# new_data = data.replace("Java","Python")

# with open("python/practice.txt", "w") as f:
#     f.write(new_data)

def check_for_line():
    word = "learning"
    data = True
    line_no = 1
    with open("python/practice.txt","r") as f:
        while data:
            data = f.readline()
            if(word in data):
                print(line_no)
                return
            line_no += 1
    
    return -1


check_for_line()