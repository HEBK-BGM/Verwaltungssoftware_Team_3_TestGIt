# Kapitelübersicht

1. Beschreibung der Anwendung
2. Beschreibung der Funktionen
   1. mind. 4 Methoden abläufe gerne mithilfe von Diagrammen (PAP, Struktogramm, Sequenzdiagramm, Anwendungsfalldiagramm, Aktivitätsdiagramm )
3. Diagramme - Dokumentation
   1. Objektdiagramm
   2. Klassendiagramm
   3. Methoden aus 2.
      1. Sequenzdiagramm
      2. (optional) PAP, Struktogramm

## 1. Beschreibung der Anwendung
Unser Programm soll einer Steam Library ähneln. Benutzer müssen sich zuerst Registrieren dort fragt man den Benutzer nach
seinem Namen und welches Passwort er haben will. Nach der Eingabe kann er sich entscheiden, ob seine Daten gespeichert werden sollen oder nicht. Die Daten werden in einer JSON Datei abgelegt die seinen Benutzernamen als Dateinamen festlegt die JSON Datei wird über die Klasse Datenleser bearbeitet. Durch das Anmelden kann er dann sein Namen eingeben,es wird dann gesucht nach einer Datei mit diesem Namen. Falls dieser Name nicht vorhanden ist dann wird darauf hingewiesen und man wird in den Startbildschirm zurück geführt. Im Mainmenü kann der Benutzer seine Spiele verwalten und hat stets die Option das Programm zu beenden. Die Spiele werden in ein Array[] gelegt das sich beim Benutzer befindet. Ein Spiel hat viele weitere Arrays[]. Errungenschaften ist eine davon, sie braucht einen Integer der das Datum bestimmt und einen String der den Namen der Errungenschaft bestimmt. Bewertungen braucht genauso wie die Errungenschaften ein String und ein 
Integer, die Besonderheit daran ist ,dass es ein Integer zwischen 1-5 sein muss falls die Zahl nicht passt, weißt er den Nutzer daraufhin und fragt ihn erneut.
Jede Eintragung kann abgebrochen und verändert werden dazu muss der jeweilige Platz gewählt werden dies führt zu einem Optionsmenü mit den drei Optionen "Löschen" "Verändern" und "Zurückkehren". Die JSon Datei wird stets aktualisiert.
Falls man sich nicht entscheiden kann, welches Spiel man sich anschauen will, kann man unseren Zufallsgenerator verwenden dieser gibt einem dann die Möglichkeit eine reihe von Spielen auszuwählen oder die gesamte Bibliothek. Er wählt dann ein Spiel für den User aus. Eine weitere Funktion gibt euch Spieleempfehlungen anhand einer Umfrage ab falls sie mal was neues probieren möchten.
Über eine Sortieroption wird es auch verfügen somit wird je nach Auswahl nach der Spielzeit der Bewertungen oder des Kaufdatums geordnet.



### **Menüführung**
Die Menüfuhrung ist ausschließlich in der Konsole zu verwenden. Beim Start der Anwendung gibt es eine Passwortabfrage und danach kann der Nutzer wählen zwischen:
- Spiel anlegen
- Errungenschaft für Spiel eintragen
- Bewertung für Spiel eintragen
  - (erst Auswahl für ein Spiel und Kaufjahr, dann eintragen)
- Bewertung für Spiel anzeigen
- Errungenschaft für Spiel anzeigen
- abmeldung
- beenden

## 2. Beschreibung des Funktionsablaufes

### **Menü anzeigen**
#### **Beschreibung Funktion Menü anzeigen**
Nachdem man sich angemeldet/registriert hat, wird einem das Menü präsentiert. Dort kann er dann zwischen folgenden Punkten wählen:
- Spiel anlegen
- Errungenschaft anlegen
- Bewertung anlegen
- Errungenschaften/Bewertungen / Spiel anzeigen
- abmelden
- beenden



### **Spiel anlegen()**
#### **Beschreibung Funktion Spiel anlegen**
Nach der Anmeldung kann der Benutzer den Menüpunkt "Spiel anlegen" auswählen. In dieser Funktion wird er nach einem Fachnamen gefragt. Dieses Spiel wird anschließend generiert und in das Array Spiele[] der Klasse Benutzer gelegt.

**Besonderheiten**
Es können maximal 15 Spiele angelegt werden. Danach erfolgt eine Ausgabe: "Maximiale Anzahl an Spielen erreicht machen sie bitte Platz frei".


#### **Diagramm (Aktivitätsdiagramm) Funktion Spiel anlegen**

![Spiel anlegen](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/AktivitaetsdiagrammSpielanlegen.iuml)





### **Errungenschaft anlegen()**
Nachdem der User ein Spiel angelegt hat und zurück im Menü ist, kann er dort "Errungenschaft anlegen" auswählen. Für diese Tätigkeit verwendet unser Programm zwei Arrays. Einen Integer, um das Datum an dem dieses Spiel "gekauft" wurde festzulegen und einen String Array um den Namen des Spiels zu bestimmen. Außerdem gibt es die Möglichkeit direkt nachdem man das Spiel angelegt hat, eine Errungenschaft anzulegen.

#### **Diagramm Errungenschaft anlegen**
![Errungenschaft anlegen](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Erungenschaften_aktivdia.iuml)

#### **Beschreibung Registrieren**
Wenn man das Programm startet, so wird einem ein Screen mit den Auswahlmöglichkeiten: "Registrieren", "Anmelden" und "Beenden" gezeigt. Bei der Registrierung wird ein neuer Benutzer erstellt. Er wird gebeten seinen Namen, ein Passwort und sein Alter einzugeben. Diese Daten werden vorläufig in Arrays gespeichert.

#### **Diagramm Registrieren**
![Registrieren](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/AktivitaetsdiagrammRegistrierung.iuml)

### **Beschreibung Abmelden**
Im Menü wird dem User die Möglichkeit "Abmelden" geboten. Wenn er diese auswählt, so gelangt er wieder auf den Anfangs Screen wo er sich registrieren, abmelden oder das Programm beenden kann. Der Unterschied zum Beenden des Programms besteht darin, dass die Daten des Users weiterhin gespeichert bleiben, auch ohne eine JSON Datei erstellen zu müssen.

#### **Diagramm Abmelden**
![Abmelden](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Abmelden_Aktivitaetsdiagramm.iuml)




## 3. Diagramm Dokumentation

### **Sequenzdiagramm**
![Sequenzdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Sequenzdiagramm.iuml)


### **Klassendiagramm**
![Klassendiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm.iuml)



### **Objektdiagramm**
![Objektdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_3/main/Docs/Pflichtenheft/Diagramme/Objektdiagramme.iuml)



