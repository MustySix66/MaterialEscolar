from os import system
import statistics

try:
    mainMenu=True
    while mainMenu==True:
        ## Orden y limpieza
        system("cls")
        ## Aquí asignamos las opciones del menú y se solicita la opción a elegir
        print("1) Aritmetica.\n"+
        "2) Probabilidad y estadistica.\n"+
        "3) Conversor de programador.\n"
        "4)    Placeholder\n"+
        "5)    Placeholder\n"+
        "6) Salir")
        opMenuPrin=int(input("Selecciona una opción: "))
        try:
            match opMenuPrin:
#################################################################################################################3
                case 1:
                    cicloWhileMatOps=True
                    while cicloWhileMatOps==True:
                        resul=0
                        num1=0
                        num2=0
                        ## Aquí borramos la consola para darle orden y limpieza al programa, lo haremos en cada caso
                        system("cls")
                        print("ARITMETICA BASICA")
                        print("¿Qué operación te gustaría resolver?\n"+
                        "1) Suma.\n"+
                        "2) Resta.\n"+
                        "3) Multiplicación.\n"+
                        "4) División.\n"+
                        "5) Salir al menú principal.")
                        opMatBasi=int(input("Selecciona una opción: "))
                        ## Variable para poder hacer todas las operaciones que el usuario quiera
                        ## y pueda volver al menú a voluntad gracias a un ciclo.
                        match opMatBasi:
                            #Solicitar numeros y realizar operaciones
                            case 1:
                                system("cls")
                                num1=float(input("Escribe un numero para la suma: "))
                                num2=float(input("Escribe el segundo numero para la suma: "))
                                resul=num1+num2
                                print("El resultado es ", resul)
                                print("Volviendo al menú.")
                                Enter=input("Presione Enter para continuar.")
                                system("cls")
                            case 2:
                                system("cls")
                                num1=float(input("Escribe un numero para la resta: "))
                                num2=float(input("Escribe el segundo numero para la resta: "))
                                resul=num1-num2
                                print("El resultado es ", resul)
                                print("Volviendo al menú.")
                                Enter=input("Presione Enter para continuar.")
                                system("cls")
                            case 3:
                                system("cls")
                                num1=float(input("Escribe un numero para la multiplicación: "))
                                num2=float(input("Escribe el segundo numero para la Multiplicación: "))
                                resul=num1*num2
                                print("El resultado es ", resul)
                                print("Volviendo al menú.")
                                Enter=input("Presione Enter para continuar.")
                                system("cls")
                            case 4:
                                system("cls")
                                num1=float(input("Escribe un numero para la división: "))
                                num2=float(input("Escribe el segundo numero para la división: "))
                                resul=num1/num2
                                print("El resultado es ", resul)
                                print("Volviendo al menú.")
                                Enter=input("Presione Enter para continuar.")
                                system("cls")
                            case 5:
                                print("Volviendo al menú principal.")
                                cicloWhileMatOps=False
                            case _:
                                print("Selecciona una opción valida")
