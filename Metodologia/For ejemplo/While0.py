suma = 0
numero = float(input("Introduce un número: "))

while numero != 0:
    suma += numero
    print("La suma hasta ahora es: ", suma)
    numero = float(input("Introduce otro número: "))

print("La suma final es: ", suma)