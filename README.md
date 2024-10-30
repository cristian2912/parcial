# parcial segundo corte Cristian Bello
punto 1

¿Qué es un perceptrón y para qué sirve? 
Un perceptrón es una neurona artificial, la cual se usa para las redes neuronales. Las neuronas artificiales imitan el funcionamiento de las neuronas del cerebro.
En ese orden de ideas, un Perceptrón es una neurona artificial, es por esto, que el perceptrón hace cálculos para detectar características en los datos de entrada, esto a partir de una algoritmo de aprendizaje, el cual permite que las neuronas artificiales aprendan y traten cada uno de los elementos que contiene una serie de datos, es importante recordar que el aprendizaje que tiene el perceptrón consiste en enseñarle al algoritmo a hacer predicciones, para esto se debe alimentar el algoritmo con datos.
El perceptrón es una función matemática, los datos de entrada se multiplican por los coeficientes de peso y el resultado es un valor, el cual puede ser positivo o negativo, la neurona solo se activa si el valor es positivo y solo se activa si el peso calculado de la entrada supera un umbral determinado, por último, el resultado de la predicción se compara con resultados conocidos y en caso de diferencia, el error se retro propaga para que se puedan ajustar los pesos
El perceptrón consta de 3 componentes principales: 1) Nodos de entrada: estos reciben valores de entrada que en este caso son 1 y -1. 2) Nodo de sesgo: siempre tiene una activación de 1. 3) Nodo de salida: recibe los valores de la entrada multiplicados por sus pesos correspondientes y produce una salida binaria, esto si la suma supera o no el umbral determinado. 

![image](https://github.com/user-attachments/assets/9bf51f74-2a99-4e45-8d06-3fda51e8f20a)

Para la implementación:
Usé variables globales. epoch-error almacena el error acumulado durante el entrenamiento, mientras que input-node-1 y input-node-2 guardan las referencias a los nodos de entrada. Cada enlace (link) tiene un peso asignado y cada tortuga (representando nodos en el espacio 2D) posee una activación que indica su estado. Los nodos, tanto de entrada como de salida, tienen un umbral (threshold) que define el punto de decisión de activación.
En el procedimiento setup, configuro el entorno visual, aplicando colores y formas a los nodos. Primero, creo el nodo de salida (perceptrón) con una activación inicial aleatoria y el nodo de sesgo (bias) con una activación fija de 1, que se conecta al perceptrón. Luego, creo los nodos de entrada, cada uno con una activación aleatoria de 1 o -1.
En la fase de entrenamiento, el perceptrón ajusta los pesos en función de ejemplos de entrenamiento. Los pesos se actualizan en base al error de la salida calculada respecto al valor objetivo, lo que permite que el modelo aprenda a clasificar los datos de acuerdo a funciones lógicas (como XOR, OR, AND, etc…).
Las funciones lógicas, como XOR, OR y AND, ayudan al aprendizaje del perceptrón y definen los objetivos para la activación de los nodos de entrada.

Guías y referencias:

1.	Rand, W. y Wilensky, U. (2006). Modelo de red neuronal artificial NetLogo - Perceptrón. http://ccl.northwestern.edu/netlogo/models/ArtificialNeuralNet-Perceptron. Centro para el aprendizaje conectado y el modelado basado en computadora, Universidad Northwestern, Evanston, IL.
2.	Daniel. (2023, 30 octubre). Perceptrón: ¿qué es y para qué sirve? Formación En Ciencia de Datos | DataScientest.com. https://datascientest.com/es/perceptron-que-es-y-para-que-sirve.
3.	https://youtu.be/Fu273ovPBmQ?si=bOE25gtN1TbgPzY4.
4.	Wilensky, U. (1999). NetLogo. http://ccl.northwestern.edu/netlogo/. Centro para el aprendizaje conectado y el modelado basado en computadora, Universidad Northwestern, Evanston, IL.

Capturas:

![image](https://github.com/user-attachments/assets/1b59f717-8bab-41b5-b4f4-3bb198487eb6)

![image](https://github.com/user-attachments/assets/9d952817-c5d0-4330-bcc3-e7099e920f83)

Codigo: ver "puntouno.py"


