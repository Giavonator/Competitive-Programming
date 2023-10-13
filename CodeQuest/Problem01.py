alphabet ="aeiou"
new_string = ""
count = 1
def main_function(new_string, count):
    text = input("")
    while count != len(text):
        if text[count-1] in alphabet:
            new_string = new_string+text[count]
            count+=2
        else:
            count+=1
    return new_string
number_of_test_cases = int(input(""))
for i in range(number_of_test_cases):
    print(main_function(new_string, count))