#python program to remove a key from dictionary
def remove_key_from_dict(d, key):
    if key in d:
        del d[key]
    return d
my_dict = {'name': 'John', 'age': 30, 'city': 'New York'}
key_to_remove = 'age'
updated_dict = remove_key_from_dict(my_dict, key_to_remove)
print("Original dictionary:", {'name': 'John', 'age': 30, 'city': 'New York'})
print("Dictionary after removing key", key_to_remove, ":", updated_dict)