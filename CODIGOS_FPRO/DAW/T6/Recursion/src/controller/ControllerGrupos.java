package controller;

import model.Grupo;
import model.Usuario;

public class ControllerGrupos {

    public boolean perteneceA(Grupo grupo, Usuario usuario){

        if(grupo.getUsuarios().contains(usuario)){
            return true;
        } else {
            for (Grupo subgrupo: grupo.getSubGrupos()) {
                return perteneceA(subgrupo,usuario);
            }
        }
        return false;
    }

}
