import math
def main_function():
    user_input = input("")
    numLi = user_input.split()

    diameter =  int(numLi[0])
    numRevolutionsToRotate = int(numLi[1])
    powerForRevolutions = int(numLi[2])
    speedRevolutions = int(numLi[3])
    availableCapacity = int(numLi[4])
    voltageOfMotor = int(numLi[5])
    distance = int(numLi[6])

    numRotationDistance = (distance*100)/(diameter*math.pi)
    numRevolutionsNeeded = numRotationDistance*numRevolutionsToRotate
    numWattsNeeded = numRevolutionsNeeded*powerForRevolutions
    numAmps = numWattsNeeded/voltageOfMotor
    secondsNeeded = numRevolutionsNeeded*speedRevolutions

    minutesNeeded = 0
    while secondsNeeded >= 60:
        minutesNeeded+= 1
        secondsNeeded-=60
    
    minutesNeeded = minutesNeeded+(secondsNeeded/60)

    ampMinutes = numAmps*minutesNeeded

    ampHours = 0
    while ampMinutes >= 60:
        ampHours += 1
        ampMinutes -= 60

    ampHours = ampHours + (ampMinutes/60)
    print(ampHours)

    if ampHours > availableCapacity:
        return("Fail")
    else:
        return "Success "+str(round(minutesNeeded,4))

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