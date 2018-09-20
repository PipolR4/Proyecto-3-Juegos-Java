
package proyectoipc2;
import java.util.Random;
import java.util.Scanner;

public class ProyectoIPC2 {
    
public static char aj,as,pq;
public static int b,i,cont,cont2,n,l,pos,z,s,j,k,fin, ganaste,lineas,lineas2,i2,xx,q,c,eleccion,letra3,eleccion2,dato,dato1;

public static String a,letra,letra2,jugador1,jugador2;
public static boolean salir,salir2,salir3;
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
    Scanner t = new Scanner(System.in);
    Scanner u = new Scanner(System.in);
      while(!salir){
        System.out.println("      Proyecto IPC - Juegos en Consola");
        System.out.println("1. Ahorcado");
        System.out.println("2. Gato");
        System.out.println("3. Snake");
        System.out.println("4. Salir.");
        System.out.print("Ingrese una opción: ");
        eleccion = t.nextInt();
        limpiar();

          while(eleccion<4 && eleccion>0){
          switch(eleccion){
          case 1:
          
          ahorcado();
          break;
          case 2:
              limpiar();
              System.out.println("              Bienvenido al juego gato");
              System.out.println("");
              System.out.println("1. Persona vs Persona");
              System.out.println("2. Persona vs Computadora");
              eleccion2=u.nextInt(); 
              limpiar();
              while(eleccion2<0 && eleccion2>2){
              System.out.println("");
              System.out.println("1. Persona vs Persona");
              System.out.println("2. Persona vs Computadora");
              eleccion2=u.nextInt();  
               limpiar();
              }
              if(eleccion2==1){
                  limpiar();
              gato2personas();    
              }
              if(eleccion2==2){
                  System.out.println("PROCESAMIENTO");
              }
           
          break;
          
          }
          }
          }  
       System.out.println("Gracias por jugar!");
        
    }
    
    
    
    public static void limpiar(){
    lineas2=50;
    for ( i2=0; i2< lineas2; i2++)
    {
    System.out.println("");
    } 
    }
    
    
    
    
    public static void ahorcado(){
    Scanner x=new Scanner(System.in);
    Scanner t = new Scanner(System.in);
            salir3=false;
            limpiar();
            while(!salir3){
            System.out.println("Instrucciones:");
            System.out.println("1. Utiliza solo letras minusculas.");
            System.out.println("2. Cuentas con 5 oportunidades para adivinar la palabra");
            System.out.println("3. Si adivinas una letra de la palabra no perderas vidas.");
            System.out.println("4. No repitas letras!");
            System.out.println("5. Disfruta!");
            System.out.println("");
            System.out.print("'Enter' para continuar: ");
            letra2 =x.nextLine();
            limpiar();
            
            String[] palabras={"camion","arduino","libro","lapicero","raton","mochila","lapiz"};
            Random rand=new Random();
            z=rand.nextInt(6);
            a = palabras[z];
            s= a.length();
            ganaste=0;
            lineas=50;
            cont2=0;
            salir2 = false;
            eleccion=0;
            limpiar();
            System.out.println("Vidas: ♥♥♥♥♥");
            System.out.print("La palabra es: ");
            while(cont2<s){
            System.out.print("*");
            cont2++;
            }  
            System.out.println("");   
            cont=0;
            xx=0;
            String[] asteriscos= new String[s];
        
     
            while(xx<s){
           
            asteriscos[xx]="*";
         
          
            xx++; 
            }
           n=0;
           b= a.length();
           q=5;
           j=5;
           k=1;
           c=0;
           i=0;
        
           System.out.print("Ingrese una letra: ");
           letra =x.nextLine();
           aj=letra.charAt(0);
           limpiar();
        
        
           while(!salir2){
     
           while(c<b){
           as=a.charAt(i);         
           if(as==aj){
           ganaste++;
                
           System.out.println("");
            
           if(as==aj){
           pos=i;
           l=1;
           j=5;
           j=j-n;
    
           System.out.print("Vidas: ");
           while(j>0){
          
           System.out.print("♥");   
           j--;
           } 
           System.out.println("");
           xx=0;
           System.out.print("La palabra es: ");
           while(xx<s){
           asteriscos[i]=letra;
           System.out.print(asteriscos[xx]);
           xx++;   
           }      
           }     
           }
           i++;
           b--; 
           }
           if(ganaste==s){
           salir2=true;
           limpiar();
           System.out.println("Haz ganado! Descubriste la palabra!");
           System.out.println("La palabra era: "+a);
           }  
      
           if(l!=1){
           n++;    
           j=5;
           j=j-n;
           int prueba=5-n;
           if(j==0){
           salir2=true;
           limpiar();
           System.out.println("Haz perdido! Te quedaste sin vidas :(");
           System.out.println("La palabra era: "+a);
           }
           if(prueba!=0){
           System.out.println("");
           System.out.println("");
           System.out.print("Vidas: ");
        
           while(j>0){           
           System.out.print("♥");   
           j--;
           }
           System.out.println("");
           xx=0;
           System.out.print("La palabra es: ");
           while(xx<s){
           System.out.print(asteriscos[xx]);
           xx++;
           }
           }       
           }
    
          l=0;  
          i=0;
          if(!salir2){
          if(n<5){
          System.out.println("");
          System.out.print("Ingrese una letra: ");
          letra =x.nextLine();
          aj=letra.charAt(0);
          b= a.length();
          limpiar();
          }     
          } 
   
        }
          System.out.println("");
          System.out.print("'Enter' para continuar: ");
          letra2 =x.nextLine();
          limpiar();
         System.out.println("1. Volver a jugar");
         System.out.println("2. Volver al menu");
         letra3 =t.nextInt();
         limpiar(); 
         while(letra3<1 || letra3>2){
         System.out.println("Ingresaste un numero invalido");
         System.out.println("");
         System.out.println("1. Volver a jugar");
         System.out.println("2. Volver al menu");
         letra3 =t.nextInt();
         limpiar();
         }
          if(letra3==1){
              salir3=false;
          }
          if(letra3==2){
             salir3=true; 
          }
          
        }         
        menu();
    }
    
    
    
  public static void gato2personas(){
        Scanner z = new Scanner(System.in);
      boolean salir4= false;
      
      while(!salir4){
      String juego[][];
      juego = new String[3][3];
      int n1=0;
      int fila;
      int columna;
       for (int a1=0; a1<=2; a1=a1+1) {
                for (int b1=0; b1<=2; b1=b1+1) {
                juego[a1][b1]=" ";
                
                }
 
    }
       System.out.println("    BIENVENIDO AL JUEGO DE GATO");
       System.out.println("    Persona vs Persona");
       System.out.println(" ");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
        
        System.out.print("Jugador 1, ingresa tu nombre: ");
        jugador1 =z.nextLine();
        System.out.println("");
        System.out.print("Jugador 2, Ingresa tu nombre: ");
        jugador2 =z.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");

while(n1<10){
    
    System.out.println("Es tu turno "+jugador1);
    

       
do{
    System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}while (dato<0 || dato>2);
       
do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}while (dato1<0 || dato1>2);   

while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) { 
    System.out.println("");
System.out.println("A ingresado una jugada en donde ya existia una anteriormente");

do{
 System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}
while (dato<0 || dato>2);

do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}
while (dato1<0 || dato1>2); 

}
limpiar();
juego[dato][dato1] = "X";

    
System.out.println("        \n Tu turno \n");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 
n1++;

