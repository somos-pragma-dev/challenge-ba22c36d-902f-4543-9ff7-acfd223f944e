# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Desarrollar una API REST empresarial con Spring Boot 3 para la gestión de productos y pedidos en un e-commerce. El sistema debe incluir: arquitectura en capas con controladores REST, servicios de negocio y repositorios JPA; modelado de datos con entidades Product, Order y Customer usando relaciones OneToMany y ManyToMany con Hibernate; autenticación y autorización basada en JWT con Spring Security, incluyendo roles de ADMIN y USER con acceso diferenciado por endpoint; documentación automática con OpenAPI 3.0 y Swagger UI accesible en /api-docs; manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON; validación de entradas con Bean Validation usando @Valid, @NotNull y @Size; paginación y ordenamiento de resultados en los endpoints de listado usando Pageable; pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%; pruebas de integración con @SpringBootTest verificando los flujos principales; y containerización con Docker usando Dockerfile multi-stage optimizado para producción. El desarrollador debe implementar el módulo completo desde la capa de persistencia hasta los controladores REST, aplicando principios SOLID y clean code en cada capa.

### Reto
- Tema: Arquitectura de API REST Empresarial con Spring Boot
- Seniority: junior-l2
- Tipo: practical
- Título: Desarrollo de API REST para Gestión de Productos y Pedidos
- Tiempo estimado: 40 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Modelado de Datos — objetivo: Definir y modelar las entidades Product, Order y Customer con sus relaciones OneToMany y ManyToMany. — entregable (NO resolver): Diagrama de relaciones entre entidades y definición de los modelos.
- Fase 2: Implementación de Servicios de Negocio — objetivo: Implementar los servicios de negocio que interactúan con las entidades modeladas. — entregable (NO resolver): Servicios de negocio implementados y probados.
- Fase 3: Autenticación y Autorización — objetivo: Implementar autenticación y autorización basada en JWT. — entregable (NO resolver): Configuración de Spring Security con JWT y roles definidos.
- Fase 4: Documentación y Manejo de Errores — objetivo: Documentar la API y manejar los errores de manera centralizada. — entregable (NO resolver): API documentada y manejo de errores centralizado.
- Fase 5: Pruebas y Containerización — objetivo: Implementar pruebas unitarias y de integración, y containerizar la aplicación. — entregable (NO resolver): Pruebas unitarias y de integración implementadas, y aplicación containerizada.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/example/ecommerce/domain/model/Product.java ===
package com.example.ecommerce.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    @Positive
    private Double price;
    @NotBlank
    private String description;

    // Getters and setters
}

// === ARCHIVO: src/main/java/com/example/ecommerce/domain/model/Order.java ===
package com.example.ecommerce.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @ManyToOne
    private Customer customer;
    // Other fields, getters and setters
}

// === ARCHIVO: src/main/java/com/example/ecommerce/domain/model/Customer.java ===
package com.example.ecommerce.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    // Other fields, getters and setters
}

// === ARCHIVO: src/main/java/com/example/ecommerce/application/service/ProductService.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Product;
import com.example.ecommerce.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    // Other CRUD operations
}

// === ARCHIVO: src/main/java/com/example/ecommerce/application/service/OrderService.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Order;
import com.example.ecommerce.infrastructure.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    // Other CRUD operations
}

// === ARCHIVO: src/main/java/com/example/ecommerce/application/service/CustomerService.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Customer;
import com.example.ecommerce.infrastructure.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    // Other CRUD operations
}

// === ARCHIVO: src/main/java/com/example/ecommerce/infrastructure/repository/ProductRepository.java ===
package com.example.ecommerce.infrastructure.repository;

import com.example.ecommerce.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}

// === ARCHIVO: src/main/java/com/example/ecommerce/infrastructure/repository/OrderRepository.java ===
package com.example.ecommerce.infrastructure.repository;

import com.example.ecommerce.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}

// === ARCHIVO: src/main/java/com/example/ecommerce/infrastructure/repository/CustomerRepository.java ===
package com.example.ecommerce.infrastructure.repository;

import com.example.ecommerce.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}

// === ARCHIVO: src/main/java/com/example/ecommerce/infrastructure/security/SecurityConfig.java ===
package com.example.ecommerce.infrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
           .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
           .and()
           .authorizeRequests()
           .antMatchers("/api/auth/**").permitAll()
           .anyRequest().authenticated();
        return http.build();
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driverClassName: org.h2.Driver
    username: sa
    password: 
  h2:
    console:
      enabled: true
  security:
    oauth2:
      resourceserver:
        jwt:
          jwk-set-uri: https://dev-abc123.us.auth0.com/.well-known/jwks.json

// === ARCHIVO: src/main/resources/openapi.yaml ===
openapi: 3.0.0
info:
  title: Ecommerce API
  version: 1.0.0
paths:
  /api/products:
    get:
      summary: Retrieve all products
      responses:
        '200':
          description: A list of products

// === ARCHIVO: src/main/java/com/example/ecommerce/infrastructure/exception/GlobalExceptionHandler.java ===
package com.example.ecommerce.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex) {
        return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

// === ARCHIVO: Dockerfile ===
FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY..
RUN./gradlew build -x test

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

// === ARCHIVO: src/test/java/com/example/ecommerce/application/service/ProductServiceTest.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Product;
import com.example.ecommerce.infrastructure.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product(1L, "Product 1", 10.0, "Description 1");
        Product product2 = new Product(2L, "Product 2", 20.0, "Description 2");
        List<Product> products = Arrays.asList(product1, product2);
        when(productRepository.findAll()).thenReturn(products);
        List<Product> result = productService.getAllProducts();
        assertEquals(2, result.size());
        assertEquals(product1, result.get(0));
        assertEquals(product2, result.get(1));
    }
}

// === ARCHIVO: src/test/java/com/example/ecommerce/application/service/OrderServiceTest.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Order;
import com.example.ecommerce.infrastructure.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;
    @InjectMocks
    private OrderService orderService;

    @Test
    public void testGetAllOrders() {
        Order order1 = new Order(1L, null);
        Order order2 = new Order(2L, null);
        List<Order> orders = Arrays.asList(order1, order2);
        when(orderRepository.findAll()).thenReturn(orders);
        List<Order> result = orderService.getAllOrders();
        assertEquals(2, result.size());
        assertEquals(order1, result.get(0));
        assertEquals(order2, result.get(1));
    }
}

// === ARCHIVO: src/test/java/com/example/ecommerce/application/service/CustomerServiceTest.java ===
package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Customer;
import com.example.ecommerce.infrastructure.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
    @Mock
    private CustomerRepository customerRepository;
    @InjectMocks
    private CustomerService customerService;

    @Test
    public void testGetAllCustomers() {
        Customer customer1 = new Customer(1L, "Customer 1", "customer1@example.com");
        Customer customer2 = new Customer(2L, "Customer 2", "customer2@example.com");
        List<Customer> customers = Arrays.asList(customer1, customer2);
        when(customerRepository.findAll()).thenReturn(customers);
        List<Customer> result = customerService.getAllCustomers();
        assertEquals(2, result.size());
        assertEquals(customer1, result.get(0));
        assertEquals(customer2, result.get(1));
    }
}
```
