

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author annip
 */
public class Main {
        public static List<Usuario>usuarios;
        public static List<Paciente>pacientes;
        public static List<Medico>medicos;
        public static List<Cita>citas;
    private static String json;
 
    public static void main (String[] args){
  

       boolean usuario_existe;
       boolean exit;
       String nombre_usuario="";
       Integer id_usuario=0;
       Integer password=0;
       
      
       Scanner matriculas= new Scanner(System.in);  
        
            System.out.println("CARGANDO SISTEMA.......");
            System.out.println("***********************************************************");
            usuarios_Cargados();
            System.out.println("---------[EL SISTEMA ESTA LISTO PARA EJECUTARSE]-----------");
            System.out.println("*----------------------------------------------------------*");
            System.out.println("*                   INICIO DE SESIÓN                       *");
            System.out.println("*----------------------------------------------------------*\n");
            System.out.println("Ingresa el nombre del usuario");
            nombre_usuario = matriculas.nextLine();
            System.out.println("Ingresa el ID del usuario");
            id_usuario = matriculas.nextInt();
            System.out.println("Ingresa la contraseña");
            password=matriculas.nextInt();
            usuario_existe= validar_datos(nombre_usuario,id_usuario,password);
                if(usuario_existe){
                    System.out.println("El usuario existe en el sistema\n");
                   System.out.println("*----------------------------------------------------------*");
                   System.out.println("               BIENVENID@ AL SISTEMA "+nombre_usuario +"       ");
                   System.out.println("*----------------------------------------------------------*\n");

                    menu();                                        
                }else{
                    System.out.println("El usuario no existe, no puedes acceder al sistema");
                }
               

         } 
   public static  void menu(){
       int seleccion=0;
       do{
     Scanner scn= new Scanner(System.in);
     System.out.println("¿QUÉ ACCIÓN DESEAS REALIZAR?");
     System.out.println("1.- Crear una cita");
     System.out.println("2.- Dar de alta a un paciente");
     System.out.println("3.- Dar de alta a un médico");
     System.out.println("5.- Salir del sistema");
seleccion=scn.nextInt();
        switch(seleccion){
            case 1:
                crear_Cita();
                break;
            case 2:
                crear_Paciente();
                break;
            case 3:
                crear_Medico();
                break;
            case 5:
                System.out.println("HAS SALIDO DEL PROGRAMA");
                System.exit(0);
                break;
            default: System.out.println("LA OPCIÓN QUE ELEGISTE NO EXISTE");
            
        }
       }
     while(seleccion>0|| seleccion<5);     
   }

 /**======================MÉTODOS DE USUARIO PARA INICIO DE SESIÓN=========================*/         
    public static void usuarios_Cargados(){     
           if(usuarios==null){
               usuarios= new ArrayList<>();
           }      
           usuarios.add(new Usuario("Anne",15, 2707));
           usuarios.add(new Usuario("Diana",21,2308));
           usuarios.add(new Usuario("Emmanuel",23,2408));
            System.out.println("Los usuarios se han cargado correctamente: " );
            System.out.println(+ usuarios.size() +" usuarios cargados en el sistema");
            System.out.println("***********************************************************\n");
                   }
       
    public static boolean   validar_datos(String nombre_usuario,Integer id_usuario,Integer password){
           return usuarios.stream().anyMatch(x->x.getNombre_usuario().equals(nombre_usuario) && x.getId_usuario().equals(id_usuario) && x.getPassword().equals(password)); 
                   }
  
 /**======================MÉTODOS DE DADA DE ALTA DE PACIENTES=========================*/         
 public static boolean crear_Paciente(){
                Scanner pacienteSC= new Scanner(System.in);
               pacientes= new ArrayList<>();
        System.out.println("================DAR DE ALTA UN PACIENTE================");
        System.out.println("Por favor ingresa el nombre del paciente");
        String nombre_paciente= pacienteSC.nextLine();
        System.out.println("Por favor ingresa el ID del paciente");
        Integer id_paciente= pacienteSC.nextInt();
        pacienteSC.nextLine();
        System.out.println("Por favor ingresa el área del paciente");
        String area= pacienteSC.nextLine();
        System.out.println("Por favor ingresa el ID del médico");
        Integer id_medico= pacienteSC.nextInt();
        System.out.println("Por favor ingresa la ID de la cita del paciente");
        Integer id_cita= pacienteSC.nextInt();
        pacienteSC.nextLine();
        if(pacientes.contains(id_paciente)){
              System.out.println("EL PACIENTE YA EXISTE");
    }
        else{
             Paciente paciente= new Paciente(nombre_paciente, id_paciente,area, id_medico, id_cita);
                              guardar_Paciente(paciente);
               return pacientes.add(paciente);       
    }
        return true;
    }
 
public static void guardar_Paciente(Paciente paciente){
        String jsonPaciente;
        Gson gson= new Gson();
        String nombre_Archivo="pacientes.txt";
        jsonPaciente=gson.toJson(paciente);
        System.out.println("==Información del paciente en formato jason=="+ jsonPaciente); 
        try{
          BufferedWriter writer= new BufferedWriter(new FileWriter(nombre_Archivo));
          writer.write(jsonPaciente);
          FileWriter filewriter=new FileWriter(nombre_Archivo);
          PrintWriter printwriter=new PrintWriter(filewriter);
          printwriter.print(jsonPaciente);
          printwriter.close();
        }catch(Exception e){
            System.out.println("NO SE PUDIERON GUARDAR LOS DATOS");
        }
                System.out.println("PACIENTE DADO DE ALTA EXITOSAMENTE");
                System.out.println("Puedes visualizar la información en documento de texto -pacientes.txt- \n");

    }
    public static void cargar_paciente(){       
    Gson gson= new Gson();
        Paciente paciente= gson.fromJson(json, Paciente.class);       
    }
        
