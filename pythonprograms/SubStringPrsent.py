#python program to check substring present in string or not
def is_substring_present(string, substring):
    return substring in string
string = "hello world"
substring = "world"
print("original String:", string)
if is_substring_present(string, substring):
    print(f'"{substring}" is present in "{string}"')
else:
    print(f'"{substring}" is not present in "{string}"')

