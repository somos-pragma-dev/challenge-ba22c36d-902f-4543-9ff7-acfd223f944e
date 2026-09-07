# Desarrollo de API REST para Gestión de Productos y Pedidos

Debes desarrollar una API REST para un e-commerce que permita la gestión de productos y pedidos. El sistema debe manejar relaciones entre entidades como Product, Order y Customer, y debe implementar autenticación y autorización basada en JWT. Además, deberás asegurar que la API esté bien documentada y que maneje errores de manera centralizada. El sistema debe ser escalable y seguro, cumpliendo con los principios SOLID y utilizando clean code.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura de API REST Empresarial con Spring Boot |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de Datos

**Objetivo:** Definir y modelar las entidades Product, Order y Customer con sus relaciones OneToMany y ManyToMany.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Identificar y definir las entidades del dominio.
- Establecer las relaciones entre las entidades.
- Garantizar la integridad referencial entre las entidades.

**Entregable:** Diagrama de relaciones entre entidades y definición de los modelos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los atributos necesarios para cada entidad.
- Piensa en cómo las entidades se relacionan en el dominio del e-commerce.

</details>

### Fase 2: Implementación de Servicios de Negocio

**Objetivo:** Implementar los servicios de negocio que interactúan con las entidades modeladas.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Crear servicios que gestionen las operaciones CRUD para cada entidad.
- Asegurar que los servicios sigan los principios SOLID y utilicen clean code.

**Entregable:** Servicios de negocio implementados y probados.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza patrones de diseño adecuados para cada servicio.
- Aplica validaciones necesarias en los servicios.

</details>

### Fase 3: Autenticación y Autorización

**Objetivo:** Implementar autenticación y autorización basada en JWT.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar Spring Security para manejar autenticación y autorización.
- Definir roles de ADMIN y USER con acceso diferenciado por endpoint.

**Entregable:** Configuración de Spring Security con JWT y roles definidos.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre JWT y su uso en autenticación.
- Considera los diferentes niveles de acceso necesarios para los roles definidos.

</details>

### Fase 4: Documentación y Manejo de Errores

**Objetivo:** Documentar la API y manejar los errores de manera centralizada.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Utilizar OpenAPI 3.0 y Swagger UI para documentar la API.
- Implementar @ControllerAdvice para manejar errores centralizados y respuestas estandarizadas en formato JSON.

**Entregable:** API documentada y manejo de errores centralizado.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre OpenAPI y Swagger UI.
- Piensa en los diferentes tipos de errores que pueden ocurrir y cómo manejarlos de manera centralizada.

</details>

### Fase 5: Pruebas y Containerización

**Objetivo:** Implementar pruebas unitarias y de integración, y containerizar la aplicación.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Escribir pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%.
- Escribir pruebas de integración con @SpringBootTest verificando los flujos principales.
- Containerizar la aplicación con Docker usando Dockerfile multi-stage optimizado para producción.

**Entregable:** Pruebas unitarias y de integración implementadas, y aplicación containerizada.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre JUnit 5 y Mockito para escribir pruebas unitarias.
- Piensa en los diferentes casos de prueba necesarios para cubrir la capa de servicio.
- Investiga sobre Docker y Dockerfile para containerizar la aplicación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las entidades Product, Order y Customer y cómo se relacionan en el dominio del e-commerce?
- **paraQueSirve**: ¿Para qué sirven los servicios de negocio en el contexto de la API REST?
- **comoSeUsa**: ¿Cómo se utiliza JWT para autenticación y autorización en la API?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar la autenticación y autorización basada en JWT?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de autenticación y autorización basada en JWT?

## Criterios de Evaluacion

- Modelar correctamente las entidades del dominio.
- Implementar servicios de negocio siguiendo los principios SOLID y utilizando clean code.
- Configurar autenticación y autorización basada en JWT con roles definidos.
- Documentar la API utilizando OpenAPI 3.0 y Swagger UI.
- Implementar manejo centralizado de errores utilizando @ControllerAdvice.
- Escribir pruebas unitarias y de integración para cubrir la capa de servicio.
- Containerizar la aplicación utilizando Docker con un Dockerfile multi-stage optimizado para producción.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
