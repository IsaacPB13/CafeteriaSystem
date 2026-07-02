# ☕ Práctica: Sistema de Cafetería en JAVA


# Integrantes
* María Isabel Valdovinos Lira 
* Santiago Emanuel Cariño Macedo
* Rodrigo Flores
* Isaac Ulises Pérez Bravo

## Objetivo

Desarrollar un sistema sencillo para una cafetería aplicando los conceptos fundamentales de Programación Orientada a Objetos (POO) en Java.

El sistema deberá permitir administrar un menú de productos y generar una orden de compra para calcular el total a pagar.


> **Modalidad:** Equipos de 3 a 4 integrantes.

---

# Objetivos de aprendizaje

Durante esta práctica deberán aplicar los siguientes conceptos:

- Declaración y uso de variables.
- Métodos.
- Herencia.
- Encapsulamiento.
- Abstracción.
- Polimorfismo (sobrescritura de métodos).
- Interfaces.
- Operadores aritméticos, relacionales y lógicos.
- Métodos built-in de Java.
- Uso de colecciones (`ArrayList` o `HashMap`).

---

# Descripción del problema

Una cafetería desea un pequeño sistema que le permita administrar su menú y generar órdenes de compra.

El programa deberá permitir:

- Registrar nuevos productos.
- Agregar los productos a un menú general.
- Mostrar toda la información del menú.
- Crear una orden.
- Agregar productos del menú a la orden.
- Calcular el total de la compra.

No es necesario utilizar entrada de datos con `Scanner`; pueden crear los objetos directamente desde el método `main`.

---

# Requerimientos del sistema

## 1. Crear la clase base `Producto`

Todos los productos de la cafetería deberán compartir la siguiente información:

- Nombre
- Precio
- Disponible (true o false)

La clase deberá incluir:

- Constructor.
- Getters y Setters.
- Un método llamado:

```java
mostrarInformacion();
```

Este método deberá imprimir toda la información del producto.

---

## 2. Crear dos clases hijas

Crear las siguientes clases:

- `Bebida`
- `Alimento`

Ambas deberán heredar de `Producto`.

### Bebida

Agregar los atributos:

- Tamaño (Small, Medium o Large)
- Fría o caliente

Sobrescribir el método:

```java
mostrarInformacion();
```

para mostrar también esta información.

---

### Alimento

Agregar los atributos:

- Es vegetariano
- Número de calorías

También deberá sobrescribir el método:

```java
mostrarInformacion();
```

---

# 3. Crear una interfaz

Crear una interfaz llamada:

```java
Vendible
```

La interfaz deberá contener el siguiente método:

```java
double calcularPrecioFinal();
```

Las clases `Bebida` y `Alimento` deberán implementar esta interfaz.

Por el momento el método puede regresar simplemente el precio del producto.

Posteriormente pueden agregar lógica adicional.

Ejemplo:

- Las bebidas tamaño Large aumentan $15.
- Los alimentos vegetarianos tienen 10% de descuento.

---

# 4. Crear el menú de la cafetería

Crear una clase llamada:

```java
Menu
```

Esta clase deberá almacenar todos los productos utilizando una colección.

Pueden utilizar cualquiera de las siguientes opciones:

- ArrayList
- HashMap

El menú deberá permitir:

- Agregar productos.
- Mostrar todos los productos.
- Buscar un producto por nombre (opcional).

---

# 5. Crear una orden

Crear una clase llamada:

```java
Orden
```

La orden deberá contener una colección de productos.

La clase deberá permitir:

- Agregar productos.
- Mostrar los productos agregados.
- Calcular el total.
- Mostrar la cantidad de productos.

---

# 6. Crear la clase principal

En el método `main` deberán:

## Crear al menos:

- 3 bebidas.
- 3 alimentos.

Posteriormente deberán:

- Agregarlos al menú.
- Mostrar el menú completo.
- Crear una orden.
- Agregar mínimo cuatro productos.
- Mostrar la orden.
- Calcular el total.

---

# Funcionalidades complementarias (opcionales)

Si terminan antes del tiempo establecido, pueden agregar una o varias de las siguientes funcionalidades.

## ⭐ Nivel 1

Agregar un método para cambiar la disponibilidad de un producto.

Ejemplo:

```text
Producto agotado.
Producto disponible.
```

---

## ⭐ Nivel 2

Impedir que un producto agotado pueda agregarse a la orden.

Mostrar un mensaje indicando:

```text
No es posible agregar este producto porque no está disponible.
```

---

## ⭐ Nivel 3

Mostrar el subtotal, IVA (16%) y total.

Ejemplo:

```text
Subtotal:
IVA:
Total:
```

---

## ⭐ Nivel 4

Agregar una categoría para cada producto.

Ejemplo:

- Café
- Té
- Postre
- Pan
- Sandwich

---

## ⭐ Nivel 5

Implementar un descuento.

Ejemplo:

- Si la compra supera los $300 aplicar un 10%.
- Si contiene más de 5 productos aplicar un descuento fijo.

---

# Restricciones

Durante la práctica:

- No utilizar bases de datos.
- No utilizar archivos.
- No utilizar interfaces gráficas.
- No utilizar Spring Boot.
- Todo el programa deberá ejecutarse desde consola.

---

# Conceptos mínimos que deberán verse reflejados

✅ Variables

✅ Objetos

✅ Clases

✅ Constructores

✅ Encapsulamiento

✅ Herencia

✅ Polimorfismo (sobrescritura)

✅ Interfaces

✅ Métodos

✅ Colecciones

✅ Operadores

✅ Métodos built-in de Java

---

# Estructura sugerida

```
src
│
├── Producto.java
├── Bebida.java
├── Alimento.java
├── Vendible.java
├── Menu.java
├── Orden.java
└── Main.java
```

---

# Entregable

Cada equipo deberá crear un repositorio en **GitHub** con el código fuente de la práctica.

Una vez finalizada la actividad, deberán enviar un correo electrónico al instructor Fernando con la siguiente información:

- Liga del repositorio de GitHub.
- Nombre completo de todos los integrantes del equipo.

> **Importante:** Verifiquen que el repositorio tenga permisos para que el instructor pueda acceder al código.

---

# Criterios de evaluación

| Criterio | Valor |
|----------|------:|
| Uso correcto de clases y objetos | 20% |
| Aplicación de los pilares de POO | 20% |
| Implementación de interfaces | 15% |
| Uso adecuado de colecciones | 15% |
| Organización y legibilidad del código | 15% |
| Funcionamiento del programa | 15% |

---

## Resultado esperado

Al ejecutar el programa, deberá observarse un flujo similar al siguiente:

```text
========== MENÚ ==========
1. Café Americano
2. Capuccino
3. Té Verde
4. Sandwich
5. Muffin
6. Ensalada

==========================

Producto agregado:
Capuccino

Producto agregado:
Sandwich

Producto agregado:
Muffin

========== ORDEN ==========
Capuccino ............. $70.00
Sandwich .............. $95.00
Muffin ................ $45.00

Cantidad de productos: 3

Subtotal: $210.00
IVA: $33.60
Total: $243.60
```

> **Importante: Recuerden aplicar los principios de la Programación Orientada a Objetos para construir un código claro, organizado y reutilizable**
