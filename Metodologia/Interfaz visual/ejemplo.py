import tkinter as tk

def abrir_ventana_Aritmetica():
    #agregamos las caracteristicas del menú de aritmetica.
    ventanaArit = tk.Toplevel(ventana_principal)
    ventanaArit.geometry("500x500")
    ventana_principal.withdraw()
    LblMenuArit=tk.Label(ventanaArit, text="Selecciona una opción:")
    LblMenuArit.pack()

    #le damos formato a la ventana de suma:
    ventanaSuma=tk.Toplevel(ventana_principal)
    ventanaSuma.geometry("350x350")
    LblVentSuma=tk.Label(ventanaSuma, text="Aquí debe el UX ingresar 2 numeros y sumarlos")
    LblVentSuma.pack()
    
    btSuma = tk.Button(ventanaArit, text=f"Suma.", command=lambda: tk.Toplevel(ventanaSuma))
    btSuma.pack()
    btResta = tk.Button(ventanaArit, text=f"Resta.", command=lambda: tk.Toplevel(ventanaArit))
    btResta.pack()
    btMulti = tk.Button(ventanaArit, text=f"Multiplicación.", command=lambda: tk.Toplevel(ventanaArit))
    btMulti.pack()
    btDivi = tk.Button(ventanaArit, text=f"División.", command=lambda: tk.Toplevel(ventanaArit))
    btDivi.pack()

def abrir_ventana_ProbyEsta():
    ventana2 = tk.Toplevel(ventana_principal)
    ventana2.geometry("500x500")
    for i in range(5):
        tk.Button(ventana2, text=f"Botón {i+1}", command=lambda: tk.Toplevel(ventana2)).pack()

def abrir_ventana_Conversor():
    ventana3 = tk.Toplevel(ventana_principal)
    ventana3.geometry("500x500")
    for i in range(5):
        tk.Button(ventana3, text=f"Botón {i+1}", command=lambda: tk.Toplevel(ventana3)).pack()

def abrir_ventana4():
    ventana4 = tk.Toplevel(ventana_principal)
    ventana4.geometry("500x500")
    for i in range(5):
        tk.Button(ventana4, text=f"Botón {i+1}", command=lambda: tk.Toplevel(ventana4)).pack()

def abrir_ventana5():
    ventana5 = tk.Toplevel(ventana_principal)
    ventana5.geometry("500x500")
    for i in range(5):
        tk.Button(ventana5, text=f"Botón {i+1}", command=lambda: tk.Toplevel(ventana5)).pack()

ventana_principal = tk.Tk()
ventana_principal.title("Proyecto Metodología de la programación")
ventana_principal.geometry("500x500")
etiqueta= tk.Label(ventana_principal, text="Aquí vamos desarrollando una prueba del proyecto\nen una interfaz grafica simple")
etiqueta.pack()

boton1 = tk.Button(ventana_principal, text="Aritmetica", command=abrir_ventana_Aritmetica)
boton1.pack()

boton2 = tk.Button(ventana_principal, text="Probabilidad y estadistica", command=abrir_ventana_ProbyEsta)
boton2.pack()

boton3 = tk.Button(ventana_principal, text="Conversor de decimal.", command=abrir_ventana_Conversor)
boton3.pack()

boton4 = tk.Button(ventana_principal, text="    PLACEHOLDER     ", command=abrir_ventana4)
boton4.pack()

boton5 = tk.Button(ventana_principal, text="    PLACEHOLDER     ", command=abrir_ventana5)
boton5.pack()

ventana_principal.mainloop()
