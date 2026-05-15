package org.example

class Complejo(private var real: Int=0,private var imag: Int=0) {
      //var inicializada con valor 0
    fun inicializar(real:Int,imag:Int){
        this.real=real
        this.imag=imag
    }
    fun mostrar(){
        println(this.toString())
    }
    override fun toString():String{
        return "(${real},${imag})"
    }
    fun restar(otro: Complejo): Complejo {
        return Complejo(
            real - otro.real,
            imag - otro.imag
        )
    }
    fun sumar(otro: Complejo): Complejo {
        return Complejo(
            real + otro.real,
            imag + otro.imag
        )
    }

    fun multiplicar(otro: Complejo): Complejo{
        return Complejo(
            (real* otro.real) + (imag * otro.imag),
            (real* otro.real) - (imag * otro.imag)
        )
    }

    fun dividir(otro: Complejo): Complejo {
        // El denominador es (c^2 + d^2)
        val denominador = (otro.real * otro.real) + (otro.imag * otro.imag)

        // Alerta por si intentan dividir por (0 + 0i)
        if (denominador == 0) throw ArithmeticException("No se puede dividir por cero")

        // Como tus variables son Int, el resultado se redondeará a entero.
        val nuevaParteReal = ((this.real * otro.real) + (this.imag * otro.imag)) / denominador
        val nuevaParteImag = ((this.imag * otro.real) - (this.real * otro.imag)) / denominador

        return Complejo(nuevaParteReal, nuevaParteImag)
    }
}

fun main() {
    var complejo: Complejo
    complejo= Complejo()
    complejo.inicializar(3,4)
    println("mi número complejo es ${complejo.toString()}")

    var c2:Complejo= Complejo(1,2)

    var c3:Complejo
    c3= complejo.restar(c2)
    c3.mostrar()

    var c4: Complejo= Complejo()
    c4= complejo.sumar(c2)
    c4.mostrar()

    var c5: Complejo= Complejo()
    c5= complejo.multiplicar(c2)
    c5.mostrar()

    var c6: Complejo= Complejo()
    c6= complejo.dividir(c2)
    c6.mostrar()
    }