# Manager
#####Manager User

#### Manager - SpringBoot Java 8 Gradle
Desarrolle una aplicación que exponga una API RESTful de creación de usuarios.
Todos los endpoints deben aceptar y retornar solamente JSON, inclusive al para los mensajes de error.
Todos los mensajes deben seguir el formato:
```bash
{ "mensaje" : "mensaje de error" }
```
#####Registro

Ese endpoint deberá recibir un usuario con los campos "nombre", "correo", "contraseña", más
un listado de objetos "teléfono", respetando el siguiente formato:
```bash
{
"name" : "Juan Rodriguez" ,
"email" : " juan@rodriguez.org " ,
"password" : "hunter2" ,
"phones" : [
        {
            "number" : "1234567" ,
            "citycode" : "1" ,
            "contrycode" : "57"
        }
    ]
}
```
Responder el código de status HTTP adecuado
En caso de éxito, retorne el usuario y los siguientes campos:
○ id: id del usuario (puede ser lo que se genera por el banco de datos, pero sería más
deseable un UUID)
○ created: fecha de creación del usuario
○ modified: fecha de la última actualización de usuario
○ last_login: del último ingreso (en caso de nuevo usuario, va a coincidir con la fecha
de creación)
○ token: token de acceso de la API (puede ser UUID o JWT)
○ isactive: Indica si el usuario sigue habilitado dentro del sistema.
Si caso el correo conste en la base de datos, deberá retornar un error "El correo ya
registrado".
El correo debe seguir una expresión regular para validar que formato sea el correcto.
( aaaaaaa@dominio.cl )
La clave debe seguir una expresión regular para validar que formato sea el correcto. (Una
Mayuscula, letras minúsculas, y dos números)
Se debe hacer traza de logs dentro del aplicativo.●
El token deberá ser persistido junto con el usuario

## Etapas de compilação
1. Clone repository
```bash
git clone https://github.com/jlopez34/staff-app.git
cd staff-app
```
2. Build Angular application
```bash
cd frontend/frontend-app
ng build
```
3. Build backend services
```bash
cd ../../backend
cd staff-service
mvn clean package

```
4. Build and run docker compose
```bash
cd ../../
docker-compose build
docker-compose up
```
5. Open browser on http://localhost

## Pré-requisitos
- Java 8
- gradle-6.0.1
