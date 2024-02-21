try:
    Salario = float(input("Ingresa tu sueldo: "))
    NivAntig = int(input("Del 1 al 4 ingresa tu nivel de antigüedad: "))
    if NivAntig == 1:
        SalaPorc=Salario*0.05
        Salario=Salario+SalaPorc
        print("Tu salario quedaría en $",Salario)
    elif NivAntig == 2:
        SalaPorc=Salario*0.1
        Salario=Salario+SalaPorc
        print("Tu salario quedaría en $",Salario)
    elif NivAntig ==3:
        SalaPorc=Salario*0.15
        Salario=Salario+SalaPorc
        print("Tu salario quedaría en $",Salario)
    elif NivAntig ==4:
        SalaPorc=Salario*0.20
        Salario=Salario+SalaPorc
        print("Tu salario quedaría en $",Salario)
    elif NivAntig <=0 or NivAntig>=5:
        print("Selecciona un Nivel de antigüedad valido")
except:
    print("Asigna un valor valido")
    exit()
    