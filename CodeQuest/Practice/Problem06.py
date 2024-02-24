def main_function():
    numSensors = input("")
    sensors = input("")

    presentSensorLi = sensors.split()
    expectedSensorsLi = []

    for i in range(1, int(numSensors)+1):
        expectedSensorsLi.append(i)
    for sensor in presentSensorLi:
        expectedSensorsLi.remove(int(sensor))
    
    return expectedSensorsLi[0]

number_of_test_cases = int(input(""))
each_case = []
for i in range(number_of_test_cases):
    each_case.append(main_function())

for text in each_case:
    print(int(text))