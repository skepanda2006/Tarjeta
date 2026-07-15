/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetas;

public class Tarjeta_Debito extends Tarjeta implements Transciciones{
   private final double LIMITE_RETIRO = 10000;
    private final double LIMITE_DEPOSITO = 20000;
    private static int  cont;
    private final int id;

    public Tarjeta_Debito(int id, String titular, String numero, String Clave,
                          String nip, String banco, String cvv,int saldo,
                          String expiracion) {

        super( numero, Clave,  nip, banco, cvv,saldo, expiracion);
        this.id = cont++;
        
    }
     public int getId() {
        return id;
    }
    private static final System.Logger LOG = System.getLogger(Tarjeta_Debito.class.getName());
    

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Tarjeta_Debito.cont = cont;
    }

    public String getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(String expiracion) {
        this.expiracion = expiracion;
    }

    @Override
    public void retirar() {
        System.out.println("Retirando dinero...");
    }

    @Override
    public void transferir() {
        System.out.println("Realizando transferencia...");
    }

    @Override
    public void depositar() {
        System.out.println("Realizando depósito...");
    }

    @Override
    public void pagar() {
        System.out.println("Pago realizado con tarjeta de débito.");
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
    public void extender() {
        System.out.println("Las tarjetas de débito no pueden extender crédito.");
    }

    @Override
    public void reportarRobo() {
        setActivo(false);
        System.out.println("Tarjeta reportada como robada.");
    }

    @Override
    public void comprar() {
        System.out.println("Compra realizada con tarjeta de débito.");
    }
}
