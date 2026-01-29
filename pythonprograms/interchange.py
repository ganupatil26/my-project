#python program to intrachange 1st and last elemnt in list
def interchange_first_last(lst):
    if len(lst) < 2:
        return lst
    lst[0], lst[-1] = lst[-1], lst[0]
    return lst
my_list = [1, 2, 3, 4, 5]
print("Original list:", my_list)
result = interchange_first_last(my_list)
print("List after interchanging first and last elements:", result)
