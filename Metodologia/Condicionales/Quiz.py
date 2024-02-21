try:
    respuestas = int(input("Ingresa la cantidad de preguntas correctas del usuario "))
    preguntas = int (input("Ingresa la cantidad de preguntas totales realizadas "))
    porcentaje = float (100 * respuestas / preguntas)

    if porcentaje >= 90 :
        print("Tu porcentaje es de ",porcentaje,"%\nTienes el máximo nivel.")
    if porcentaje >= 75 and porcentaje < 90:
        print("Tu porcentaje es de ",porcentaje,"%\nTienes el nivel medio.")
    if porcentaje >= 50 and porcentaje < 75 :
        print("Tu porcentaje es de ",porcentaje,"%\nTienes el nivel regular.")
    if porcentaje < 50:
        print("Tu porcentaje es de ",porcentaje,"%\nEstás fuera de nivel.")
except:
    print("Ingresa valores válidos")
