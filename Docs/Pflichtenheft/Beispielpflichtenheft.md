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

### **Grobbeschreibung** 
Wir implementieren eine art von Steam Library. In dieser Anwendung sollen Nutzer ihre Spiele verwalten. Dabei sollen die Errungenschaften die Spielzeit und ihre Bewertung gespeichert werden. Die Steam Library soll zudem die Daten speichern somit sind die Daten später abgreifbar falls die Person die Anwendung schließt 

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


### **Spiel anlegen()**
#### **Beschreibung Funktion Fach anlegen**
Nach der Anmeldung kann der Benutzer den Menüpunkt "Spiel anlegen" auswählen. In dieser Funktion wird er nach einem Fachnamen gefragt. Dieses Spiel wird anschließend generiert und in das Array Spiele[] der Klasse Benutzer gelegt.

**Besonderheiten**
Es können maximal 11 Spiele angelegt werden. Danach erfolgt eine Ausgabe: "Maximiale Anzahl an Spielen erreicht machen sie bitte Platz frei".


#### **Diagramm (Aktivitätsdiagramm) Funktion Spiel anlegen**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/agileProjekt_2_Java/main/Docs/Pflichtenheft/Diagramme/AnwendungsFall_Fach_anlegen.iuml)

### **Errungenschaft anlegen()**
Nach dem der User sich angemeldet hat, kann er im Menü entweder ein Spiel anlegen, wodurch er gebeten wird, einen Namen für sein Spiel anzulegen. Danach wird er gebeten eine Errungenschaft für dieses Spiel anzulegen. Errungenschaften können auch angelegt werden, indem der Spieler im Menü "Spiele bearbeiten" auswählt. Danach kann er auswählen welches Spiel er bearbeiten will und bei diesem wird es ihm dann möglich sein, den Namen und die Errungenschaft wieder zu bearbeiten.

#### **Beschreibung Registrieren**
Wenn man das Programm startet, so wird einem ein Screen mit den Auswahlmöglichkeiten: "Registrieren", "Anmelden" und "Beenden" gezeigt. Bei der Registrierung wird ein neuer Benutzer erstellt. Er wird gebeten sein Vornamen, seinen Nachnamen und ein Passwort einzugeben. Diese Daten werden vorläufig in einem Array gespeichert.

#### **Diagramm Registrieren**
!![grafik](https://user-images.githubusercontent.com/94616085/155309606-99315105-f350-4afa-9822-de926ff05927.png)

### **Beschreibung Abmelden**
Im Menü wird dem User die Möglichkeit "Abmelden" geboten. Wenn er diese auswählt, so gelangt er wieder auf den Anfangs Screen wo er sich registrieren, abmelden oder das Programm beenden kann. Der Unterschied zum Beenden des Programms besteht darin, dass die Daten des Users weiterhin gespeichert bleiben.




## 3. Diagramm Dokumentation


### **Klassendiagramm**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/agileProjekt_2_Java/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm.iuml)


### **Objektdiagramm**
TOFILL

