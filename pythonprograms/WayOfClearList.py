#python program to find out differnt way to clear a list 
# Method 1: Using clear() method
my_list1 = [1, 2, 3, 4, 5]
print("Original list:", my_list1)
my_list1.clear()
print("List after clear() method:", my_list1)
# Method 2: Using del keyword  
del my_list1[:]
print("List after del keyword:", my_list1)
#method 3: Reassigning to an empty list
my_list1 = []
print("List after reassigning to an empty list:", my_list1)