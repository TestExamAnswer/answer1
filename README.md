# Examen "read head"

Tarea a resolver
Es un problema, que se debe presentar todos los días en los micros que desarrollan.
De preferencia no hagas uso  de cualquier implementación de Java Collection Api, De preferencia has uso de programación funcional.

 

De nuevo, el código para ambos métodos tiene que ser mediante programación funcional.

Tiene que ser eficiente, y cumplir con los estándares que ya conocen.


### Pre-requisitos 📋

Java 8
Apache Maven 3.5.4
Eclipse
Postman

### Instalación 🔧

en cmd:
mvn update
mvn clean install
mvn spring-boot: roon

en eclipse:
maven -> update project...
run as -> maven clean
run as -> maven install
run as -> spring boot app

## Ejecutando las pruebas ⚙️

en postman con el metodo post se usa la url

http://localhost:8080/greeting?name=fourth&name=first

donde el parametro name filtra las cabeceras que se veran desplegadas en la respuesta, en este caso mostrara los valores de la cabecera fourth y first.

con las cabeceras:

key:  value
first:5,4,6,4
second:5,4,6,4
third:5,4,6,4
fourth:["aaa","bbb","ccc"]
Content-Type:application/json

la respuesta sera de este tipo:

{
    "headersLst": {
        "fourth": [
            "[\"aaa\"",
            "\"bbb\"",
            "\"ccc\"]"
        ],
        "first": [
            "5",
            "4",
            "6",
            "4"
        ]
    },
    "content": "Headers requested, [fourth, first]!",
    "listWithoutDuplicates": [
        1,
        2,
        3,
        4,
        5,
        6
    ]
}

listWithoutDuplicates elimina los duplicados de la lista de elementos : 1,2,2,4,4,3,4,5,6. esta lista se encuentra creada dentro del controller

