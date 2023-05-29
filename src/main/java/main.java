public class main {
    public static void main(String[] args) {
        Dado dado = new Dado();

        int num1 = dado.lanzar();

        int num2  = dado.lanzar();


        Calculadora calculadora = new Calculadora(num1, num2);

        if(calculadora.sumar()==7) {
            System.out.println("Ganaste");
        }
        else System.out.println("Perdiste");

    }
}
