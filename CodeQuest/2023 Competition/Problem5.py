indexLi = []
count = 0
def mainFunction(count, indexLi):
	userInput1 = input("")
	userInput2 = input("")
	valLi1 = userInput1.split()
	valLi2 = userInput2.split()
    
	for num in range(len(valLi1)):
            if int(valLi1[num]) >= .6 and int(valLi1[num]) <=.85:
                  if int(valLi2[num]) >= .6 and int(valLi2[num]) <=.85:
                        count+=1
                        indexLi.append(num)
            return (count, indexLi)
newString = ""
numCases = int(input(""))
for i in range(numCases):
    indexCount = mainFunction[0]
    indexLocations = mainFunction[1]
    if indexCount == 0:
          print("No multipaction events detected.")
    elif indexCount == 1:
          print("A multipaction event was detected at time index "+str(indexLocations[0]))
    else:
          for num in range(len(indexLocations)):
                if num ==indexLocations[-1]:
                        newString = newString + num
                else:
                      newString = newString+num+ " " 
          print(str(indexCount) + "multipaction events were detected at time indices:")