##########################################################################################################################################
                case 2:
                    try:
                        system("cls")
                        listaProb=[]
                        cicloWhileMenuProb=True
                        while cicloWhileMenuProb==True:

                            ## Variable para poder hacer todas las operaciones que el usuario quiera
                            ## y pueda volver al menú a voluntad gracias a un ciclo.
                            cicloWhileProbOps=True

                            # Usamos una lista para que el usuario pueda ingresar todos los datos que deseé
                            if len(listaProb)==0:
                                print("PROBABILIDAD Y ESTADISTICA")
                                print("Generemos una lista que contenga los datos a evaluar:")
                                valor=int(input("Ingrese el primer dato: "))
                                while valor !=0:
                                    listaProb.append(valor)
                                    valor=int(input("Ingrese otro dato (Presione 0 para terminar de agregar valores): "))
                                ## Imprimimos los valores
                                system("cls")
                                print("Su lista queda de la siguiente forma: ")
                                listaProb.sort()                                
                                print(listaProb)
                                longitud=int(len(listaProb))
                                print("Con una longitud de :",longitud ," valores")
                                Enter=input("Presione cualquier tecla para continuar")
                            else:
                                # Le damos un ciclo al menú para que el usuario pueda hacer las operaciones que deseé -
                                # con la misma lista, o pueda cambiarla                             
                                while cicloWhileProbOps==True:
                                    
                                    ## Aquí borramos la consola para darle orden y limpieza al programa, lo haremos en cada caso
                                    system("cls")
                                    print("PROBABILIDAD Y ESTADISTICA:")
                                    print("\n¿Qué operación te gustaría realizar?\n"+
                                    "1) Media.\n"+
                                    "2) Mediana.\n"+
                                    "3) Desviación estándar.\n"+
                                    "4) Cambiar de lista.\n"+
                                    "5) Salir al menú principal.")
                                    opProbBasi=int(input("Selecciona una opción: "))

                                    match opProbBasi:
                                        #Solicitar numeros y realizar operaciones
                                        case 1:
                                            # Media
                                            system("cls")                                    
                                            media = statistics.mean(listaProb)
                                            print("La media es: ", media)
                                            Enter=input("Presione enter para continuar: ")
                                            system("cls")
                                        case 2:
                                            # Mediana
                                            system("cls")
                                            mediana= statistics.median(listaProb)
                                            print("La mediana es: ", mediana)
                                            Enter=input("Presione Enter para continuar.")
                                            system("cls")                                    
                                        case 3:
                                            system("cls")
                                            Desviacion=statistics.stdev(listaProb)
                                            print("La desviación estandar es: ", Desviacion)
                                            Enter=input("Presione Enter para continuar.")
                                            system("cls")
                                        case 4:
                                            print("Volviendo a agregar nueva lista.")
                                            cicloWhileProbOps=False
                                            listaProb= []
                                        case 5:
                                            print("Volviendo al menú principal.")
                                            cicloWhileProbOps=False
                                            cicloWhileMenuProb=False
                                        case _:
                                            print("Selecciona una opción valida")
                    except:
                        print("Error lista Probabilidad")
###########################################################################################################################################
                case 3:
                    system("cls")
                    cicloWhileConvCant=True
                    while cicloWhileConvCant==True:
                        system("cls")
                        numOgConv=0
                        numConvertido=0
                        print("CONVERSOR DE CANTIDADES.\n"+
                        "1) Decimal a binario\n"+
                        "2) Decimal a Hexadecimal\n"+
                        "3) Decimal a Octal\n"+
                        "4) Salir\n"+
                        "(Más conversiones en camino :P)\n")
                        SelConvCant=int(input("Selecciona una opción: "))
                        match SelConvCant:
                            case 1:
                                system("cls")
                                print("DECIMAL --> BINARIO")
                                numOgConv=int(input("Ingresa la cantidad a convertir: "))
                                numConvertido=bin(numOgConv)
                                print("El número ", numOgConv , " en binario es: ", numConvertido,"\n")
                                Enter= input("Presione Enter para continuar.")
                            case 2:
                                system("cls")
                                print("DECIMAL --> HEXADECIMAL")
                                numOgConv=int(input("Ingresa la cantidad a convertir: "))
                                numConvertido=hex(numOgConv)
                                print("El número ", numOgConv , " en hexadecimal es: ", numConvertido,"\n")
                                Enter= input("Presione Enter para continuar.")
                            case 3:
                                system("cls")
                                print("DECIMAL --> OCTAL")
                                numOgConv=int(input("Ingresa la cantidad a convertir: "))
                                numConvertido=oct(numOgConv)
                                print("El número ", numOgConv , " en octal es: ", numConvertido,"\n")
                                Enter= input("Presione Enter para continuar.")
                            case 4:
                                print("Regresando al menú principal...")
                                cicloWhileConvCant=False
                            case _:
                                print("Selecciona una opción valida")
                                system("cls")

###########################################################################################################################################
                case 4:
                    print("ola 4")
                case 5:
                    print("ola 5")
                case 6:
                    ## Aquí se cierra la "sesión" y saca del ciclo para cerrar el programa.
                    system("cls")
                    print("Adiós")
                    mainMenu=False
                case _:
                    print("¡Selecciona una opción valida!")
        except:
            print("Error try 2")
    ## Aquí cierra el ciclo del menú principal y lanza un mensaje de despedida.
    print("¡Hasta la proxima!")
except:
    print("Error Try 1")