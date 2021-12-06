/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annip
 */
public class Medico {
  private Integer id_medico;
  private String nombre_medico;
  private String especialdad;

    public Medico(Integer id_medico, String nombre_medico, String especialdad) {
        this.id_medico = id_medico;
        this.nombre_medico = nombre_medico;
        this.especialdad = especialdad;
    }

    @Override
    public String toString() {
        return "{==Medico creado==" + "id_medico=" + id_medico + ", nombre_medico=" + nombre_medico + ", especialdad=" + especialdad + '}';
    }

    Medico() {
       
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }

    public String getEspecialdad() {
        return especialdad;
    }

    public void setEspecialdad(String especialdad) {
        this.especialdad = especialdad;
    }
  
  
}
