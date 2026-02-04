class Usuario(var nombre: String, var apellido: String) {
    // const()
    // public Usuario(nombre){}
    var correo: String? = null
    constructor(nombreS: String, apellidoS: String, correo: String)
            : this(nombreS, apellidoS) {
        this.correo = correo;
    }


}