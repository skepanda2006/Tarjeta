/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetas;


public class Tarjeta_Credito extends Tarjeta implements Transciciones {
       private double credito;
    private double anualidad;
    private String fechaPago;
    private static int cont;
    private final int id;

     public Tarjeta_Credito(int id, String titular, String numero, String Clave,
                          String nip, String banco, String cvv, int saldo,
                           String expiracion,double credito,double anualidad,String fechapago) {

        super( numero, Clave, nip, banco, cvv, saldo, expiracion);
        this.anualidad = anualidad;
        this.credito = credito;
        this.id = cont++;
    }
      public int getId() {
        return id;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getAnualidad() {
        return anualidad;
    }

    public void setAnualidad(double anualidad) {
        this.anualidad = anualidad;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public void retirar() {
        System.out.println("Retiro de efectivo con tarjeta de crédito.");
    }

    @Override
    public void transferir() {
        System.out.println("Realizando transferencia...");
    }

    @Override
    public void depositar() {
        System.out.println("No se puede depositar directamente a una tarjeta de crédito.");
    }

    @Override
    public void pagar() {
        System.out.println("Pago realizado a crédito.");
    }

    @Override
    public void consultar() {
        System.out.println("Saldo disponible: $" + getSaldo());

    }

    @Override
    public void bloquear() {
        setActivo(false);
        System.out.println("Tarjeta bloqueada.");
    }

    @Override
    public void desbloquear() {
        setActivo(true);
        System.out.println("Tarjeta desbloqueada.");
    }

    

    @Override
    public void reportarRobo() {
        setActivo(false);
        System.out.println("Tarjeta reportada como robada.");
    }

    @Override
    public void comprar() {
        System.out.println("Compra realizada con tarjeta de crédito.");
    }

    @Override
    public void extender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
