package interfacerepaso;

public class PagoTarjeta implements Pago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con tarjeta "+monto);
    }
}
