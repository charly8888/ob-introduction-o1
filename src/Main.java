public class Main {

    public static void main(String[] args){

     int resultado = suma(4,5, 111);
    System.out.println(resultado);

    var Toyota = new Coche();

    Toyota.moreDoors();
    System.out.println(Toyota.puertas);
    }

    public static int suma(int a, int b, int c) {
        return  a + b + c;
    }

    public static class Coche{
        int puertas = 4;

         void moreDoors(){
            this.puertas ++;
        }
    }
}
