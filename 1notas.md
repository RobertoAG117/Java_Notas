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


## Notas del día 01/06/2023
Operadores 
Se utilizan datos guardados en variables
las herramientas que usaremos serán 
vscode (para poner el código)
herramienta para ubicar el código es 

 Hoy haremos un programa para determinar la edad de una personas en base al año de nacimiento e java 
 esta fue mi propuesta
 ![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/f4338636-8b12-4ac0-9a96-aa4a0c35573e)

import java.util.Scanner;
public class wolfwolf{
    public static void main (String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= sc1.nextInt();
        int resta= 2023-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        boolean mayor= resta>=18;
        System.out.println("Si es mayor imprime true si es menor imprime false"+" "+mayor);
    }
}
en caso de querer determinar la edad en base el año del sistema tenemos que poner una variable extra

![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/af066291-0285-4235-8197-b43b3648148e)
import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= sc1.nextInt();
        int resta= año-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        boolean mayor= resta>=18;
        System.out.println("Si es mayor imprime true si es menor imprime false"+" "+"determinamos con lo anterior que la persona es "+mayor);
    }
}



Tedremos 3 tipos de condicionantes
por lo que vamos a retomar los diagramas de flujo para tener un mejor orden y no confundirse

simple
por ejemplo si tenemos la edad y es mayo o igual a 18 sice que es mayor pero si no, no pasa nada
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/eeaa54fe-36d5-468b-9361-59d08609619f)

compuesta 
en este mismo ejemplo nos dira en caso opuesto que es menor}
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/6ba58dfa-d0bc-4f9d-805a-65e1bf01fda6)

añadida
pero en lugar de imprimir un resultado nos manda a otra condicion o prosigue sin mayor problema por lo que toma otro camino el programa 
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/eeeb52da-93dd-493a-9887-42a5c1ba2147)


dependiendo usaremos diversos tipos en este caso usaremos un if para el ejemplo
(CONDICIONANTE SIMPLE)
if(condicion){
ejecucion
(CONDICIONANTE COMPUESTA)
if(condicion){
}else{
}
(CONDICIONANTE AÑADIDA)
if(condicion){
}else if(condicion){
} // puede tener un else o no dependiendo//

![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/743ba92d-427d-469c-a0ac-bf4af817fe6a)

import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= sc1.nextInt();
        int resta= año-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        if(resta>=18){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
            }
        
    }
}

en este caso es un poco más complejo hicimos uso de las condicionales

![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/8f16f99c-4ba6-4e8e-bd5e-8501a8d9745f)
realizamos un ejemplo de condicionante añadida por lo que veremos muchos else if

import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= sc1.nextInt();
        int resta= año-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        if(resta>=10 && resta <=15){
            System.out.println("es niño");
        }else if(resta>=16 && resta <=17){
            System.out.println("es adolescente");
        }else if(resta>=18 && resta <=25){
            System.out.println("es joven");
        }else if(resta>=26 && resta <=35){
            System.out.println("es joven adulto");
        }else if(resta>=36 && resta <=60){
            System.out.println("es adulto");
        }else if(resta>=60 && resta <=200){
            System.out.println("es tercera edad");
        }
    }
}


en la versión 2 ponemos que tiene 2 formas por si se introduce el año mal o por si tenemos problemas de de años
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/769df107-dbcc-4bbe-b5f6-75b4eb85f328)
import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento entre 1923 y 2013: ");
        int añodenacimiento= sc1.nextInt();
        if(añodenacimiento<=1923 || añodenacimiento >=2013){
            System.out.println("ingresaste mal el año de nacimiento"+" "+añodenacimiento);
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Ingres el año de nacimiento entre 1923 y 2013: ");
            int añodenacimiento2= sc2.nextInt();
            int resta= año-añodenacimiento2;
            System.out.println("Su edad es"+" "+resta);
            if(resta>=10 && resta <=15){
                System.out.println("es niño");
            }else if(resta>=16 && resta <=17){
                System.out.println("es adolescente");
            }else if(resta>=18 && resta <=25){
                System.out.println("es joven");
            }else if(resta>=26 && resta <=35){
                System.out.println("es joven adulto");
            }else if(resta>=36 && resta <=60){
                System.out.println("es adulto");
            }else if(resta>=60 && resta <=200){
                System.out.println("es tercera edad");
            }
            }else{
                int resta= año-añodenacimiento;
            System.out.println("Su edad es"+" "+resta);
            if(resta>=10 && resta <=15){
                System.out.println("es niño");
            }else if(resta>=16 && resta <=17){
                System.out.println("es adolescente");
            }else if(resta>=18 && resta <=25){
                System.out.println("es joven");
            }else if(resta>=26 && resta <=35){
                System.out.println("es joven adulto");
            }else if(resta>=36 && resta <=60){
                System.out.println("es adulto");
            }else if(resta>=60 && resta <=200){
                System.out.println("es tercera edad");
           }
        }
    }
}

-----------------------------------------------------------------------------------
Día 07/06/2023
Repaso de condicionales
si tenemos un 
if(condicinal){
 ejecutar
 }else{
  ejecutar
 }

