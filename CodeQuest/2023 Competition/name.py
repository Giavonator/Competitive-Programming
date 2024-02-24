indexLi = []
count = 0
def mainFunction(count, indexLi):
            userInput1 = input("")
            userInput2 = input("")
            valLi1 = userInput1.split()
            valLi2 = userInput2.split()
      
            for num in range(len(valLi1)):
                  if float(valLi1[num]) >= .6 and float(valLi1[num]) <=.85:
                        if float(valLi2[num]) >= .6 and float(valLi2[num]) <=.85:
                              count+=1
                              indexLi.append(num)
            return (count, indexLi)
newString = ""
numCases = int(input(""))
for i in range(numCases):
    indexCount = mainFunction(count, indexLi)[0]
    indexLocations = mainFunction(count, indexLi)[1]
    if indexCount == 0:
          print("No multipaction events detected.")
    elif indexCount == 1:
          print("A multipaction event was detected at time index "+str(indexLocations[0]))
    else:
          for num in range(len(indexLocations)):
                if num ==indexLocations[-1]:
                        newString = newString + str(num)
                else:
                      newString = newString+str(num)+ " " 
          print(str(indexCount) + " multipaction events were detected at time indices: "+str(newString))