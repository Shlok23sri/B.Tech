print("================ OOPS_1 ================ ")




class Student:
    
    # default constructor
    # def __init__(self):
    #     pass
    
    @staticmethod
    def college():
        print("Arka Jain University")
    
    # parameterized constructor
    def __init__(self, fullname):
        self.name = fullname
    
    def welcome(self):
        print("Welcome student,", self.name)


# s1 = Student("Shlok")
# s1.welcome()
# s1.college()



# Abstraction


class Car:
    def __init__(self):
        self.acc = False
        self.brk = False
        self.clutch = False
    
    
    def start(self):
        self.clutch = True
        self.acc = True
        print("Car started...")


car1 = Car()
car1.start()