podemo tener condicionantes mas complejas como 
if(condicinal){
 ejecutar
 }else if{
  ejecutar
 }else{
  
 }
en el cual tenemos la opción de alargarlo infinitamente siempre y cuando respetemos que luego de cada else if irá otro else if
si es necesario se pondrá un else para finalizar 

Dependiendo del ciclo y las condiconales que tengamos es cuando se va a detener por lo que para evitar bucles tendremos que poner una condicional que 
sea especifica en el diagrama de flujo
en java tenemos:
while:
este tipo se ejecuta infinitamente hasta que se le ponga una condicion o que tengamos una condicional 
este primero valida y luego pregunta o ejecuta

dowhile:
este primero pregunta o ejecuta y liego valida
for:
es para cuando sabemos cuantas veces se va a ejecutar el código 

el ciclo for tiene como estructura: (inicia, hasta, aumenta)/(inicio, condicion, incremento)
for(condicion ){
   ejecucion
}
for es una variable local por lo que podemos tener otras variables las cuales solo afectan al ciclo for}
este tiene como variables las letras empezando por la i,j,k,l,m, etc
el ejemplo es:
   (inicia, hasta, aumenta)
for(int i=1: i==10; i=1){
   System.out.println(i);
}
con el break podemos romper el ciclo, por lo que en cuanto lo lea se va a salir (break;)
todo lo que esta debajo del break ya no lo ejecuta

si usamos (continue;) permite saltar y seguir a la siguiente instacia que encuentre /sirve para romper el ciclo pero funciona para salir del for

while: (mientras)
es una clase
su estructura es;
      (condicion)
while (i =='s'){
  i="n";
}
tenemos que dar la posibilidad de cambiar el ciclo para salir de este, no sale sola por lo que se puede buclear

para el do while la estructura es:
do{
   i="n";
}while();

-----------------------------------------------------------------------------------------------------------------------------------------------------
Para el ejercicio del día 16/06/2023 
realizaremos un ejercicio en el cual solicita un arreglo y un ciclo
![image](https://github.com/RobertoAG117/Java_Notas/assets/125500565/3dae9b40-63f6-4969-8263-9de74ddf3bdf)

public class ArregloNumeros {
    public static void main(String[] args) {
        int[] numeros = {12, 10, 4, 24, 5, 9};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo en la posición " + i + " tiene el número " + numeros[i]);
        }
    }
}

esta es mi primera versión pero podemos mejorar el código 

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

hoy veremos el proceso de abstraccion 
por lo que para esta sesión tomaremos en cuenta un diferente tipode programacion

es necesario tener diversos tipos de copias por lo que es necesario tener un machote
es necesario ir sacando copias para rellenar en lugar de llenar en el original por lo que no se va a guardar nada en el original 
dependiendo de los requisitos del programa veremos los diversos tipos de variables
la bastraccion es la selccion de que es necesario y que no, por lo que es necesario identificar que datos son necesarios y cuales no 

cada documento tiene usabilidad, por lo que podemos usar los metodos(funciones)
por lo que es necesario ver que podemos hacer ejemplo
guardarlo, modificarlo, eliminarlo, consultarlo

instanciar es sacar un copía del molde para usarla, por lo que el molde sería la clase

para ciertos casos tendremos que modificar el formato con las mismas caracteristicas pero agregando algo 

para el elemento principal es nombrado la super clase, para la copia seria 
no tiene limite para heredar copias sin embargo podemos tener modificaiones pero el orignal nunca debe cambiar

polimorfismo (se llama igual pero trabaja de forma diferente)
el encapsulamiento es como proteges los objetos de modificaciones no requeridas u problemas ajenos al programa
tendremos diversas variables

class
string
int
boolean
void()

es necesario que para encapsular usar get y set ya que dependemos de las metodologías 





Arrays (Ordenamiento)
[4,3,1,5,2]

Podemos ordernar con 
- ordenamiento de burbuja
- rápida
- inserción

Ordenamiento de burbuja
hace referencia a las burbujas, por lo que las más pequeñas suben
por lo que hace comparaciones, con los elementos de los costados, dependiendo del elemento, es como se ordenan los elementos
dependiendo de si cada elemento es menor o mayor se cambiará el órden
(se comparan los valores varas veces para identificar, cual es diferente

necesitamos tener un indice, se compara de izquierda a derecha, por lo que se compara con el elemento que se tenga a lado


rápida
se necesitan 3 variables, el incio, el final y el pivote
por lo que va a dividir, cuales estan en mayor y en menor, dependiendo del elemento, simplemente compara entre los que son mayores y menores al elemento seleccionado, ordenando los menos de lado izquierdo y los mayores de lado derecho 

inserción
en el motodo por inserción se tiene que ir recorriendo respectivamente, ya que va moviendo por posiciones
el indice será el encargado de verificar si el elemento es menor o mayor respectivamente 


dependiendo de la necesidad del programa será el procedimiento a usar
ne


























