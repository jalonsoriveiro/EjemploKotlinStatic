class Persona (nombre:String, apellidos:String,edad:Int) {
    //Atributos de clase
    var nombre: String = ""
    var apellidos: String = ""
    var edad: Int = 0
    init{
        this.nombre = nombre
        this.apellidos = apellidos
        this.edad = edad
        cantidad++

    }
    override fun toString():String{
        return "NOmbre:$nombre Apellidos: $apellidos Edad: $edad"
    }
    companion object Contador {
        var cantidad: Int =0
    }
}