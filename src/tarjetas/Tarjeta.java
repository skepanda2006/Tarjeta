/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetas;


public abstract class Tarjeta {
   
    private String numero;
    private String Clave;
    private String nip;
    private  String banco;
    private String cvv;
    private int saldo ;
    private boolean activo = true;
    String expiracion;

    public Tarjeta( String numero, String Clave, String nip, String banco, String cvv, int saldo, String expiracion) {
       
        this.numero = numero;
        this.Clave = Clave;
        this.nip = nip;
        this.banco = banco;
        this.cvv = cvv;
        this.saldo = saldo;
        this.expiracion = expiracion;
    }
    
    

    public String getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(String expiracion) {
        this.expiracion = expiracion;
    }
    
    
    

   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBango() {
        return banco;
    }

    public void setBango(String bango) {
        this.banco = bango;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
      public void verInfoTarjeta() {
        // Mostrar información
    }

    public void verMovimientos() {
        // Mostrar movimientos
    }      
    
}
