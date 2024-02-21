Asigna=True
try:
    while Asigna ==True:
        print("\n1. Suma")
        print("2. Resta")
        print("3. Multiplicación")
        print("4. División")
        print("5. Salir")
        opcion = int(input("Elige una opción: "))
        if opcion==5:
            print("¡Hasta la proxima!")
            Asigna=False
        else:
            num1 = float(input("Introduce el primer número: "))
            num2 = float(input("Introduce el segundo número: "))
            match opcion:
                case 1:
                    print("La suma es: ", num1 + num2)
                case 2:
                    print("La resta es: ", num1 - num2)
                case 3:
                    print("La multiplicación es: ", num1 * num2)
                case 4:
                    if num2 != 0:
                        print("La división es: ", num1 / num2)
                    else:
                        print("Error: División entre cero no es posible.")
                case _:
                    print("Opción no válida. Por favor, elige una opción del 1 al 5.")
except:
    print("Error")