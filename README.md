# Keycloak & Spring

### Dependencies
- Spring Boot Starter Rest
- Spring Boot Starter Security
- Spring Boot Starter Keycloak

### Versions
- JDK - 1.8
- Spring Boot - 2.4.2
- Keycloak - 12.0.3

### Build & Run Spring

```sh
mvn clean install
mvn spring-boot:run
```

### Keycloak on Docker

```sh
docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:12.0.3
```

## Endpoints
| Method | Path |
| ------ | ------ |
| Get | /admin-home|
| Get | /user-home|
| Get | /credential|