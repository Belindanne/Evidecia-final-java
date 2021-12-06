/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annip
 */
public class Cita {
    private Integer id_cita;
    private String motivo_cita;
    private String fecha_cita;
    private Integer id_medico;
    private Integer id_paciente;
    /**
    private Medico id_medico;
    private Paciente id_paciente;
*/
    

    public Cita(Integer id_cita, String motivo_cita, String fecha_cita, Integer id_medico, Integer id_paciente) {
        this.id_cita = id_cita;
        this.motivo_cita = motivo_cita;
        this.fecha_cita = fecha_cita;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
    }

    public Integer getId_cita() {
        return id_cita;
    }

    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
    }

    public String getMotivo_cita() {
        return motivo_cita;
    }

    public void setMotivo_cita(String motivo_cita) {
        this.motivo_cita = motivo_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    @Override
    public String toString() {
        return "Cita{" + "id_cita=" + id_cita + ", motivo_cita=" + motivo_cita + ", fecha_cita=" + fecha_cita + ", id_medico=" + id_medico + ", id_paciente=" + id_paciente + '}';
    }

    Cita() {
    }

    

   

    


        
    
}

   