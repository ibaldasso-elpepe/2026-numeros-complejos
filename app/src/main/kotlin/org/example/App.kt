package org.example
class Persona(
    private val nombre: String, //usamos val porque los datos no vcan a cambiar
    private val apellido: String,
    private val edad: Int
) {
    // sobreescribe el tostring
    override fun toString(): String {
        return "Persona(nombre=$nombre, apellido=$apellido, edad=$edad)" // se usa $ para meterle el valor
    }
}

fun main() {
    val p = Persona("Juan", "Pérez", 30)
    println(p)  // nos dice el nombre, apellido y la edad

    
}