/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsConexion;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EstIvonneGeovannaCam
 */
public class Empresa extends clsConexion {
  String ruc, cod_perfil, nombre_empresa, telefono, email,direccion_emp,password_e;

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(String cod_perfil) {
        this.cod_perfil = cod_perfil;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion_emp() {
        return direccion_emp;
    }

    public void setDireccion_emp(String direccion_emp) {
        this.direccion_emp = direccion_emp;
    }

    public String getPassword_e() {
        return password_e;
    }

    public void setPassword_e(String password_e) {
        this.password_e = password_e;
    }
  
   public static String autenticacion_emp(String correo, String pass){
       String log_e="false";
       clsConexion con=new clsConexion();
       ResultSet rs=null;
       String sql_Empresa="SELECT ruc FROM empresas WHERE email='"+correo+"' AND password_e='"+pass+"'";
  
       try {
            rs=con.Consulta(sql_Empresa);
            while(rs.next()){
                log_e="true";
                System.out.println("ruc"+rs.getString(0));
                
         }
        } catch (SQLException e) {
        }
        System.out.println(log_e);
        return log_e;
        
       

    }

   
}
