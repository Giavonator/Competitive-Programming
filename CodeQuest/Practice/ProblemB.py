
def self_driving():
    num = int(input(""))
    for i in range(num):
        user_input = input("")
        if ":" not in user_input:
            print("BRAKE")
            continue

        vehicles_speed = user_input[ : user_input.find(':')]
        objects_distance = user_input[user_input.find(':')+1 : ]

        v = float(vehicles_speed)
        x = float(objects_distance)

        vehicles_speed = round(v, 2)
        objects_distance = round(x, 2)

        if vehicles_speed >= objects_distance*5:
            print("BRAKE")
        elif vehicles_speed >= objects_distance:
            print("SWERVE")
        else:
            print("SAFE")

self_driving()