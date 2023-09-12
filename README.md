# Wetter-App 

Das Ziel dieses Projekts ist es, eine Wetter-App zu entwickeln, mit der Benutzer Wetterdaten für eine bestimmte Stadt von WeatherAPI.com abrufen und anzeigen können. Der Hauptfokus liegt dabei auf dem API-Abruf, Konvertierung der Daten in Kotlin-Objekte, die Nutzung von Datenmodellen und der Datenverarbeitung.

## Schritt 1: Anmeldung bei WeatherAPI.com

Bevor du die WeatherAPI.com in dein Projekt einbindest, musst du dich auf der WeatherAPI-Website anmelden und einen API-Schlüssel generieren. Hier ist, wie du das machst:

1. Gehe zur [WeatherAPI.com-Website](https://www.weatherapi.com/).
2. Melde dich an oder erstelle ein neues Konto, falls du noch keines hast.
3. Nach der Anmeldung, gehe zum Dashboard oder Profilbereich deines Kontos.
4. Suche nach der Option "API-Key generieren" oder ähnlichem. Klicke darauf, um einen neuen API-Schlüssel zu erstellen.
5. Notiere oder kopiere den generierten API-Schlüssel. Du wirst ihn später in deinem Projekt benötigen.

## Schritt 2: Projekt einrichten

Stelle sicher, dass du dein Kotlin-Projekt bereits erstellt hast. Wenn nicht, richte dein Projekt entsprechend ein
oder benutze den Befehl `git clone` im Terminal.

```git clone
git clone https://github.com/ibrahim-oez/Wetter-App.git
```

## Schritt 3: API-Schlüssel in das Projekt einbinden

Um den API-Schlüssel in dein Projekt zu integrieren, folge diesen Schritten:

Platziere den generierten API-Schlüssel in einer Datei namens `config.properties` in deinem Projektverzeichnis. Die Datei sollte wie folgt aussehen:

   ```config.properties
   api=<-API Key->
   ```

<img src="src/assets/logo.png" alt="Mein Logo" width="280" height="300">










