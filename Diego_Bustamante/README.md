# **Método de la regla falsa/FalsaPosicion**

Es un método iterativo de resolución numérica de ecuaciones no lineales. El método combina el método de bisección y el método de la secante.

Como en el método de bisección, se parte de un intervalo inicial [a0,b0] con f(a0) y f(b0) de signos opuestos, lo que garantiza que en su interior hay al menos una raíz (véase Teorema de Bolzano). El algoritmo va obteniendo sucesivamente en cada paso un intervalo más pequeño [ak, bk] que sigue incluyendo una raíz de la función f.
A partir de un intervalo [ak, bk] se calcula un punto interior ck.

Dicho punto es la intersección de la recta que pasa por (a,f(ak)) y (b,f(bk)) con el eje de abscisas (igual a como se hace en el método de la secante).

Se evalúa entonces f(ck). Si es suficientemente pequeño, ck es la raíz buscada. Si no, el próximo intervalo [ak+1, bk+1] será:

    - [ak, ck] si f(ak) y f(ck) tienen signos opuestos;
    - [ck, bk] en caso contrario.


# **C:**