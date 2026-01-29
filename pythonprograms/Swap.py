#python program to swap two elemnts in list
def swap_elements(lst, index1, index2):
    lst[index1], lst[index2] = lst[index2], lst[index1]
    return lst
my_list = [10, 20, 30, 40, 50]
index1 = 1
index2 = 3
print("Original list:", my_list)
swapped_list = swap_elements(my_list, index1, index2)
print("List after swapping elements at index", index1, "and", index2, "is:", swapped_list)