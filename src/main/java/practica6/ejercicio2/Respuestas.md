# Plantillas y herencia:
## ¿Qué debo hacer si aparece una nueva fuente de energía (por ejemplo, paneles solares con baterías)? ¿Cuántas y cuáles clases debo agregar en caso de querer todas las variantes de robots posibles para este nuevo tipo de fuente de energía?
    Se deben agregar tantas clases como variantes se deseen agregar: teniendo Robots con bombas y robots con lasers, sería necesario crear la clase abstracta SolarRobot, de la cual heredarían dos clases abstractas SolarOvercraftRobot y SolarCaterpilarRobot, de las cuales, respectivamente, heredarían otras dos clases: SolarCaterpilarRobotWithLasers y SolarCaterpilarRobotWithBombs. Se aplicaría de la misma forma de la que está aplicado el NuclearRobot en el recurso dado por la cátedra.
![UML](https://imgur.com/a/DU3IcxL)

## ¿Puedo cambiarle, a un robot existente, el sistema de armas sin tener que instanciar el robot de nuevo?
    Con herencia, no.

## ¿Dónde almacenaría usted el nivel de carga de la batería? ¿Qué implicaría eso si antes de disparar el láser hay que garantizar que la fuente de energía puede satisfacer el consumo del arma?
    Utilizando herencia es necesario agregar la carga de batería a cada tipo de robot, lo cual implica repetir código en los hijos.

# Plantillas y composición:
## ¿Qué debo hacer si aparece una nueva fuente de locomoción (por ejemplo, motor con ruedas con tracción 4x4)? ¿Cuántas y cuáles clases debo agregar en caso de querer todas las variantes de robots posibles para este nuevo tipo de sistema de locomoción?
    Utilizando composición esto es más simple ya que sólo se agrega la nueva subclase FourByFourWheels a LocomotionSystem, y se instancia un Robot con un sistema de locomoción 4x4. Esto se lograría con el siguiente código:
        Robot r = new Robot(new FourByFourWheels(), new LaserSystem(), new SolarWithBattery);
    Donde FourByFourWheels es el tipo de locomoción, LaserSystem el tipo de armamento y SolarWithBattery el tipo de fuente de energía.
![UML](https://imgur.com/a/dkgxOMF)

## ¿Puedo cambiarle, a un robot existente, el sistema de armas sin tener que instanciar el robot de nuevo?
   Si.

## ¿Donde almacenaría usted el nivel de carga de la batería? ¿Qué implicaría eso si antes de disparar el láser hay que garantizar que la fuente de energía puede satisfacer el consumo del arma?
   Lo guardaría en la clase EnergySource, ya que al utilizar armamento (sea láser o bombas) se envía un mensaje de consulta a la fuente de energía.


# Explique las ventajas y desventajas de las dos formas de extensión del framework (herencia y composición):
## Herencia:
    Pros:
        Se conocen todos los atributos en cualquier parte del programa por lo que no se necesitan parámetros.
    Contras:
        No se pueden cambiar las partes de un robot en ejecución.
        Por cada combinación a agregar se deben escribir muchas clases.
## Composición:
    Pros:
        Menos clases con muchas combinaciones posibles.
        Se pueden cambiar las partes de un robot en ejecución.
        Mejor delegación de tareas.
    Contras:
        No se conocen los atributos por lo que es necesario usar parámetros.
        Se envían muchos mensajes entre objetos.
