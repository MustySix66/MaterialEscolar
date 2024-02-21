import tkinter as tk

def mostrar_ventana(mensaje):
    # Creamos una nueva ventana
    ventana = tk.Toplevel(root)
    # Añadimos un widget Label a la ventana con el mensaje deseado
    tk.Label(ventana, text=mensaje, font=("Arial", 14)).pack()

# Creamos la ventana principal
root = tk.Tk()

# El mensaje que se mostrará cuando se haga clic en los botones
mensaje1 = str(" Describe la programación en términos del estado del programa \ny sentencias que cambian dicho estado. Los programas imperativos son \nun conjunto de instrucciones que le indican al computador cómo realizar una tarea.")
mensaje2 = str("Es un paradigma de programación declarativa basado en el uso de funciones matemáticas.\nLa programación funcional tiene sus raíces en el cálculo lambda.")
mensaje3 = str("Gira en torno al concepto de predicado, o relación entre elementos.")
mensaje4 = str("Está basado en el desarrollo de programas especificando o declarando un conjunto de condiciones,\nproposiciones, afirmaciones, restricciones, ecuaciones o transformaciones que describen el problema y detallan su solución.")
mensaje5 = str("El programador se concentra en el procesamiento, en el algoritmo requerido para llevar a cabo el cómputo deseado.")
mensaje6 = str("Surge como un remedio a la situación de dar mayor énfasis al diseño de procedimientos que a la organización de la información.")

# Creamos los botones y los añadimos a la ventana principal
boton1 = tk.Button(root, text="Programación Imperativa.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje1))
boton1.pack()

boton2 = tk.Button(root, text="Programación Funcional.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje2))
boton2.pack()

boton3 = tk.Button(root, text="Programación Logica.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje3))
boton3.pack()

boton4 = tk.Button(root, text="Programación Declarativa.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje4))
boton4.pack()

boton5 = tk.Button(root, text="Programación por Procedimientos.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje5))
boton5.pack()

boton6 = tk.Button(root, text="Programación Modular.", font=("Arial", 14), command=lambda: mostrar_ventana(mensaje6))
boton6.pack()

# Ejecutamos el bucle principal de la ventana
root.mainloop()