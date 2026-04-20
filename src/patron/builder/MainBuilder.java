package patron.builder;

public class MainBuilder {
    public static void main(String [] args){

        Computadora pcGamer=new Computadora.Builder("Intel I9", 32)
                .setTarjetaVideo(true)
                .setBluetooth(true)
                .build();
        System.out.println("PC "+ pcGamer.getProcesador());
    }
}
