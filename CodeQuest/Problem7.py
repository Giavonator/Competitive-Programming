numTestCase = int(input(""))
outputLi = []

for num in range(numTestCase):
    userInputNum = int(input(""))
    
    levelsData = []
    for i in range(int(userInputNum)):
        levelsData.append(input())
    average = 0
    sumLi = []
    sum = 0
    for num in levelsData:
        val = num.split()
        if val[0] == "HIGH":
            sumLi.append(int(val[1]))
            sumLi.append(int(val[1]))
            sumLi.append(int(val[1]))
        elif val[0] == "MEDIUM":
            sumLi.append(int(val[1]))
            sumLi.append(int(val[1]))
        elif val[0] == "LOW":
            sumLi.append(int(val[1]))
    for val in sumLi:
        sum = sum+val
    average = sum/len(sumLi)
    result = average * 10
    result = int(result+.5)
    outputLi.append(int(result))
    
for i in outputLi:
    print(i)