/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seciion5.entidades;

/**
 *
 * @author Estudiante
 */
public class cliente extends Persona 
{
    private String codCliente;
    
    public static cliente fromPersona(Persona per)
    {
        cliente cli = new cliente();
        cli.setNombre(per.getNombre());
        cli.setApellido(per.getApellido());
        cli.setDni(per.getDni());
        return cli;
        
    }
    
            

    public cliente() { }

    public cliente(String codCliente)
    {
        this.codCliente = codCliente;
    }
    
    @Override
    public String getText()
    {
     return "Cliente:  "+
             this.getNombre()+ " "+   
             this.getApellido()+ " | DNI-cli: "+
             this.getDni() ;
    }

    public String getCodCliente() 
    {
        return codCliente;
    }

    public void setCodCliente(String codCliente) 
    {
        this.codCliente = codCliente;
    }

}
