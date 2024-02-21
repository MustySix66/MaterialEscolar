try:
    persona1=float(input("Dime cuanto dinero puso el primer inversor: "))
    persona2=float(input("Dime cuanto dinero puso el segundo inversor: "))
    persona3=float(input("Dime cuanto dinero puso el tercer inversor: "))
    inverTotal=persona1+persona2+persona3
    invPer1=persona1*100/inverTotal
    invPer2=persona2*100/inverTotal
    invPer3=persona3*100/inverTotal
    print("el primer inversor dió un ",invPer1, "%")
    print("el segundo inversor dió un ",invPer2, "%")
    print("el tercer inversor dió un ",invPer3, "%")
except:
    print("Usa solo numeros.")
    exit()