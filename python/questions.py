class Student:
    
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

    @staticmethod
    def college():
        print("Arka Jain University")

    def get_avg(self):
        sum = 0
        for val in self.marks:
            sum += val
        print("Hi,",self.name,"your avg score is :",(sum/3))
    
    
    # def set_marks(self, py, java, javascript):
    #     self.python = py
    #     self.java = java
    #     self.js = javascript
    
    # def get_marks(self):
    #     print("Python marks =",self.python)
    #     print("Java marks =",self.java)
    #    print("JavaScript marks =",self.js)


s1 = Student("Shlok",[97,85,64])
s1.get_avg()
s1.college()

# s1.set_marks(97,85,64)
# s1.get_marks()