# Curso Java 25/26

Este es el repositorio del módulo de programación de DAW Bilingüe del centro IES Pío Baroja.
Aquí se pueden encontrar los distintos ejemplos que vamos realizando en clase.
Todo el código se encuentra en la carpeta src. Cada ejemplo formará parte del paquete de la 
unidad correspondiente (udX) si es un ejemplo con una sola clase o de un subpaquete dentro de la 
unidad si posee varias clases (udX.ejemplo).

Todo el código está pensado para usarse con Java 25. Para determinar la versión de Java instalada
prueba el siguiente comando:

    java --version

## Clonar el repositorio

Para poder tener el código es tu ordenador primero deberás clonar el repositorio. Si tienes
configurada una llave ssh en github prueba:

    git clone git@github.com:Juanki0396/CursoJava25.git

Si no tienes ssh prueba:

    git clone https://github.com/Juanki0396/CursoJava25.git

Cada vez que haya una actualización en el repositorio de Github debería correr el siguiente
comando para actualizar tu repositorio local:

    git pull

Recuerda que **cualquier comando de git debe ejecutarse desde dentro del directorio**. Para 
asegurarte, el siguiente comando deberia devolver la ruta del directorio:

    pwd

En caso de que no te encuentres en el directorio del repositorio, utiliza el siguiente comando
para cambiar:

    cd RutaAlRepositorio

## Compilación y ejecución

Para poder compilar y ejecutar debemos encontrarnos en el directorio del repositorio. Una vez ahí
debes crear una carpeta para guardar los archivos compilados

    mkdir bin

Una vez creado el directorio, podemos compilar llamando a javac

    javac -d bin src/*.java

Una vez compilado, podremos correr cualquier ejemplo utilizando el nombre de la clase que contiene
el método main:

    java -cp bin udX.subpaquete.Clase


