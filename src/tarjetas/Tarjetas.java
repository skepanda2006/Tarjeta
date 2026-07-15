/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetas;
import java.util.ArrayList;
import java.util.Scanner;


public class Tarjetas {
     static Scanner leer = new Scanner(System.in);

    static ArrayList<Tarjeta_Debito> listaDebito = new ArrayList<>();
    static ArrayList<Tarjeta_Credito> listaCredito = new ArrayList<>();

    
    public static void main(String[] args) {
        boolean cont = true;
       int opcion;
do{
    try{
        
         System.out.println("\n====== MENU ======");
            System.out.println("1. Agregar Tarjeta");
            System.out.println("2. Mostrar Tarjetas");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch(opcion){
                    case 1:
                    agregarTarjeta();
                    break;

                case 2:
                    mostrarTarjetas();
                    break;

                case 3:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                
                
            }
    }
    catch(Exception ex){
        System.out.println("opcion no valida");
        leer.next();
    }
    
}while(cont==true);
        
       
    }
        public static void agregarTarjeta(){

        int tipo;

        System.out.println("\n1. Tarjeta Debito");
        System.out.println("2. Tarjeta Credito");
        System.out.print("Seleccione: ");
        tipo = leer.nextInt();

       

        String numero;
        do {
       
    System.out.print("Ingrese el numero de tarjeta: ");
    numero = leer.next();
    if (!numero.matches("\\d{16}")) {
        System.out.println("El numero de tarjeta debe tener exactamente 16 digitos.");
    }
} while (!numero.matches("\\d{16}"));
        
        
      String clave;

do {
    System.out.print("Ingrese la clave (18 digitos): ");
    clave = leer.next();

    if (!clave.matches("\\d{18}")) {
        System.out.println("Error. La clave debe tener exactamente 18 digitos.");
    }

} while (!clave.matches("\\d{18}"));


  String nip;
do {
    System.out.print("Ingrese el NIP: ");
    nip = leer.next();

    if (!nip.matches("\\d{4}")) {
        System.out.println("El NIP debe tener exactamente 4 digitos.");
    }

} while (!nip.matches("\\d{4}"));
       

        System.out.print("Banco: ");
        String banco = leer.nextLine();

        String cvv;
do {
    System.out.print("CVV: ");
    cvv = leer.next();

    if (!cvv.matches("\\d{3}")) {
        System.out.println("El CVV debe tener exactamente 3 dígitos.");
    }

} while (!cvv.matches("\\d{3}"));


        System.out.print("Saldo: ");
        int saldo = leer.nextInt();

        leer.nextLine();

        System.out.print("Expiracion: ");
        String expiracion = leer.nextLine();

        if(tipo == 1){
            int id =0;

            Tarjeta_Debito debito = new Tarjeta_Debito(
                    id,
                    "",
                    numero,
                    clave,
                    nip,
                    banco,
                    cvv,
                    saldo,
                    expiracion);

            listaDebito.add(debito);
            System.out.println("Tarjeta debito agregado con la ID: " + debito.getId());

            System.out.println("Tarjeta de debito agregada.");

        }else if(tipo == 2){

            System.out.print("Limite de credito: ");
            double credito = leer.nextDouble();

            System.out.print("Anualidad: ");
            double anualidad = leer.nextDouble();

            leer.nextLine();

            System.out.print("Fecha de pago: ");
            String fechaPago = leer.nextLine();
            int id=0;

            Tarjeta_Credito creditoTarjeta = new Tarjeta_Credito(
                    id,
                    "",
                    numero,
                    clave,
                    nip,
                    banco,
                    cvv,
                    saldo,
                    expiracion,
                    credito,
                    anualidad,
                    fechaPago);

            listaCredito.add(creditoTarjeta);

            System.out.println("Tarjeta de credito agregada.");
            System.out.println("Tarjeta debito agregado con la ID: " + creditoTarjeta.getId());


        }else{

            System.out.println("Tipo incorrecto.");

        }

    }
         public static void mostrarTarjetas(){
             int opc;
             System.out.println("que tarjetas quieres mostrar");
             System.out.println("1:debito");
             System.out.println("2:credito");
             opc = leer.nextInt();
             
             
             switch(opc){
                 case 1:
                         System.out.println("\n------ TARJETAS DE DEBITO ------");

        for(Tarjeta_Debito t : listaDebito){

            System.out.println("---------------------");
            System.out.println("ID: " + t.getId());
            System.out.println("Numero: "+ t.getNumero());
            System.out.println("NIP: " + t.getNip());
            System.out.println("CVV: " + t.getCvv());
            System.out.println("Numero: " + t.getNumero());
            System.out.println("Banco: " + t.getBango());
            System.out.println("Saldo: " + t.getSaldo());
            System.out.println("expiracion: " + t.getExpiracion());
            break;
            
                 

        }
                 case 2:
                      System.out.println("\n------ TARJETAS DE CREDITO ------");

        for(Tarjeta_Credito t : listaCredito){

            System.out.println("---------------------");
            System.out.println("ID: " + t.getId());
            System.out.println("Numero: "+ t.getNumero());
            System.out.println("NIP: " + t.getNip());
            System.out.println("CVV: " + t.getCvv());
            System.out.println("Numero: " + t.getNumero());
            System.out.println("Banco: " + t.getBango());
            System.out.println("Saldo: " + t.getSaldo());
            System.out.println("expiracion: " + t.getExpiracion());

            break;
            

        }
           default:
                    System.out.println("Opcion incorrecta");
                 
             }

    

       

    }

}

   
