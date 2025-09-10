/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

class Student(
    val nombreEstudiante: String,
    val nombreMateria: String,
    val peso: Double,
    val estatura: Double,
    val edad: Int,
    val genero: String
) {
    fun showSaludo(){
        println("Hola y bienvenido $nombreEstudiante")
        println("Materia: $nombreMateria")
    }
    fun showStudentInfo() {
        println("Peso (kg): $peso")
        println("Estatura (m): $estatura")
        println("Edad: $edad - Es par: ${edad % 2 == 0}")
        println("Genero: $genero")
    }
}

fun main() {
    //commit 1
    println("Hello, world!!!")

    val henrysInfo = Student(
        nombreEstudiante = "Henrry Coronado",
        nombreMateria = "Aplicaciones Moviles",
        peso = 59.5,
        estatura = 1.69,
        edad = 20,
        genero = "Masculino"
    )
    henrysInfo.showSaludo()
    henrysInfo.showStudentInfo()
}