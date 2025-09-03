# 🧮 Calculadora Java con Interfaz Gráfica

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java)
![Swing](https://img.shields.io/badge/Java-Swing-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

Una calculadora funcional desarrollada en Java con interfaz gráfica utilizando Swing, que permite realizar operaciones matemáticas básicas de manera intuitiva.

## ✨ Características

- ➕ **Operaciones básicas**: Suma, resta, multiplicación y división
- 🎨 **Interfaz intuitiva**: Diseño similar a calculadoras físicas convencionales
- ⌨️ **Entrada por botones**: Interacción mediante clics en lugar de teclado
- 🧹 **Función de limpieza**: Botón 'C' para reiniciar la calculadora
- 🔄 **Operaciones consecutivas**: Permite seguir calculando con el resultado anterior
- 📱 **Diseño responsive**: Botones de tamaño fijo (80x80px) y disposición organizada

## 🖼️ Vista Previa

![Calculadora en funcionamiento](https://via.placeholder.com/350x450/ffffff/000000?text=Calculadora+Java)

## 🚀 Requisitos del Sistema

- **Java Development Kit (JDK)**: Versión 8 o superior
- **Entorno de desarrollo**: NetBeans (recomendado) o cualquier IDE compatible con Java
- **Sistema operativo**: Windows, macOS o Linux

## 📦 Instalación y Ejecución

### Método 1: Desde NetBeans
1. Descarga e instala [Apache NetBeans](https://netbeans.apache.org/download/index.html)
2. Clona o descomprime este proyecto en tu equipo
3. Abre NetBeans y selecciona `File > Open Project`
4. Navega hasta la carpeta del proyecto y ábrelo
5. Ejecuta el proyecto con `Run > Run Project` (F6)

### Método 2: Desde línea de comandos
```bash
# Compilar el proyecto
javac -d bin src/calculadora/Calculadora.java

# Ejecutar la aplicación
java -cp bin calculadora.Calculadora
```

## 🎮 Cómo Usar

1. **Ingresar números**: Haz clic en los botones numéricos (0-9)
2. **Seleccionar operación**: Elige una operación (+, -, *, /)
3. **Ingresar segundo número**: Selecciona los dígitos del segundo operando
4. **Calcular resultado**: Presiona el botón igual (=) para obtener el resultado
5. **Limpiar pantalla**: Usa el botón 'C' para reiniciar la calculadora

## 🏗️ Estructura del Proyecto

```
Calculadora/
├── src/
│   └── calculadora/
│       └── Calculadora.java
├── README.md
└── Calculadora.jar
```

## 🔧 Tecnologías Utilizadas

- **Java Swing**: Para la interfaz gráfica de usuario
- **BorderLayout y GridLayout**: Para organizar los componentes visuales
- **ActionListener**: Para manejar eventos de los botones
- **JTextField**: Para mostrar números y resultados

## 📋 Funcionalidades Implementadas

- [x] Interfaz gráfica con botones numéricos y operadores
- [x] Concatenación de dígitos para formar números multi-dígito
- [x] Operaciones aritméticas básicas (+, -, *, /)
- [x] Visualización de operaciones en tiempo real
- [x] Manejo de eventos de clic para todos los botones
- [x] Función de limpieza (botón C)
- [x] Cálculo y visualización de resultados

## 🎯 Casos de Uso

- Estudiantes aprendiendo programación en Java
- Personas que necesitan una calculadora básica
- Desarrolladores que buscan ejemplos de interfaces Swing
- Proyectos educativos sobre manejo de eventos en Java

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👥 Contribuciones

Las contribuciones son bienvenidas. Por favor, lee las guías de contribución antes de enviar un pull request.

## 📞 Soporte

Si tienes preguntas o encuentras algún problema, por favor abre un issue en el repositorio del proyecto.

---

**¡Disfruta usando la calculadora!** 🎉
