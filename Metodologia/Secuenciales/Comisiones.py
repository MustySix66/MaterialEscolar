try:
    Sueldo = float(input("Dame tu sueldo base: "))
    venta1=float(input("dime la cantidad de tu primera venta: "))
    venta2=float(input("Dime la cantidad de tu segunda venta: "))
    venta3=float(input("Dime la cantidad de tu tercera venta: "))
    porVen1=venta1*.10
    porVen2=venta2*.10
    porVen3=venta3*.10
    SuelFinal=Sueldo+porVen1+porVen2+porVen3
    print("Tu sueldo final será de: ", SuelFinal)
except:
    print("Introduce unicamente valores numericos.")
    exit()