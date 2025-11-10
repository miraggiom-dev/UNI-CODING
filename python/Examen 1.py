from math import *

## EJERCICIO 1.

t = float(input("Ingrese el valor de t: "))
m = float(input("Ingrese el valor de m: "))
v = float(input("Ingrese el valor de v: "))

x = sqrt((sin(t)) * cos(pi/5)**2 + (tan(pi/6)) * log10(m)**2)
y = cbrt(v)

numerador = x / y

denominador = round(pi * sqrt(abs(sin(pi/4))))

V = numerador + denominador

print("El resultado del coeficiente es: ", V)

## EJERCICIO 3.

tuberias = []

## Ingreso d ela cantidad de tuberías ne los parámetros establecidos.

while True:

    try:
        cantidad = int(input("Ingrese la cantidad de tuberías (entre 5 y 8): "))

        if 5 <= cantidad <= 8:
            break
        else:
            print("La cantidad debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

    except:
        print("ERROR !!!")

## Ingreso de datos de las tuberías.

for i in range(cantidad):

    print("Ingrese los datos para la tubería", [i+1], ": ")
    datos = []

    ## ID.

    while True:

        try:
            ID = int(input("Ingrese el ID de la tubería (número entero positivo): "))

            if ID > 0:
                datos.append(ID)
                break
            else:
                print("El ID debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

    ## Caudal de entrada.

    while True:

        try:
            caudal_entrada = float(input("Ingrese el caudal de entrada de la tubería (entre 10 y 100): "))

            if 10 <= caudal_entrada <= 100:
                datos.append(caudal_entrada)
                break
            else:
                print("El caudal debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

    ## Caudal de salida.

    while True:

        try:
            caudal_salida = float(input("Ingrese el caudal de salida de la tubería (entre 0 y caudal de entrada): "))

            if 0 <= caudal_entrada <= (caudal_entrada):
                datos.append(caudal_salida)
                break
            else:
                print("El caudal debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

    ## Estado.

    while True:

        try:
            estado = int(input("Ingrese el estado de la tubería (1 para operativo, 0 para falla): "))

            if 0 <= estado <= 1:
                datos.append(estado)
                break
            else:
                print("El estado debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

    ## Nivel de corrosión.

    while True:

        try:
            nivel_corrosión = int(input("Ingrese el nivel de corrosión de la tubería (entre 0 y 100): "))

            if 0 <= nivel_corrosión <= 100:
                datos.append(nivel_corrosión)
                break
            else:
                print("El nivel de corrosión debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

    ## Prioridad de inspección.

    while True:

        try:
            prioridad = int(input("Ingrese el estado de la tubería (1 para alta, 2 para media, 3 para baja): "))

            if 1 <= prioridad <= 3:
                datos.append(prioridad)
                break
            else:
                print("La prioridad debe estar entre los parámetros solicitados. Inténtelo de nuevo.")

        except:
            print("ERROR !!!")

print(datos)