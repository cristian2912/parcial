import kotlin.math.*

open class BaseCalculadora {
    // funciones para operaciones aritmeticas
    open fun agregar(x: Double, y: Double): Double {
        return x + y
    }

    open fun sustraer(x: Double, y: Double): Double {
        return x - y
    }

    open fun multiplicar(x: Double, y: Double): Double {
        return x * y
    }

    open fun dividir(x: Double, y: Double): Double {
        // ver si y es cero
        require(y != 0.0) { "No se puede dividir por cero." }
        return x / y
    }
}

class CalculadoraAvanzada : BaseCalculadora() {
    // variable para memoria
    private var memoria: Double = 0.0

    // funciones para cálculos avanzados
    fun seno(angulo: Double): Double {
        return sin(Math.toRadians(angulo))
    }

    fun coseno(angulo: Double): Double {
        return cos(Math.toRadians(angulo))
    }

    fun tangente(angulo: Double): Double {
        return tan(Math.toRadians(angulo))
    }

    fun potencia(base: Double, exp: Double): Double {
        return base.pow(exp)
    }

    fun raizCuadrada(valor: Double): Double {
        require(valor >= 0) { "No se puede calcular raíz cuadrada de un número negativo." }
        return sqrt(valor)
    }

    fun logaritmoBase10(valor: Double): Double {
        require(valor > 0) { "Logaritmo no definido para valores <= 0." }
        return log10(valor)
    }

    fun logaritmoNatural(valor: Double): Double {
        require(valor > 0) { "Logaritmo no definido para valores <= 0." }
        return ln(valor)
    }

    fun exponencial(valor: Double): Double {
        return exp(valor)
    }

    // funcion manejo de memoria
    fun agregarAMemoria(valor: Double) {
        memoria += valor
    }

    fun restarDeMemoria(valor: Double) {
        memoria -= valor
    }

    fun recuperarMemoria(): Double {
        return memoria
    }

    fun limpiarMemoria() {
        memoria = 0.0
    }
}

// funcion para probar la calculadora
fun main() {
    val calc = CalculadoraAvanzada()

    // ejemplos
    println("Suma: ${calc.agregar(10.5, 4.3)}")
    println("Resta: ${calc.sustraer(10.5, 4.3)}")
    println("Multiplicación: ${calc.multiplicar(10.5, 4.3)}")
    println("División: ${calc.dividir(10.5, 2.1)}") // No dividir por cero
    println("Seno: ${calc.seno(30.0)}")
    println("Coseno: ${calc.coseno(60.0)}")
    println("Tangente: ${calc.tangente(30.0)}")
    println("Potencia: ${calc.potencia(3.0, 2.0)}")
    println("Raíz cuadrada: ${calc.raizCuadrada(25.0)}")
    println("Logaritmo base 10: ${calc.logaritmoBase10(1000.0)}")
    println("Exponencial: ${calc.exponencial(3.0)}")

    // manejo de memoria
    calc.agregarAMemoria(15.0)
    println("Memoria: ${calc.recuperarMemoria()}")
    calc.restarDeMemoria(7.0)
    println("Memoria: ${calc.recuperarMemoria()}")
    calc.limpiarMemoria()
    println("Memoria: ${calc.recuperarMemoria()}")
}