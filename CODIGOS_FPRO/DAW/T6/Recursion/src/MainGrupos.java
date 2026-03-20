import controller.ControllerGrupos;
import model.Grupo;
import model.Usuario;

public class MainGrupos {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1,"usuario1");
        Usuario usuario2 = new Usuario(2,"usuario2");
        Usuario usuario3 = new Usuario(3,"usuario3");
        Usuario usuario4 = new Usuario(4,"usuario4");
        Usuario usuario5 = new Usuario(5,"usuario5");
        Usuario usuario6 = new Usuario(6,"usuario6");
        Usuario usuario7 = new Usuario(6,"usuario7");

        Grupo fp = new Grupo();
        Grupo dam = new Grupo();
        Grupo daw = new Grupo();
        Grupo daw1 = new Grupo();
        Grupo daw2 = new Grupo();
        daw2.anadirUsuario(usuario7);
        dam.anadirUsuario(usuario1);
        dam.anadirUsuario(usuario2);
        dam.anadirUsuario(usuario3);
        daw.anadirUsuario(usuario4);
        daw.anadirUsuario(usuario5);
        daw.anadirUsuario(usuario6);
        daw.anadirSubgrupo(daw2);
        fp.anadirSubgrupo(daw);
        fp.anadirSubgrupo(dam);

        ControllerGrupos controllerGrupos = new ControllerGrupos();
        if (controllerGrupos.perteneceA(daw, usuario7)){
            System.out.println("Si pertenece");
        } else {
            System.out.println("No pertenece");
        }
    }
}
