/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annip
 */
public class Usuario {
    private String nombre_usuario;
    private Integer id_usuario;
    private Integer password;
    
    public Usuario(){
        
    }

    public Usuario(String nombre_usuario, Integer id_usuario, Integer password) {
        this.nombre_usuario = nombre_usuario;
        this.id_usuario = id_usuario;
        this.password = password;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getPassword() {
        return password;
    }

    public void Integer(Integer password) {
        this.password = password;
    }
    
    
}
