
package reservaempresa;

     import java.util.Scanner;
     
     import java.text.SimpleDateFormat;
/**
 *
 * @author Bastian
 */
public class Test {

    
    public static void main(String[] args) {
        
        Reserva reserva = new Reserva ();
        Cliente cliente = new Cliente ();
      
        Scanner scanner = new Scanner (System.in);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String opcion= "";
        boolean validador = true;
        
        while(validador)
            
        {
          System.out.println("Bienvenido al Sistema de Reservas de la Empresa");
          System.out.println(" [1] - Crear una Reserva");
          System.out.println(" [2] - Mostrar Informacion Reserva");
          System.out.println(" [3] - Realizar Descuento a cliente");
          System.out.println(" [4] - Salir ");
          System.out.println(" Ingrese una Opcion:  ");
          opcion = scanner.next ();
          
          switch(opcion)
          {
              case"1":
                 System.out.println("  Ingrese su Nombre");
                  String nombre =scanner.next();
                  cliente.setNombre(nombre);
                  
                 System.out.println("  Ingrese su Apellido");
                  String apellido =scanner.next();
                  cliente.setApellido(apellido);
                 
                 System.out.println(" Ingrese su Celular");
                  int celular =scanner.nextInt();
                  cliente.setCelular(celular);
                  
                 System.out.println(" Ingrese su Correo");
                 String correoElectronico = scanner.next();
                  cliente.setCorreoElectronico(correoElectronico);
                  
                  
                 System.out.println("  Ingrese su Edad");
                 int edad =scanner.nextInt();
                 cliente.setEdad(edad);
                     
                try
                 {
                     if(edad<18)
                     System.out.println("Titular es menor de edad  no es posible reservar");
                     else
                         cliente.setEdad(edad);
                 }
                catch (Exception err)
                {
                         
                     System.out.println("Problema con el guardado de la reserva");
                             
                                
                 }   
                {
                     System.out.println("Fecha titular es valida");
                     break;
                }         }
                 
              
            System.out.println("Ingrese datos de la Reserva");
                System.out.println("Ingrese tipo de Habitacion");
                String tipohabitacion = scanner.next();
                reserva.setTipoHabitacion(tipohabitacion);
                
                System.out.println("Ingrese numero de Habitacion");
                int NumeroHabitacion =scanner.nextInt();
                reserva.setNumeroHabitacion(NumeroHabitacion);
                
                System.out.println("Ingrese numero de Habitantes");
                int NumeroPasajeros = scanner.nextInt();
               reserva.setNumeroPasajeros(NumeroPasajeros);
                
                System.out.println("Ingrese  el monto a pagar");
                int ValorReserva= scanner.nextInt();
                reserva.setValorReserva(ValorReserva);
               
               System.out.println("Ingrese la fecha de termino de la reserva : ");
               String  FechaTermino = scanner.next();}
        
                case"2":
                 System.out.println(" ");
                 reserva.mostrarInformacionReserva();
                 break;
            
                 case"3":
                 if(cliente.setNuevo(true));
                 System.out.println("posee Descuento");
                       
                 case"4":
                   
                  validador = false;
                  break;
                
                System.out.println("Gracias por ocupar el Programa");

                
               
              
              
          }
              
            
            
            
            
            
            
            
            
        }
        
      
        
        
        
        
        
        
        
    }
    
}
