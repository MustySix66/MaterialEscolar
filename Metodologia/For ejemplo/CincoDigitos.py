try:
    suma =0
    for i in range(10):
        numero = float(input("Introduce el número " + str(i+1) + ": "))
        if i>=5:
            suma= suma + numero
    prome = suma/5
    print("La suma de valores es: ",suma)
    print("El promedio es: ", prome)
except:
    print("Error")