package com.unab.Negocio;

import com.unab.Dominio.Login;
import com.unab.Dominio.registry;


public class clsLogin {
     
    public boolean accesoSistema(Login log) {

        if (log.getUsuario().equals(log.getUsuariocomparador()) && log.getPassword().equals(log.getPasswordcomparador())) {
            return true;
        } else {
            return false;
        }
    }
}

//        if(Log.getUsuario().equals("Carlos") || Log.getPass().equals("123")){
//            return true;
//        }else{
//            return false;
//        }
