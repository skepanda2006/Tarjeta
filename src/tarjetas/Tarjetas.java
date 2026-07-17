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
        Tarjeta_Debito Debito = new Tarjeta_Debito(1,"Jesus armando","4538203832929472","973497638593847958","345","Banco Azteca","0001",5000,"06/12/29");
        listaDebito.add(Debito);
        Tarjeta_Debito Debito2 = new Tarjeta_Debito(2,"Roman Alejandro","5789200832729272","8794936345593827958","616","Bancorme","0002",8000,"06/8/27");
        listaDebito.add(Debito2);
         Tarjeta_Credito Credito = new Tarjeta_Credito(1,"Roman Alejandro","5789200832729272","8794936345593827958","616","Bancorme","0002",8000,"06/8/27",10000,800,"12-06-2026");
        listaCredito.add(Credito);
        
        
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
        
        String Titular;
        System.out.print("    Nombre del titular: ");
        Titular = leer.next();
        
        String numero = "";

for (int i = 0; i < 16; i++) {
    numero += (int)(Math.random() * 10);
}

System.out.println("Tu numero es Número: " + numero);
        
        
     String clave = "";

for (int i = 0; i < 18; i++) {
    clave += (int)(Math.random() * 10);
}

System.out.println("Clave: " + clave);


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

       
  
          String cvv = "";

  for (int i = 0; i < 3; i++) {
     cvv += (int)(Math.random() * 10);
  }

   System.out.println("CVV: " + cvv);


        System.out.print("Saldo: ");
        int saldo = leer.nextInt();

        leer.nextLine();

        System.out.print("Expiracion: ");
        String expiracion = leer.nextLine();

        if(tipo == 1){
            int id =0;

            Tarjeta_Debito debito = new Tarjeta_Debito(
                    id,
                    Titular,
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
                    Titular,
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
            System.out.println("ID: " + t.getTitular());      
            System.out.println("Numero: "+ t.getNumero());
            System.out.println("NIP: " + t.getNip());
            System.out.println("CVV: " + t.getCvv());
            System.out.println("Numero: " + t.getNumero());
            System.out.println("Banco: " + t.getBango());
            System.out.println("Saldo: " + t.getSaldo());
            System.out.println("expiracion: " + t.getExpiracion());
            
            
        }
        break;
                 case 2:
                      System.out.println("\n------ TARJETAS DE CREDITO ------");

        for(Tarjeta_Credito t : listaCredito){

            System.out.println("---------------------");
            System.out.println("ID: " + t.getId());
           System.out.println("ID: " + t.getTitular());  
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

   
