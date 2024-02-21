print("DE QUE QUIERES CALCULAR EL AREA?")
print("1) CIRCULO")
print("2) TRIANGULO")
print("3) CUADRADO")
opcion = int(input())
match opcion:
    case 1:
        diametro = float(input("Dame el diametro: "))
        area= 3.1415 * diametro
        print("El area es de: ", area)
    case 2:
        base =float(input("Dame la base del triangulo: "))
        altura=float(input("Dame la altura: "))
        area=base*altura/2
        print("El area es de: ", area)
    case 3:
        base= float(input("Dame el tamaño de un lado"))
        area= base*base
        print("El area es de:", area)