if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X") {
       System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X") {
       System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X") {
         System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
//diagonales faltan
if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X") {
         System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X") {
      System.out.println("Has ganado el juego "+jugador1);
break;
}

if(n1==5){
    System.out.println("EMPATE!");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    break;
    
}

System.out.println("Es tu turno "+jugador2);
    

       
do{
    System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}while (dato<0 || dato>2);
       
do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}
while (dato1<0 || dato1>2);   

while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) { 
System.out.println("");
System.out.println("A ingresado una jugada en donde ya existia una anteriormente");

do{
 System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}
while (dato<0 || dato>2);

do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}
while (dato1<0 || dato1>2); 

}
limpiar();
juego[dato][dato1] = "O";

    
System.out.println("        \n Tu turno \n");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 


if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O") {
        System.out.println("Has ganado el juego "+jugador2);
break;
}
if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O") {
        System.out.println("Has ganado el juego "+jugador2);
break;
}
else if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O") {
       System.out.println("Has ganado el juego "+jugador2);
break;
}
if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O") {
       System.out.println("Has ganado el juego "+jugador2);
break;
}
if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O") {
         System.out.println("Has ganado el juego "+jugador2);
break;
}
if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O") {
        System.out.println("Has ganado el juego "+jugador2);
break;
}
//diagonales faltan
if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O") {
         System.out.println("Has ganado el juego "+jugador2);
break;
}
if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O") {
      System.out.println("Has ganado el juego "+jugador2);
break;
}




}
          System.out.println("1.Volver a Jugar");
          System.out.println("2.Volver al menu");
          int eleccion =z.nextInt();
          while(eleccion<1 || eleccion>2){
            limpiar();
          System.out.println("Ingresaste un numero invalido");
          System.out.println("1.Volver a jugar");
          System.out.println("2.Volver al menu");
          eleccion =z.nextInt();   
          }
          if(eleccion==1){
              salir4=false;
        String ayuda =z.nextLine();
        limpiar();
          }
          if(eleccion==2){
              salir4=true;
              limpiar();
              }


      }
        menu(); 
  }
    
    
    
    
}
        
