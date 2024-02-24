rejcectLi = ['-- ','1 = 1', '$(','${', '&& su -', '&& sudo', ';', '<script', '%s ', '%x', '%n']
numTestCase = int(input(""))
newSting = ""
outputLi = []

for i in range(numTestCase):
    userInput = input("")
    for letter in rejcectLi:
        if letter in userInput:
            outputLi.append("REJECTED")
            break
        elif letter == rejcectLi[-1]:
            outputLi.append(userInput)
        
for i in range(numTestCase):
    for letter in outputLi[i]:
        newSting = newSting + letter
    print(newSting)
    newSting = ""