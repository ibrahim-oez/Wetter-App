import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.util.Properties
import com.google.gson.Gson
import java.io.FileReader
import java.net.URI

data class WeatherResponse(
    val location: LocationInfo,
    val current: CurrentInfo
)

data class LocationInfo(
    val name: String
)

data class CurrentInfo(
    val temp_c: Double // Annahme: Die Temperatur wird in Grad Celsius zurückgegeben
)



class Weather()
{

    fun fetchWeather(city:String){
        var apiKey:String=""
        try {
            val read = FileReader("src/config.properties")
            val prop = Properties()
            prop.load(read)

            // Holen Sie den API-Schlüssel aus den Properties
            apiKey = prop.getProperty("api")
            read.close()

            // Rest des Codes hier...
        } catch (e: Exception) {
            e.printStackTrace()
            println("Fehler beim Lesen der config.properties-Datei.")
        }


        val baseUrl:String = "http://api.weatherapi.com/v1"
        val apiURL = "$baseUrl/current.json?key=$apiKey&q=$city&lang=de"
        //API in eine URL instanz
        val url = URI(apiURL).toURL()


        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"

        val responseCode = connection.responseCode
        if(responseCode == HttpURLConnection.HTTP_OK) {
            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            var line: String?
            val responseData = StringBuilder()
            while (reader.readLine().also { line = it } != null) {
                responseData.append(line)
            }
            reader.close()

            val response = responseData.toString()



            // Deserialisiere die JSON-Daten in ein Kotlin-Objekt
            val gson = Gson()
            val weatherResponse = gson.fromJson(response, WeatherResponse::class.java)

            // Extrahiere die gewünschten Informationen
            val stadt = weatherResponse.location.name
            val temperaturCelsius = weatherResponse.current.temp_c

            // Gib die Informationen aus
            val ausgabe = "Stadt: $stadt \nTemperatur: $temperaturCelsius °C"
            println(ausgabe)

        }else{
            println("Fehler bei der API-Anfrage. Response-Code: $responseCode")
        }

    }
}