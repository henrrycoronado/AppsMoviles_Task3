/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    //commit 1
    println("Hello, world!!!")

    //commit 2
    val nombreEstudiante: String = "Henrry Coronado"
    val nombreMateria: String = "Aplicaciones Moviles"
    println("Hola y bienvenido $nombreEstudiante")
    println("Materia: $nombreMateria")

    //commit 3
    val peso: Double = 59.5
    val estatura: Double = 1.69
    val edad: Int = 20
    var edadPar: Boolean = (edad % 2 == 0)
    val genero: List<String> = listOf("Masculino", "Femenino")
    var generoSeleccionado: String = genero[0] 
    println("Peso (kg): $peso")
    println("Estatura (m): $estatura")
    println("Edad: $edad - Es par: $edadPar")
    println("Genero: $generoSeleccionado") 
}