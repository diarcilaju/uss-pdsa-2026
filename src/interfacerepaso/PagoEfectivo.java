package interfacerepaso;


public class PagoEfectivo implements Pago, MedioPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado en efectivo "+monto);
    }

    @Override
    public void medioPagar(String medio) {
        System.out.println("El medio de pago es: "+medio);
    }
}
