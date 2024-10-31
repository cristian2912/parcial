# parcial segundo corte Cristian Bello


# punto 1

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

Codigo: ver "puntouno.nlogo"


# Punto 2

Para la implementación importé las clases necesarias del paquete mesa, que es una biblioteca de Python para la creación de modelos de simulación, importé Agentpara crear agentes y Modelpara crear el modelo en sí, importé BaseSchedulerde mesa.timepara gestionar la programación de los agentes, luego creé una clase llamada CalculadoraAgentque hereda de Agent, esta clase representa un agente que puede realizar diferentes operaciones matemáticas. Dentro del constructor __init__, inicialicé el agente con un identificador único ( id_unico), el modelo al que pertenece ( modelo), y el tipo de operación que puede realizar ( tipo_operacion) despues de esto, implementé el método realizar_operacion, que toma dos números ( x y y) y realiza la operación correspondiente según el tipo_operaciondel agente, aqui use las operaciones necesarias: suma, resta, multiplicación, división y potencia.

Después, defini la clase ModeloCalculadora, que hereda de Model. Esta clase representa el modelo completo que contiene los agentes,en el constructor de este modelo, inicialicé el programador ( scheduler) y creé instancias de CalculadoraAgent para cada tipo de operación matematica, despues implemente el método ejecutar_calculo, que recibe un operador y dos números y llama al agente correspondiente para realizar la operación, por ultimo, cree una función llamada iniciar_calculadora que permite a los usuarios interactuar con la calculadora, se le pide al usuario que introduzca una operación y en caso de que ya se termine escribe "salir" y listo.

Codigo: ver puntodos.py


# Punto 3

Implementacion:

Importé la librería kotlin.math, para poder usar funciones matemáticas como: (seno, coseno, etc...) luego creé una clase llamada BaseCalculadora, que contiene métodos para realizar operaciones aritméticas básicas: (suma, resta, multiplicación y división) los metodos pueden ser sobrescritos por clases que hereden de esta gracias a "open" después, cree una clase llamada CalculadoraAvanzada, que hereda de BaseCalculadora. Esta clase incluye operaciones matemáticas avanzadas y una variable privada para manejar la memoria de la calculadora, es por estto que añadí funciones para manejar una memoria privada, esas funciones permiten agregar, reiniciar, recuperar y limpiar el valor almacenado en memoria, para finalizar implementé la función principal y utilizo println para mostrar los resultados de las operaciones en la consola.

Aplique los principios de la Programación Orientada a Objetos para estructurar mi código de manera que sea modular, reutilizable y fácil de mantener. El encapsulamiento protege los datos internos, la herencia permite la reutilización del código y el polimorfismo proporciona flexibilidad en la forma en que se pueden utilizar los métodos de las clases, todo esto se refleja en aspectos como: el encapsulamiento en la variable memoria la cual puede agregar, restar y recuperar la memoria y la herencia en que una clase como lo es CalculadoraAvanzada, herede de BaseCalculadora.

Codigo: ver Main.kt
