# 1. Imagen base: Java 17 (ajusta la versión según tu proyecto)
FROM amazoncorretto:23

# 2. Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# 3. Copia el JAR compilado a la carpeta /app
COPY target/*.jar app.jar

# 4. Expone el puerto donde escucha tu API (cambiar si es diferente)
EXPOSE 8080

# 5. Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]