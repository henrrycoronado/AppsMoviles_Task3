val nombreMateria: String = "Aplicaciones Moviles"
//commit 5
//salida esperada: 
//Con parametros: "Henrry", "Bienvenido" -> "Bienvenido, Henrry"
//Sin parametros: "", "" -> "Hola, Invitado"
//Con parametros: "Henrry", "" -> "Hola, Henrry"
//Con parametros: "", "Bienvenido" -> "Bienvenido, Invitado"
fun Saludar(nombre: String, saludo: String) {
    val saludoValidado: String = if (saludo.isNotEmpty()) saludo else "Hola"
    val nombreValidado: String = if (nombre.isNotEmpty()) nombre else "Invitado"
    println("$saludoValidado, $nombreValidado")
    println("Materia: $nombreMateria")
}
//commit 5
//salida esperada:
//Con parametro: 1 -> "Mi genero es: Masculino"
//Con parametro: 2 -> "Mi genero es: Femenino"
//Con parametro: 3 -> "Mi genero es: Otro genero"
//Con parametro: A -> "Mi genero es: Otro genero"
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