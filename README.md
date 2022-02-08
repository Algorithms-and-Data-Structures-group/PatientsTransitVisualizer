# Patients Transit Visualizer

An app illustrating patients being transferred to hospitals.

## Technologies used
Java, JavaFX, Maven, JUnit 5

## Initialization of a map
To create a map with hospitals - first load the .txt file that has an information about hospitals, objects and paths in it. 
The file should look like this:
```
# Szpitale (id | nazwa | wsp. x | wsp. y | Liczba łóżek | Liczba wolnych łóżek)
1 | Szpital Wojewódzki nr 997 | 10 | 10 | 1000 | 1
2 | Krakowski Szpital Kliniczny | 100 | 120 | 999 | 1
3 | Pierwszy Szpital im. Prezesa RP | 120 | 130 | 99 | 1
4 | Drugi Szpital im. Naczelnika RP | 10 | 140 | 70 | 1
5 | Trzeci Szpital im. Króla RP | 140 | 10 | 996 | 1
6 | Szapital dodany |  140 | 70 | 10 | 1

# Obiekty (id | nazwa | wsp. x | wsp. y)
1 | Pomnik Wikipedii | -1 | 50
2 | Pomnik Fryderyka Chopina | 110 | 55
3 | Pomnik Anonimowego Przechodnia | 40 | 70

# Drogi (id | id_szpitala | id_szpitala | odległość)
1 | 1 | 2 | 700
2 | 1 | 4 | 550
3 | 1 | 5 | 800
4 | 2 | 3 | 300
5 | 2 | 4 | 550
6 | 3 | 5 | 600
7 | 4 | 5 | 750
8 | 6 | 4 | 600

```
The map for the following example looks like this:
<img width="912" alt="Screenshot 2021-05-29 at 19 35 21" src="https://user-images.githubusercontent.com/60079684/120079732-95d04500-c0b5-11eb-8f85-80b1c2ec6728.png">

Next step is adding patients, that need to be transported to the nearest hospital.
You can either add them from coordinates, map or file
### Coordinates 
Type in x and y coords and press Add button.

### Map
Press Add button and press any place in the map.

### File
Press Load File button and select .txt file with the following format:

```
# Pacjenci (id | wsp. x | wsp.y)
1 | 20 | 20
2 | 99 | 105
3 | 23 | 40
```
## Simulation 
Select simulation speed and press Start button. First the transported patiens are highlighted, and then the hospital they are being transported to. If all the hospital beds are in use - the patient is being transported to the next nearest hospital. If all hospitals admissions are suspended due to lack of available beds - patient is waiting in the queue in the nearest hospital.

<img width="912" alt="Screenshot 2021-05-29 at 19 50 02" src="https://user-images.githubusercontent.com/60079684/120080003-10e62b00-c0b7-11eb-8704-b04fedd7ebe6.png">

## Authors
* [Martyna Jakubowska](https://github.com/mjakubowska)
* [Artur Prasuła](https://github.com/lilartisto)
* [Hubert Nakielski](https://github.com/nakielsh)
