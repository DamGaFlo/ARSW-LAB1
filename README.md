# ARSW-LAB1

## BBP formula

- ### Introduccion
El objetivo de este laboratorio es trabajar y entender los Threads(subprocesos) con dos ejercicios que son: crear 3 hilos y que cada uno imprima un segmento distinto de números y buscar digitos de pi en hexagecimal. Este proyecto esta con fines académicos y con un gran aspecto técnico.

- ### Compilación y ejecución
primero debemos tener una copia local del repositorio puede usar el comando `git clone`. 

para compilarlo, el repositorio local, desde consola, nos ubicamos en la raiz del proyecto y usamos el comando `mvn package`.
Para la ejecucion basta con el comando `mvn exec:java -Dexec.mainClass="edu.eci.arsw.math.Main` desde consola. para algún resultado en especifico debera alterar la fuente.

- ## solucion a preguntas
	#### parte I
	Change the beginning with `start()` to `run()`. How does the output change? Why?
	
	en la salida con `run()` se mostraban los segmentos en orden y en el orden que se ejecuta cada en el código, por otro lado cuando usamos `start()` se ejecuto en desorden y se mostraba la parte de un segmento después la de otro y así sucesivamente, esto por la disponibilidad del medio en procesos paralelos.

	#### parte III

According to [Amdahls law](https://www.pugetsystems.com/labs/articles/Estimating-CPU-Performance-using-Amdahls-Law-619/#WhatisAmdahlsLaw?), where S (n) is the theoretical performance improvement, P the parallel fraction of the algorithm, and n the number of threads, the greater n, the greater the improvement should be. 

Why is the best performance not achieved with the 500 threads? 
Esto pasa por la falta de recursos físicos pues la teoría supone que se cuentan con estos y funcionan de al mejor manera. En este caso no es asi y se piden mas recursos de los que la maquina puede dar y esta falla en la busqueda de cumplir la petición.

How does this performance compare when 200 are used?.

En el caso del equipo que se uso, se obtuvo una mejor respuesta al usar 200 threads y aunque en ambos casos se pedían mas recursos de los que la maquina usaba podía dar en el caso de 200 threads se pudo distribuir mejor las tareas.

How does the solution behave using as many processing threads as cores compared to the result of using twice as much?
viendo las especificaciones de la maquina y contrario a los esperado se obtuvo mejores resultados cuando se uso el doble de subprocesos.

According to the above, if for this problem instead of 500 threads on a single CPU, 1 wire could be used on each of 500 hypothetical machines, would Amdahls's law be better applied? 
con lo que visto en la practica en una sola maquina creemos que se obtendría un mejor resultado  pues no se pedirian mas recurson de los que se necesitan.

If, instead, c threads were used in 500 / c distributed machines (where c is the number of cores of said machines), would it be improved? Explain your answer.

si, e incluso se aprovecharían mejor los recursos disponibles. eso notamos cuando usamos cuando usamos tanto subprocesos como núcleos.
