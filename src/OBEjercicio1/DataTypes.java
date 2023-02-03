package OBEjercicio1;

public class DataTypes {

    public static void main(String[] args) {

        System.out.println("Este es mi primer proyecto en java");

        //cadenas de texto
        String nombre = "Rolando";
        String apellidoPaterno = "Ramirez";
        String apellidoMaterno = "Guerra";

        //datos numéricos
        byte nariz = 1;//byte permite números enteros pequeños
        int edad = 21;//int permite un entero de 10 dígitos
        float altura = 1.74f;//float permite cualquier número con decimales siempre y cuando tenga la f.
        short ojos = 2;//short permite un entero de 5 dígitos
        double peso = 80.5;//double permite cualquier número con decimales

        //datos booleanos
        boolean soyHombre = true;
        boolean soyCasado = false;
        boolean tengoNovia = true;

        System.out.println("Mi nombre es: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Tengo " + nariz + " nariz");
        System.out.println("Tengo " + ojos + " ojos");
        System.out.println("Mi altura es: " + altura + " metros");
        System.out.println("Mi peso es: " + peso + " kilogramos");
        System.out.println("Soy hombre? " + soyHombre);
        System.out.println("Soy casado? " + soyCasado);
        System.out.println("Tengo Novia? " + tengoNovia);
    }
}
