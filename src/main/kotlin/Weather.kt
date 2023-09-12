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
    val temp_c: Double
)



class Weather()
{
    fun fetchWeather(city:String){
        var apiKey:String=""
        try {
            val read = FileReader("src/config.properties")
            val prop = Properties()
            prop.load(read)

            // Get Key from .properties
            apiKey = prop.getProperty("api")
            read.close()

        } catch (e: Exception) {
            e.printStackTrace()
            println("Fehler beim Lesen der config.properties-Datei.")
        }

        val baseUrl:String = "http://api.weatherapi.com/v1"
        val apiURL = "$baseUrl/current.json?key=$apiKey&q=$city&lang=de"

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



            // Creat KotlinObj
            val gson = Gson()
            val weatherResponse = gson.fromJson(response, WeatherResponse::class.java)

            // Extract
            val stadt = weatherResponse.location.name
            val temperaturCelsius = weatherResponse.current.temp_c

            // print
            val ausgabe = "Stadt: $stadt \nTemperatur: $temperaturCelsius °C"
            println(ausgabe)

        }else{
            println("Fehler bei der API-Anfrage. Response-Code: $responseCode")
        }

    }
}