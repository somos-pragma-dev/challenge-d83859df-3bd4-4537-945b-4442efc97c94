# Fundamentos de Microservicios con Kotlin

El sistema de préstamos personales de una entidad bancaria se ha vuelto complejo y requiere ser dividido en microservicios para mejorar su mantenibilidad y escalabilidad. El objetivo es entender cómo diseñar y construir microservicios en Kotlin, considerando aspectos como la comunicación entre servicios, la gestión de fallos y la observabilidad.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | microservicios con kotlin |
| **Nivel** | junior-l1 |
| **Tipo** | theoretical |
| **Tiempo estimado** | 3 horas |

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

### Fase 1: Introducción a Microservicios

**Objetivo:** Comprender los conceptos básicos de microservicios y su aplicación en Kotlin.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga y describe los conceptos clave de microservicios.
- Identifica las ventajas y desventajas de usar microservicios en un sistema distribuido.

**Entregable:** Documento que describe los conceptos y consideraciones para usar microservicios en Kotlin.

<details>
<summary>Pistas de conocimiento</summary>

- Investigar arquitecturas de microservicios y sus patrones comunes.
- Analizar casos de uso de microservicios en sistemas bancarios.

</details>

### Fase 2: Comunicación entre Microservicios

**Objetivo:** Entender las diferentes formas de comunicación entre microservicios y sus implicaciones.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga y describe los diferentes métodos de comunicación entre microservicios (sincrónica vs. asincrónica).
- Identifica los pros y contras de cada método y cómo afectan la latencia y la consistencia del sistema.

**Entregable:** Documento que describe los métodos de comunicación entre microservicios y sus implicaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Analizar ejemplos de comunicación sincrónica y asincrónica en sistemas distribuidos.
- Investigar patrones de integración de microservicios.

</details>

### Fase 3: Gestión de Fallos y Observabilidad

**Objetivo:** Comprender la importancia de la gestión de fallos y la observabilidad en microservicios.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga y describe técnicas comunes para la gestión de fallos en microservicios (circuit breakers, retries, fallbacks).
- Identifica herramientas y prácticas para mejorar la observabilidad de microservicios (logging, monitoring, tracing).

**Entregable:** Documento que describe técnicas de gestión de fallos y prácticas de observabilidad para microservicios.

<details>
<summary>Pistas de conocimiento</summary>

- Analizar ejemplos de implementación de circuit breakers en sistemas distribuidos.
- Investigar herramientas de logging, monitoring y tracing para microservicios.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los microservicios y por qué se usan en sistemas distribuidos?
- **paraQueSirve**: ¿Cuáles son las ventajas y desventajas de usar microservicios en un sistema bancario?
- **comoSeUsa**: ¿Cuáles son los diferentes métodos de comunicación entre microservicios y cómo afectan la latencia y consistencia del sistema?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar microservicios y cómo se pueden mitigar?
- **queDecisionesImplica**: ¿Qué decisiones deben tomarse al elegir técnicas de gestión de fallos y prácticas de observabilidad para microservicios?

## Criterios de Evaluacion

- Comprender los conceptos básicos de microservicios y su aplicación en Kotlin.
- Identificar las ventajas y desventajas de usar microservicios en un sistema distribuido.
- Describir los diferentes métodos de comunicación entre microservicios y sus implicaciones.
- Identificar técnicas comunes para la gestión de fallos en microservicios.
- Describir herramientas y prácticas para mejorar la observabilidad de microservicios.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
