import java.util.Random;

public class Dado {
    private int caraFrontal;

    public Dado() {
        this.caraFrontal = caraFrontal;
    }

    public int lanzar(){
        Random random = new Random();
        int numero = random.nextInt(6)+1;
        return numero;
    }


    public int getCaraFrontal() {
        return caraFrontal;
    }

    public void setCaraFrontal(int caraFrontal) {
        this.caraFrontal = caraFrontal;
    }


}
