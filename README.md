# Anleitung zur Integration der WeatherAPI.com in dein Projekt

Das Ziel dieses Projekts ist es, eine Anwendung zu erstellen, die Wetterdaten für eine bestimmte Stadt von WeatherAPI.com abruft und anzeigt. Diese Anleitung führt dich durch den Prozess, wie du die WeatherAPI.com in dein Kotlin-Projekt integrieren kannst.

## Schritt 1: Anmeldung bei WeatherAPI.com

Bevor du die WeatherAPI.com in dein Projekt einbindest, musst du dich auf der WeatherAPI-Website anmelden und einen API-Schlüssel generieren. Hier ist, wie du das machst:

1. Gehe zur [WeatherAPI.com-Website](https://www.weatherapi.com/).
2. Melde dich an oder erstelle ein neues Konto, falls du noch keines hast.
3. Nach der Anmeldung, gehe zum Dashboard oder Profilbereich deines Kontos.
4. Suche nach der Option "API-Key generieren" oder ähnlichem. Klicke darauf, um einen neuen API-Schlüssel zu erstellen.
5. Notiere oder kopiere den generierten API-Schlüssel. Du wirst ihn später in deinem Projekt benötigen.

## Schritt 2: Projekt einrichten

Stelle sicher, dass du dein Kotlin-Projekt bereits erstellt hast. Wenn nicht, richte dein Projekt entsprechend ein oder benutze den Befehl `git clone` im Terminal.

```
git clone 

## Schritt 3: API-Schlüssel in das Projekt einbinden

Um den API-Schlüssel in dein Projekt zu integrieren, folge diesen Schritten:

1. Platziere den generierten API-Schlüssel in einer Datei namens `config.properties` in deinem Projektverzeichnis. Die Datei sollte wie folgt aussehen:

   ```config.properties
   api=<-API Key->
