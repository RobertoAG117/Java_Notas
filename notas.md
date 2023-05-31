# JAVA
Empezaremos por los moldes 
en este caso tenemos como inicio 
(es fundamental poner el nombre de la clase en mayuscula)
public class Variables{
}
esta sintaxis es necesario respetarla por lo que tenemos que poner dentro de las llaves el código a programar
public class Variables{
----public static void main (String[args]){
 
 }
}
Por lo general se ponen 4 espacio o un tab


public class Variables{
----public static void main (String[args]){
  String "aldo" int 18 float 9 boolean Aprobo
   jorge 32  5  No aprobo 
   rafa  35  6  Aprobo
   
 }
}

es importate esclarecer cada uno de los datos que vamos a introducir en este caso es necesario poner el tipo (En este punto son argumentos)
### DATOS
Los Strings van entre comillas " ejemplo "
Los enteros INT no van entre comillas por lo que no es necesario encerrarlos 
Los datos con decimales son FLOAT, estos se procesan diferente, tampoco llevas comillas
En el ejemplo el texto Aprobo son de tipo boolean ya que son falso o verdadero (true/false)

Variable 
Son los datos que se generan en base a las clases, por lo que es más sencillo de usar en el programa, así no escribimos tanto código

Ejemplo en edad crearíamos la variable edad (digamos que es una caja)
Cada variable se debe declarar al momento de empezar el programa
Si es posible inicializa tus variables antes de usarlas

Es fundamental el uso de los ; (punto y coma)

 tipo / nombre / valor
 
 public class Variables{
----public static void main (String[args]){
    String nombre = "Pedro"; 
    (en dado caso de no tener valor sería)
    String nombre;
    
  }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

NO poner números
No poner palabras reservadas
No poner espacios dentro de los nombres de las variables

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Es mejor comentar al princio las variables, por ejemplo poner a que va relacionado o con que datos esta trabajando
Tenemos 3 tipos de variables
Variables fuera de metodo son las que estan fuera
Variables que estan dentro de metodo que afectan a todo el metodo
Variables que estan solo dentro de un for por ejemplo 

public class Variables{
----public static void main (String[args]){
    int edad;
    float calificacion;
    bool aprobe;
 }
}

para agregar comentarios en los programas es //comentario
para comentarios largos es 
/* comentario largo */


public class Variables{
----public static void main (String[args]){
    int edad;
    float calificacion;
    bool aprobo;
// inicializa valor
    nombre = "Juan";
    edad = 30;
    calificacion = 8.5;
    aprobo = true;
    //sirve para imprimir
    System.out.printIn(nombre, edad, calificacion, aprobo);
    
    
ejemplo  funcion(argumento)
cada que pidamos un tipo de dato es necesario ponerle sus respecticas comillas si las necesita
 funcion("nombre", "hola")

clases y metodos no llevan ; 

javac "nombre" variables.java


C:\Users\PILARES\Documents\Wolf\java

Tenemos diversos tipos de datos por lo que trabajaremos con los soguientes
los enteros tipo byte seran del -128 al 127
el tipo de dato short será del -32000 al 32000
int = a -2140000 al 2140000
los tipos de dato mayores a 2 millones son long 

Para los tipos flotante son
double y float
Double será para 12 espacios luego del punto  
float es para 8 espacios luego del punto 

Para los caracteres
char será para un solo caracter con comillas "A"
String para los más largos

Los tipos boleanos serán
boolean = true/false
de momento para poner espacios en la impresion usaremos +" "+
EL código es
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/3041db8e-1bb3-4ad3-83c4-57a8f2c72eed)
el resultado de la compilacion fue
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/46fde224-cb05-4ded-97cc-0ae25192c0ce)

podemos hacer uso de un "/n" para que haga u brinquito y poder imprimir








