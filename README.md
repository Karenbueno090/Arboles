# EA3. Actividad – Árboles

# IU Digital
## Docente
Steven Zuluaga

## Asignatura
Estructura de Datos

## Curso
PREICA2502B010080

## Grupo de estudiantes


## Integrantes
Karen Dayana Bueno Cruz  
Santiago Cano

## Objetivo del Proyecto
Nuestro Objetivo es desarrollar en java un programa que implemente un árbol binario simple, que permita insertar, recorrer y buscar números, con la idea de comprender la estructura para la creación de un árbol binario en programación y así fortalecer las habilidades de uso de estructuras de datos, el trabajo colaborativo y la documentación técnica en GitHub.

## Definición de un Árbol Binario
Un árbol binario es una estructura de datos jerárquica en la que cada nodo tiene como máximo dos hijos:
•	Hijo izquierdo (izq)
•	Hijo derecho (der)
En este proyecto se implementa un Árbol Binario de Búsqueda (ABB), donde:
•	Los valores menores al nodo actual se insertan a la izquierda.
•	Los valores mayores o iguales se insertan a la derecha.
Esto permite organizar y buscar datos de manera más eficiente.

## Funcionalidades del programa
El programa ofrece un menú en consola con las siguientes opciones:
1.	Insertar número → Agregar un valor al árbol.
2.	Mostrar recorrido inorden → Muestra los datos en orden ascendente.
3.	Buscar un número → Indica si un valor existe dentro del árbol.
4.	Salir → Termina la ejecución

## Cómo se implementó
- Se definió la clase Nodo con:  
  -	dato → valor numérico.  
  -	izq y der → referencias a los hijos.  
- Se creó la clase ArbolBinario que incluye:  
  -	insertar() → para agregar elementos.  
  -	recorrerInOrden() → para mostrar los elementos en orden ascendente.  
  -	buscar() → para verificar si un número está en el árbol.  
- Se desarrolló la clase Main con un menú interactivo en consola para probar todas las operaciones.

- Cómo ejecutar
Requisitos: Java, Git y Intellij IDEA.

Clonar Repositorio
https://github.com/Karenbueno090/Arboles.git

Abrir entorno de ejecuciones (Intellij IDEA)

Captura de pantalla del código
