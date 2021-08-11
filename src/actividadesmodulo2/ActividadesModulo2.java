/*
En Colombia hay medidas que regulan la velocidad de los
automoviles según las zonas donde se encuentre:
- 30KM/H – Zonas Escolares
- 60KM/H – Vías Urbanas
- 80KM/H – Vías Rurales
- 100KM/H – Rutas Nacionales
Realice un algoritmo que permita determinar según una velocidad
X, a qué grupo de límites pertenezco y si estoy infringiendo los límites
de velocidad.
*/
package actividadesmodulo2;
public class ActividadesModulo2 {
public static void main(String[] args) {
int velocidad = 101;
if (velocidad >= 0 && velocidad <=30){
    System.out.println("Zona escolar");
}else if (velocidad > 60 && velocidad <= 60){
    System.out.println("Vias urbanas");
}else if (velocidad > 80 && velocidad <= 100){
    System.out.println("Rutas nacionales");
}else {
    System.out.println("Infringiendo la ley");
}
}
}
    

