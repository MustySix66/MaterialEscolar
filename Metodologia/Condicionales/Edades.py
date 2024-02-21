try:
    edad1 = int(input("Dame la edad de la primera persona: "));
    edad2 = int(input("Dame la edad de la segunda persona: "));
    edad3 = int(input("Dame la edad de la tercera persona: "));

    if edad1 > edad2 and edad1 > edad3 :
        print("La edad ", edad1, "es mayor a las demás");
    if edad2 > edad1 and edad2 > edad3:
        print("La edad ", edad2, "es mayor a las demás");
    if edad3 > edad1 and edad3 > edad2:
        print("La edad ", edad3, "es mayor a las demás");
    else:
        print("esta accion no es válida");
except:
    print("Ingresa un valor que sea válido");
    exit()
