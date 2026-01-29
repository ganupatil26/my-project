#python program to revrcinng list
def reverse_list(lst):
    return lst[::-1]
my_list = [1, 2, 3, 4, 5]
reversed_lst = reverse_list(my_list)
print("Original list:", my_list)
print("Reversed list:", reversed_lst)