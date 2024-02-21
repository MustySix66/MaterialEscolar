try:
    sueldo=float(input("Dime cual es tu sueldo base: "))
    valRenta=sueldo*0.1
    valAporCoop= sueldo*0.07
    valSegSoci=sueldo*0.075
    totDescu=valRenta+valAporCoop+valSegSoci
    sueFin=sueldo-totDescu
    print("Tu descuento es de: ",totDescu, "\nde tu sueldo de: ",sueldo,"\nEstarás recibiendo: ",sueFin)
except:
    print("Introduce valores numericos.")
    exit()