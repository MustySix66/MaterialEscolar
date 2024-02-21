try:
    num1 = float(input("Ingresa el primer número "))
    num2 = float(input("Ingresa el segundo número "))
    print("\n1) Suma (+)\n2) Resta (-)\n3) Multiplicación (*)\n4) División (/)\n")
    opera = int(input("Selecciona la operación que deseas implementar: "))
    match opera:
        case 1:
            resul = num1 + num2
            print("El resultado es: ",resul)
        case 2:
            resul = num1 - num2
            print("El resultado es: ",resul)
        case 3:
            resul = num1 * num2
            print("El resultado es: ",resul)
        case 4:
            resul = num1 / num2
            print("El resultado es: ",resul)
        case _:
            print("Selecciona un operador valido.")
except:
    print("ingresa un valor valido.")
    exit()