/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaempresa;

import java.util.Date;
/**
 *
 * @author Bastian
 */
public class Reserva {
    
    
     // 1.- Definicion de atributos (SIEMPRE PRIVADOS)
       
        private String TipoHabitacion;
        private int NumeroHabitacion;
        private int NumeroPasajeros;
        private Date FechaTermino;
        private int ValorReserva;
        private Cliente Cliente;
   
  
public Reserva ()

    // 2.- Creación de método constructor sin parámetros de entrada
    // Su objetivo es creat objetos con valores por defecto
{

    
    this.TipoHabitacion = " ";
    this.NumeroHabitacion = 0;
    this.NumeroPasajeros= 0;
    this.FechaTermino = new Date ();
    this.ValorReserva = 0;
    this.Cliente = new Cliente ();
   
}

    // 3.- Métodos Accesadores(GET) y Mutadores(SET)


    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public int getNumeroHabitacion() {
        return NumeroHabitacion;
    }

    public void setNumeroHabitacion(int NumeroHabitacion) {
        this.NumeroHabitacion = NumeroHabitacion;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int NumeroPasajeros) {
        this.NumeroPasajeros = NumeroPasajeros;
    }


    public Date getFechaTermino() {
        return FechaTermino;
    }

    public void setFechaTermino(Date FechaTerminoreserva) {
        this.FechaTermino = FechaTerminoreserva;
    }

    public int getValorReserva() {
        return ValorReserva;
    }

    public void setValorReserva(int ValorReserva) {
        this.ValorReserva = ValorReserva;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    
    

     public void mostrarInformacionReserva()
    {
    
        
        System.out.println("Tipo Habitacion                : " + getTipoHabitacion());
        System.out.println("Numero de Habitacion           : " + getNumeroHabitacion());
        System.out.println("Numero de Clientes Alojados    : " + getNumeroPasajeros());
        System.out.println("Fecha Termino Reserva          : " +getFechaTermino());
        System.out.println("Valor a pagar                  :"  +getValorReserva());
        
        getCliente().mostrarInformacioncliente();
        
        
    }
        
     
 
    
    
}
    
    
    
    
    
    


