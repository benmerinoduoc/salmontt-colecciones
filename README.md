![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Formativa IV – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- Nombre completo: Benjamin Alejandro Merino Pinto
- Sección: 002A
- Carrera: Analista Programador Computacional
- Sede: Duoc Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Formativa IV de la asignatura Desarrollo Orientado a Objetos I. Se trata de un sistema desarrollado en Java cuyo objetivo es cargar información desde un archivo externo, convertir esos datos en objetos y administrarlos mediante una lista ArrayList.

El proyecto fue desarrollado a partir de un caso contextualizado de la empresa salmonera Salmontt, abordando una necesidad real: identificar los centros de cultivo con mayor producción. Para esto, se implementó una solución sencilla y organizada, que permite leer los datos, almacenarlos y filtrarlos de manera clara.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── data/
│   └── GestorDatos.java        # Lee el archivo y arma la lista de centros de cultivo
├── model/
│   └── CentroCultivo.java      # Clase que representa un centro (nombre, comuna, producción)
├── ui/
│   └── Main.java               # Ejecuta el programa, muestra datos y aplica filtros
📁 resources/
└── centros.txt                 # Archivo de texto con los datos separados por (;)
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/benmerinoduoc/salmontt-colecciones.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta la clase `Main` desde el paquete `ui`.

4. En la consola podrás ver la lista completa de los centros de cultivo cargados desde el archivo `centros.txt` y cuáles son los centros que cuentan con una producción mayor a 1000 toneladas.


---

**Repositorio GitHub:** https://github.com/benmerinoduoc/salmontt-colecciones
**Fecha de entrega:** 17/11/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Formativa IV
