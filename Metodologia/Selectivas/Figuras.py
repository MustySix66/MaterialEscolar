
print("1) Triangulo\n2) Cuadrado\n3) Rectangulo\n4) Circulo")
Figura = int(input("Escoge la figura de la que deseas conocer el area: "))
try:
    if Figura==1:
        base = float(input("Dime la base del triangulo (en cm): "))
        altura = float(input("Dime la altura del triangulo (en cm): "))
        area = base*altura/2
        print("El area del triangulo es de: ",area,"cm")
    elif Figura==2:
        lado = float(input("Dime cuanto mide un lado del cuadrado: "))
        area=lado*lado
        print("El area del cuadrado es de: ",area,"cm")
    elif Figura==3:
        base = float(input("Dime cuanto mide la base del rectangulo: "))
        altura = float(input("Dime cuanto mide la altura del rectangulo: "))
        area=base*altura
        print("El area del rectangulo es de ",area,"cm")
    elif Figura==4:
        radio= float(input("Dime el radio del circulo: "))
        area=(radio**2)*3.14159265359
        print("El area del circulo es de: ",area,"cm")
    elif Figura>=0 or Figura>=5:
        print("ingresa un valor valido")
except:
    print("Ingresa un valor valido.")
    exit()