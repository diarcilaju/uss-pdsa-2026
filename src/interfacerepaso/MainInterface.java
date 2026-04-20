package interfacerepaso;

public class MainInterface {
    public static void main(String []args){
        PagoEfectivo pagoEfectivo=new PagoEfectivo();
        PagoTarjeta pagoTarjeta=new PagoTarjeta();

        pagoEfectivo.procesarPago(40.50);
        pagoEfectivo.medioPagar("YAPE");
        pagoTarjeta.procesarPago(80.20);
    }
}
