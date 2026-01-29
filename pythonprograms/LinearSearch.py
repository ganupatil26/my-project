#pyhton program to linear search an element in a list
def linear_search(lst, target):
    for index, element in enumerate(lst):
        if element == target:
            return index
    return -1
my_list = [4, 2, 5, 1, 3]
print("original list:", my_list)
    
target = 1
result = linear_search(my_list, target)
if result != -1:
    print(f"Element {target} found at index {result}")
else:
    print(f"Element {target} not found in the list")
    
