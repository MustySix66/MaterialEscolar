print("1) Cm a Pulgadas\n2) Libras a Kilogramos")
opc=int(input("Escoge una opción. "))
try:
    match opc:
        case 1:
            conver = float(input("Escribe la longitud en centimentros: "))
            conver = conver/2.54
            print("Se convierten a ",conver,"pulgadas")
        case 2:
            conver = float(input("Escribe el peso en libras: "))
            conver = conver/2.205
            print("Se convierten a",conver,"Kilogramos")
        case _:
            print("Selecciona una opcion valida")
except:
    exit()