public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Hola ", "mi ", "nombre ", "es ", "JuanG"};
        String concatenado = "";
        for (String nombre : nombres) {
            concatenado += nombre;
        }
        System.out.println(concatenado);
    }
}