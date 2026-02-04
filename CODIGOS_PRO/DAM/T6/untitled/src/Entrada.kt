// public static void main(String[]args){}

fun main(args: Array<String>): Unit {

    println("Primer programa Kotlin")
    // var - mutables val - no mutables
    // var/val nombre:tipo = valor?
    var nombre: String = "Borja";
    var edad: Int = 42;
    val dni = "123123A";
    var correo: String? = "borja@gmail.com"

    println("Mi nombre ${nombre} y tengo ${edad} años")
    println("Mi dni tiene ${dni.length} digitos")
    println("Mi correo tiene ${correo?.length ?: '0'} letras")
    // parametros posicionales
    saludar("Borja", 1)
    saludar(veces = 1, nombre = "Juan")
    saludar()
    saludar(veces = 5)
    val usuario = Usuario(nombre = "Borja", apellido = "Martin")
    val usuario1 = Usuario("borja","Martin","asdasd")


}

fun saludar(nombre: String = "Borja", veces: Int = 1) {

    // for (int i=0;i<10;i++){}
    // for (int item :estructura ){}
    for (i in 0..veces - 1) {
        println("Enhorabuena $nombre, has completado el proyecto")
    }
}