val nombreMateria: String = "Aplicaciones Moviles"

fun Saludar(nombre: String, saludo: String) {
    val saludoValidado: String = if (saludo.isNotEmpty()) saludo else "Hola"
    val nombreValidado: String = if (nombre.isNotEmpty()) nombre else "Invitado"
    println("$saludoValidado, $nombreValidado")
    println("Materia: $nombreMateria")
}

fun Genero(genero: Int){
    print("Mi genero es: ")
    when (genero) {
        1 -> println("Masculino")
        2 -> println("Femenino")
        else -> println("Otro genero")
    }
}

fun main() {
    // commit 1
    println("Hello, world!!!")

    // commit 2 - 4(mejorado)
    Saludar("Henrry", "Bienvenido")
    
    // commit 3 - 4 (editado)
    val peso: Double = 59.5
    val estatura: Double = 1.69
    val edad: Int = 20
    var edadPar: Boolean = (edad % 2 == 0)
    println("Peso (kg): $peso")
    println("Estatura (m): $estatura")
    println("Edad: $edad - Es par: $edadPar")

    // commit 4
    val genero: Int = 1
    Genero(genero)
}