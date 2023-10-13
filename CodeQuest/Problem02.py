def main_function():
    vals = input("")
    values = vals.split()   

    volume_of_pool = round(int(values[0]), 0)
    rate_of_fill = round(int(values[1]), 0)
    rate_of_leak = round(int(values[2]), 0)

    answer = volume_of_pool/(rate_of_fill-rate_of_leak) * rate_of_leak
    return int(answer)
    # WRITE CODE HERE
number_of_test_cases = int(input(""))
for i in range(number_of_test_cases):
    print(main_function())
