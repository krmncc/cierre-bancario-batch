# Cierre bancario con Spring Batch

**Autor:** Tu Nombre Completo

## Cómo correrlo

    docker compose up -d --wait
    ./correr.sh 2026-09-30 prueba
    ./ver-batch.sh

## Día 1 · Mi primer Job

### Boleto de salida

1. ¿Qué diferencia hay entre un proceso batch y la API REST de la Semana 3? Da dos.
un proceso batch solo neesita que arranquemos , por ejemplo, el cierre bancario que trabajara toda la noche y cuando termine el solo se apaga.
Una API REST necesita ser ejecutado para trabajar mientras sigue encendido para hacerle las peticiones que se rquieren (get, set, delete, buscar). Como por ejemplo un set de empledos de x empresa para hacer una operación con ellos. 
2. ¿Qué es un Job, qué es un Step y qué es un Tasklet?
un job es el proceso que se necesita para obtner información, un Step es una parte de job, el job se divide en steps, el Tasklet es la operación que realiza un step.
3. Con tus tablas: ¿qué diferencia hay entre una **JobInstance** y una **JobExecution**?
La primera guarda las instancias de los jobs, la segunda las ejecuciones de las instancias.
4. ¿Por qué Spring Batch no deja correr dos veces el cierre del 28?
Porque ya existe y si queremos ejecutarlo otra vez: se borra o se cambian los parámetros, en terminos bancarios, es cobraar doble vez intereses al cliente.
5. (MP-4, paso 6) Si mañana llega el archivo del 25 y corres otra vez el cierre del 25, ¿será otra instancia u
   otra ejecución de la misma? ¿Por qué lo crees?
   Yo creo que seria otra instancia del mismo job pero con parametros diferentes porque si no pasaría lo de la pregunta anterior