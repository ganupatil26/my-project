#pyhton program to find out ways to remove ith character from string

def remove_ith_character(string, i):
    return string[:i] + string[i+1:]
string = "hello"
i = 2
new_string = remove_ith_character(string, i)
print("Original string is:", string)
print("String after removing character at index", i, "is:", new_string)
