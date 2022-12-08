# T-evolvers-automation

<H2>Este proyecto cuenta con las siguientes características:</H2>

- Lenguaje de programación: Java 
- Framework de Automatización: REST-assured 
- Patrón de diseño: Screenplay
- Framework de soporte BDD (Behavior development driver): Cucumber
- Lenguaje de BDD (Behavior development driver): Gherkin
- Constructor de proyecto: Gradle

**Nota:** El proyecto esta diseñado para ser ejecutado en maquinas Windows y navegador Chrome.

<H2>El proyecto posee la siguiente estructura:</H2>

- [ ] src/main/java/co/com/tevolvers/prueba/enums: Este paquete contiene todos los enums del proyecto, por ejemplo, mensajes, rutas o palabras.
- [ ] src/main/java/co/com/tevolvers/prueba/execptions: Este paquete contiene todas las excepciones que fueron diseñadas en el proyecto.
- [ ] src/main/java/co/com/tevolvers/prueba/interactions: Este paquete maneja todas las funciones de iteraciones.
- [ ] src/main/java/co/com/tevolvers/prueba/models: Este paquete contiene las clases que orquestaran toda la data necesaria para ejecutar las pruebas automatizadas.
- [ ] src/main/java/co/com/tevolvers/prueba/questions: Este paquete contiene las questions que se realizaran durante la prueba.
- [ ] src/main/java/co/com/tevolvers/prueba/tasks: Este paquete maneja las tareas que va realizar el usuario para cumplir con lo esperado en la prueba automatizada, asi cumpliendo con el patrón de diseño Screenplay
- [ ] src/main/java/co/com/tevolvers/prueba/utils: En este paquete tenemos las clases que nos ayudaran a cumplir con el BDD ya sea seteando data, obteniendo un texto, entre otros.
- [ ] src/test/java/co/com/tevolvers/prueba/runner: Este paquete contiene el archivo runner el cual se encarga de ejecutar la prueba.
- [ ] src/test/java/co/com/tevolvers/prueba/stepDefinitios: Este paquete contiene los archivos de steps los cuales definen el paso a paso de el lado de lógica de programación.
- [ ] src/test/resources/co/com/tevolvers/prueba/features: Este paquete contiene los archivos feature los cuales definen el escenario a evaluar del lado del BDD.
- [ ] gitignore: El archivo encargado de bloquear subir archivos no necesarios en el repositorio.

<H2>Datos adicionales del proyecto:</H2>

- Se implemento la anotación "@share" de serenity para compartir data entre diferentes contextos.
- Se implemento tag generico llamado "@RegressionTest" para poder ejecutar toda las suites de pruebas.

<H2>Pasos para obtener el proyecto de automation:</H2>

- Clonar el repositorio en la ubicación deseada, usando el comando: git clone https://github.com/TestQAAutomation/T-evolvers-automation

<H2>Pasos para ejecutar el proyecto</H2>

- Se debe primero realizar los pasos de la sección "Pasos para obtener el proyecto de automation" 
- Abrir el proyecto en el IDE de su preferencia que soporte Java, ejecutar el archivo TestRunner, este runner por defecto esta configurado con el tag @RegressionTest para ejecutar todas las pruebas

<H2>Generación de reporte del framework</H2>
- Ejecute el proyecto, diríjase a la carpeta target/site/serenity y una vez alli abra en el navegador de su preferencia el archivo index