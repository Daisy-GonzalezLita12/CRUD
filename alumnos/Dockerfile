# Usar Java 21
FROM eclipse-temurin:21-jdk

# Crear carpeta de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Dar permisos a Maven Wrapper
RUN chmod +x mvnw

# Compilar el proyecto
RUN ./mvnw clean package -DskipTests

# Ejecutar el jar
CMD ["java", "-jar", "target/alumnos-0.0.1-SNAPSHOT.jar"]