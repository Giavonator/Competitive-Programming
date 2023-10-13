def main_function():
    user_input = input("")
    return

number_of_test_cases = int(input(""))
each_case = []
for i in range(number_of_test_cases):
    each_case.append(main_function())

new_string = ""
for text in each_case:
    for letter in text:
        new_string = new_string+letter
    
    print(new_string)
    new_string = ""