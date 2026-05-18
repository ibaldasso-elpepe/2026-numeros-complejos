package org.example
class Persona(
    private val nombre: String,
    private val apellido: String,
    private val edad: Int
) {
    // Sobrescribimos el método toString para darle el formato solicitado
    override fun toString(): String {
        return "Persona(nombre=$nombre, apellido=$apellido, edad=$edad)"
    }
}

fun main() {
    val p = Persona("Juan", "Pérez", 30)
    println(p)  // Imprime: Persona(nombre=Juan, apellido=Pérez, edad=30)
}