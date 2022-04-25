public class main {

    public static void main(String[] args) {

        //punto 1: Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        System.out.println("*-*-*-*-*-*-*-*-* Punto 1 *-*-*-*-*-*-*-*-*");
        int numeroIf=10;
        if (numeroIf>0){
            System.out.println("El numero es mayor que 0");
        } else if(numeroIf<0){
            System.out.println("El numero es menor que 0");
        } else {
            System.out.println("El numero es 0");
        }

        // punto 2: Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea
        // inferior a 3

        System.out.println("*-*-*-*-*-*-*-*-* Punto 2 *-*-*-*-*-*-*-*-*");
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println("Se ejecuta el ciclo while, numeroWjile: "+numeroWhile);
            numeroWhile++;
        }

        // punto 3: Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
        // ejecutar una vez.

        System.out.println("*-*-*-*-*-*-*-*-* Punto 3 *-*-*-*-*-*-*-*-*");
        int numeroDoWhile=0;
        do{
            System.out.println("Se ejecuta el ciclo Do-while, numeroDoWjile: "+numeroDoWhile);
        } while (numeroDoWhile>3);

        // punto 4: Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición
        // será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
        // deberá mostrarse por pantalla.

        System.out.println("*-*-*-*-*-*-*-*-* Punto 4 *-*-*-*-*-*-*-*-*");
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("Se ejecuta el ciclo For, numeroFor: "+numeroFor);
        }

        // punto 5: Switch
        System.out.println("*-*-*-*-*-*-*-*-* Punto 5 *-*-*-*-*-*-*-*-*");
        var estación = "verano";
        switch (estación){
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otóño");
                break;
            default:
                System.out.println("No se ha encontrado la estación");
                break;
        }
    }


}

