def main_function():
    user_input = input("")
    time_li = user_input.split(',')
    name = time_li[0]
    time_li.remove(name)

    hours = 00
    minutes = 00
    for num in time_li:
        hours = hours + int(num[:2])
    for num in time_li:
        minutes = minutes + int(num[3:])
    
    while minutes >= 60:
        hours = hours + 1
        minutes = minutes - 60
    
    if minutes == 0:
        return(str(name)+"="+str(hours)," hours ")
    elif minutes == 1:
        return(str(name[:-1])+"="+str(hours)," hours ",str(minutes)," minute")
    else:
        return(str(name[:-1])+"="+str(hours)," hours ",str(minutes)," minutes")

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