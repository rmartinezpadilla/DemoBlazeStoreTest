Prerequisitos
Necesitará las siguientes cosas correctamente instaladas en su computadora.

Git
Gradle

Ejecución de pruebas
De forma predeterminada, las pruebas ejecutarán el entorno predeterminado, generando un informe en la carpeta Target y ejecutando solo los casos de prueba de regresión:
gradle clean test aggregatte

Los resultados de la prueba se registrarán en el archivo target/site/serenity directory, open the index.html

El archivo detallará los resultados de la última ejecución.

La estructura del directorio del proyecto.
El proyecto tiene scripts de compilación para Gradle y sigue la estructura de directorios estándar utilizada en la mayoría de los proyectos de Serenity:


src
+ main                                  | Fuente principal
+ test                                  |
    + java                                | Ejecutores de prueba y código de soporte
        + features                          | Caracteristicas
            + {feature_name}                  | Caracteristicas nombre
                + pages                         | Pages use with webdriver test
                + steps                         | Uso de páginas con prueba de controlador web
            + {feature_name}Definition.java   | Definicion de clases

        + RunnerTestSuite.java              | Clase principal
    + resources                           |
        + features                          | Archivo de características
          + {feature_name}                 | Archivo de características específico
          {feature_name}.feature        |
          serenity.properties                       | Propiedades generales Serenity