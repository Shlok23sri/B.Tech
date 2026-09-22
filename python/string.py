str1 = "Shlok"
str2 = "Srivastava"
final_str = str1 + " " + str2
print(final_str)
print(len(final_str))

print(str1[0]) # print using index


# ============== Slicing ==============


str = "GoogleMicrosoft"

print(str[ : 6])
print(str[6 : ])


# ============== Slicing Negative Index ==============


z = "GoogleMicrosoft"

print(z[: -9]) 



# ============== String Functions ==============


print(z.endswith("ft"))
print(z.capitalize()) # not change in original string.
print(z.replace("o","S")) # not change in original string,  ("old","new").
print(z.find("M")) # return the index of the first letter if letter not found it returns -1.
print(z.count("G")) # return the total counts.