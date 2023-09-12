


fun main(args: Array<String>)
{
    val weather= Weather()
    val f = true
    while (f) {
        println("Gib eine Stadt ein um weitere details zu sehen ...")
        val city = readlnOrNull()
        weather.fetchWeather(city.toString())
        println("Exit ? (Ja/Nein)")
        val next = readLine()
        if (next.equals("Nein",ignoreCase = true)){
            clearConsole()
            continue
        }else{
            break
        }

    }
}

fun clearConsole():ProcessBuilder{
    val pr = ProcessBuilder()
   return pr.command("cls")
}