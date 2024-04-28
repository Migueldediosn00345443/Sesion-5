/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seciion5.entidades;

public class Persona 
{
      private String nombre;
      private String apellido;
      private String dni;  

    public Persona() {  }
    
    public Persona(String nombre, String apellido, String dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public String getText()
    {
      return "Persona:   "+
              this.nombre + " " +
              this.apellido;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}