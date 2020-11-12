import numpy as np

#Funcion que devolvera el valor dado en la ecuacion
def f(m):
    g=9.8
    arr=15
    v=35
    t=9
    return ((g*m)/arr)*(1-np.exp(-arr*t/m))-v

def fp(a,b,tolera):
    #Damos valor a las variables
    iteraciones=0
    resp=0
    fa=f(a)
    fb=f(b)
    c=b-fb*(a-b)/(fa-fb)
    fc=f(c)
    error=abs(c-a)

    #Ciclo que servira para encontrar la raiz 
    while (error>tolera):
        cambio=np.sign(fa)*np.sign(fc)
        
        if (cambio>0):
            a=c
        else:
            b=c
            
        c=b-(fb *(a-b))/(fa-fb)
        fc=f(c)
        error=abs(c-a)
        #Impresion de las iteraciones junto a su contador.
        iteraciones=iteraciones+1
        print("iteracion:",iteraciones)
        print ("c =",c)
        
    resp=c
    #Retorna el valor que tiene igual o menos del porcentaje de error
    return resp

#Se llama a la funcion principal, dando el valor de los intervalos y de la tolerancia.
solucion=fp(55,60,1e-3)

#Se imprime la raíz
print("\nLa raiz es:",solucion)
print("Intervalo: [55,60]")
