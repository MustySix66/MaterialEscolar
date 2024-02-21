peso = float(input("Ingresa tu peso en kilogramos "))
altura = float(input("ingresa tu altura en metros "))
altVar = altura**altura
IMC = float(peso / altVar)
try:

    if IMC >= 30 :
        print("tu IMC es de:", IMC," \nEn nivel de obesidad");
    else:
        if IMC>=25 and IMC <=29.9 :
            print("tu IMC es de:", IMC," \nEn nivel de sobre peso");
        else:
            if IMC >= 18.6 and IMC <= 24.9 :
                print("tu IMC es de:", IMC," \nEn nivel normal");
            else:
                if IMC <= 18.5:
                    print("tu IMC es de:", IMC," \nEn nivel de de bajo peso");
except:
    print("No Disponible");
    exit()