 /**======================MÉTODOS DE DADA DE ALTA DE MÉDICOS=========================*/         
public static boolean crear_Medico(){
                Scanner medicoSC= new Scanner(System.in);
               medicos= new ArrayList<>();
        System.out.println("================DAR DE ALTA UN MEDICO================");
        System.out.println("Por favor ingresa el nombre del médico");
        String nombre_medico= medicoSC.nextLine();
        System.out.println("Por favor ingresa el ID del medico");
        Integer id_medico= medicoSC.nextInt();
        medicoSC.nextLine();
        System.out.println("Por favor ingresa la especialidad del medico");
        String especialidad= medicoSC.nextLine();
        
        medicoSC.nextLine();
        if(medicos.contains(id_medico)){
              System.out.println("EL MEDICO YA EXISTE");
    }
        else{
             Medico medico= new Medico(id_medico,nombre_medico,especialidad);
                              guardar_Medico(medico);
               return medicos.add(medico);       
    }
        return true;
    }
    
public static void guardar_Medico(Medico medico){
        String jsonMedico;
        Gson gson= new Gson();

        String nombre_Archivo="medicos.txt";
        jsonMedico=gson.toJson(medico);
        System.out.println("==Medico jason=="+ jsonMedico); 

        try{
          BufferedWriter writer= new BufferedWriter(new FileWriter(nombre_Archivo));
          writer.write(jsonMedico);
          FileWriter filewriter=new FileWriter(nombre_Archivo);
          PrintWriter printwriter=new PrintWriter(filewriter);
          printwriter.print(jsonMedico);
          printwriter.close();
        }catch(Exception e){
            System.out.println("NO SE PUDIERON GUARDAR LOS DATOS");
        }
                System.out.println("MEDICO DADO DE ALTA EXITOSAMENTE");
                System.out.println("Puedes visualizar la información en documento de texto -medicos.txt- \n");
    }  
 
public static void cargar_Medico(){
    Gson gson= new Gson();
        Medico medico= gson.fromJson(json, Medico.class);
  }

 /**======================MÉTODOS DE DADA DE ALTA DE CITAS=========================*/         

 public static boolean crear_Cita(){
    

                Scanner citaSC= new Scanner(System.in);
               citas= new ArrayList<>();
        System.out.println("================CREAR CITA================");
        System.out.println("Por favor ingresa el motivo de la cita");
        String motivo_cita= citaSC.nextLine();
        System.out.println("Por favor ingresa el ID de la cita");
        Integer id_cita= citaSC.nextInt();
        citaSC.nextLine();
        System.out.println("Por favor ingresa la fecha de la cita");
        String fecha_cita= citaSC.nextLine();
        System.out.println("Por favor ingresa el ID del médico");
        Integer id_medico= citaSC.nextInt();
        System.out.println("Por favor ingresa el ID del paciente");
        Integer id_paciente= citaSC.nextInt();
        
        if(citas.contains(id_cita)){
              System.out.println("LA CITA YA EXISTE");
    }
        else{
             Cita cita= new Cita(id_cita,motivo_cita,fecha_cita,id_medico,id_paciente);
                              guardar_Cita(cita);
               return citas.add(cita);       
    }
        return true;
    }
 
public static void guardar_Cita(Cita cita){
        String jsonCita;
        Gson gson= new Gson();

        String nombre_Archivo="citas.txt";
        jsonCita=gson.toJson(cita);
        System.out.println("Paciente jason"+ jsonCita); 

        try{
          BufferedWriter writer= new BufferedWriter(new FileWriter(nombre_Archivo));
          writer.write(jsonCita);
          FileWriter filewriter=new FileWriter(nombre_Archivo);
          PrintWriter printwriter=new PrintWriter(filewriter);
          printwriter.print(jsonCita);
          printwriter.close();
        }catch(Exception e){
            System.out.println("NO SE PUDIERON GUARDAR LOS DATOS");
        }
                System.out.println("CITA DADA DE ALTA EXITOSAMENTE");
                System.out.println("Puedes visualizar la información en documento de texto -citas.txt- \n");

    }  

public static void cargar_Cita(){
    Gson gson= new Gson();
        Cita cita= gson.fromJson(json, Cita.class);
  }
}


