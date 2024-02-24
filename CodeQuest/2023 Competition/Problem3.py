numCases = int(input())
alphabet = "abcdefghijklmnopqrstuvwxyz"
valCases = {}
sum = 0
IInput = input()
numLi = IInput.split()

for i in range(26):
    valCases.update({alphabet[i] : numLi[0]/100 + i/100})
    for letter in range(numLi[i]):
        word = input()
        for letter in word:
             sum = sum + int(valCases[letter])
        if int(sum) == 1:
             print("Winner " +str(numLi[0]+" " +word))