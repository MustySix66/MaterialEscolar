try:
    repro=0
    aprobado=0
    for i in range(3):
        suma =0
        for conCalif in range(1,4):
            try:
                cali= float(input("Del alumno "+ str(i+1) + " ingresa la calificación "+ str(conCalif) + ": "))
                if cali>0 and cali<10:
                    suma=suma + cali
                else:
                    print("Ingresa una calificación valida")
            except:
                print("Error 2")
                exit();
        prom = suma /3
        if prom>=8:
            print("¡Aprobado!")
            aprobado= aprobado+1
        else:
            print("¡Reprobado!")
            repro = repro + 1
    print("El numero de aprobados fue de: ", aprobado)
    print("El numero de reprobados fue de: ", repro)
except:
    print("Error 1")