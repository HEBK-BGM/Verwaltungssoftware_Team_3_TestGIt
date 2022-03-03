# Kapitelübersicht

1. Beschreibung der Anwendung
2. Beschreibung der Funktionen
   1. mind. 4 Methoden abläufe gerne mithilfe von Diagrammen (PAP, Struktogramm, Sequenzdiagramm, Anwendungsfalldiagramm, Aktivitätdiagramm )
3. Diagramme - Dokumentation
   1. Objektdiagramm
   2. Klassendiagramm
   3. Methoden aus 2.
      1. Sequenzdiagramm
      2. (optional) PAP, Struktogramm

## 1. Beschreibung der Anwendung
Unser Programm soll einer Steam Library ähneln. Benutzer müssen sich zuerst Registririeren dort fragt man den Benutzer nach
seinem Namen und welches Passwort er haben will. Nach der Eingabe kann er sich entscheiden ob seine Daten gespeichert werden sollen oder nicht. Die Daten werden in einer JSON datei abgelegt die seinen Benutzernamen als 
Dateinamen festlegt die JSON datei wird über die Klasse Datelleser bearbeitet. Durch das Anmelden kann er dann sein Namen eingeben,es wird dann gesucht nach einer Datei mit diesem Namen. Falls dieser Name nicht vorhanden ist dann wird darauf hingewiesen und man wird in den Startbildschirm zurück geführt. Im Mainmenü kann der Benutzer seine Spiele verwalten und hat stets die Option das Programm zu beenden. Die Spiele werden in einem Array[] gelegt das sich beim Benutzer befindet. Ein Spiel hat viele weitere Arrays[] und man kann seine Spielzeit eintragen. Errungenschaften ist eine davon sie braucht einen Integar der das Datum bestimmt und einen String der den Namen der Errungenschaft bestimmt. Bewertungen braucht genauso wie die Errungenschaften ein String und ein 
Integar, die Besonderheit daran ist ,dass es ein Integar zwischen 1-5 sein muss falls die Zahl nicht passt weißt er den Nutzer daraufhin und fragt ihn erneut.
Jede Eintragung kann abgebrochen und verändert werden dazu musst der Jeweilige Platz gewählt werden dies führt zu einem Optionmenü mit den Drei Optionen Löschen Verändern und Zurückkehren. Die JSon datei wird stets aktualisiert.
Falls man sich nicht entscheiden kann, kann man unseren Zufallsgenerator verwenden der gibt dir die Optionen 
eine reihe von Spielen auszuwählen oder die gesamte Bibliothek.Sie wählt dann ein Spiel für sie aus. Eine weitere funktion gibt euch Spieleempfehlungen anhand einer Umfrage ab falls sie mal was neues probieren möchten.
Eine Sortier option wird es auch verfügen somit wird anhand der Spielzeit der Bewertungen oder des Kaufdatums 
geordnet.



### **Menüführung**
Die Menüfuhrung ausschließlich in der Konsole zu verwenden. Beim Start der Anwendung gibt es eine Passwortabfrage und danach kann der Nutzer wählen zwischen:
- Spiel anlegen
- Errungenschaft für Spiel eintragen
- Bewertung für Spiel eintragen
  - (erst Auswahl für ein Spiel und Kaufjahr, dann eintragen)
- Bewertung für Spiel anzeigen
- Errungenschaft für Spiel anzeigen
- abmeldung
- beendigung

## 2. Beschreibung des Funktionsablaufes

### **Menü anzeigen**
#### **Beschreibung Funktion Menü anzeigen**
Nach der Anmeldung wählt der Benutzer die Option Fach danach wird er nach einen Namen, einem Jahr und einem Passwort gefragt. Diese gibt er über die Konsole ein.
Anschließend erscheint ein Menü indem die Benutzer zwichen den Folgenden Punkte wählen können:
- Spiel anlegen
- Errungenschaft anlegen
- Bewertung anlegen
- Errungenschaften/Bewertungen / Spiel anzeigen
- abmelden


TODO Falscher Text

### **Spiel anlegen()**
#### **Beschreibung Funktion Spiel anlegen**
Nach der Anmeldung kann der Benutzer den Menüpunkt "Spiel anlegen" auswählen. In dieser Funktion wird er nach einem Fachnamen gefragt. Dieses Spiel wird anschließend generiert und in das Array Spiele[] der Klasse Benutzer gelegt.

**Besonderheiten**
Es können maximal 11 Spiele angelegt werden. Danach erfolgt eine Ausgabe: "Maximiale Anzahl an Spielen erreicht machen sie bitte Platz frei".


#### **Diagramm (Aktivitätsdiagramm) Funktion Spiel anlegen**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/AktivitaetsdiagrammSpielanlegen.iuml)





### **Errungenschaft anlegen()**
Nach dem der User sich angemeldet hat, kann er im Menü entweder ein Spiel anlegen, wodurch er gebeten wird, einen Namen für sein Spiel anzulegen. Danach wird er gebeten eine Errungenschaft für dieses Spiel anzulegen. Errungenschaften können auch angelegt werden, indem der Spieler im Menü "Errungenschaft anlegen" auswählt. Danach wird er gefragt für welches Spiel diese Errungenschaft sein soll. Danach wird er gebeten etwas einzugeben und wird danach wieder zurück zum Menü gebracht.

#### **Diagramm Errungenschaft anlegen**
![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Erungenschaften_aktivdia.iuml)

#### **Beschreibung Registrieren**
Wenn man das Programm startet, so wird einem ein Screen mit den Auswahlmöglichkeiten: "Registrieren", "Anmelden" und "Beenden" gezeigt. Bei der Registrierung wird ein neuer Benutzer erstellt. Er wird gebeten sein Vornamen, seinen Nachnamen und ein Passwort einzugeben. Diese Daten werden vorläufig in einem Array gespeichert.

#### **Diagramm Registrieren**
![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/AktivitaetsdiagrammRegistrierung.iuml)

### **Beschreibung Abmelden**
Im Menü wird dem User die Möglichkeit "Abmelden" geboten. Wenn er diese auswählt, so gelangt er wieder auf den Anfangs Screen wo er sich registrieren, abmelden oder das Programm beenden kann. Der Unterschied zum Beenden des Programms besteht darin, dass die Daten des Users weiterhin gespeichert bleiben.

#### **Diagramm Abmelden**
![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Abmelden_Aktivitaetsdiagramm.iuml)




## 3. Diagramm Dokumentation


### **Klassendiagramm**
![y](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm.iuml)



### **Objektdiagramm**
![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Objektdiagramme.iuml)


TOFILL

TODO Diagramme anpassen
