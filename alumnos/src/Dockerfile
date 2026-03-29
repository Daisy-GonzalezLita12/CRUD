# Usar Java 17
FROM eclipse-temurin:17-jdk

# Carpeta de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Dar permisos a Maven
RUN chmod +x mvnw

# Compilar el proyecto
RUN ./mvnw clean package -DskipTests

# Ejecutar el .jar
CMD ["java", "-jar", "target/*.jar"]