/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annip
 */
public class Paciente {
    private String nombre_paciente;
    private Integer id_paciente;
    private String area;
  
    private Integer id_cita;
    private Integer id_medico;

  
    public Paciente(String nombre_paciente, Integer id_paciente, String area, Integer id_cita, Integer id_medico) {
        this.nombre_paciente = nombre_paciente;
        this.id_paciente = id_paciente;
        this.area = area;
        this.id_cita = id_cita;
        this.id_medico = id_medico;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre_paciente=" + nombre_paciente + ", id_paciente=" + id_paciente + ", area=" + area + ", id_cita=" + id_cita + ", id_medico=" + id_medico + '}';
    }
 
  public Paciente() {
    
}



    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getId_cita() {
        return id_cita;
    }

    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }


   


   

}
