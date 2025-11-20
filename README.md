# Práctica de Programación Orientada a Objetos (POO): Sistema de Gestión de Empleados

Este proyecto Java implementa un sistema jerárquico para la gestión de datos y el cálculo salarial de diferentes tipos de empleados. Fue desarrollado como una **práctica académica** para la materia de Programación Orientada a Objetos. El objetivo principal es la aplicación y demostración de los cuatro pilares de POO: **Abstracción, Herencia, Polimorfismo y Encapsulación**.

## Objetivos de Diseño

* Abstracción: Definición de un contrato de comportamiento (Beneficiable) y una clase base común (Empleado).
* Herencia: Reutilización de atributos base (nombre, id, salarioBase) en las clases derivadas.
* Polimorfismo: Implementación específica del método calcularSalario(), calcularBonificacion() y aplicarDescuentoSeguro() en cada tipo de empleado.

## Estructura de Clases

El proyecto consta de una interfaz, una clase abstracta y dos clases concretas:

| Componente | Tipo | Responsabilidad Principal |
| :--- | :--- | :--- |
| Beneficiable | Interfaz | Define el contrato para métodos relacionados con beneficios y seguros. |
| Empleado | Clase Abstracta | Clase padre. Define atributos protegidos comunes y el método abstracto calcularSalario(). |
| EmpleadoTiempoCompleto | Concreta | Extiende Empleado e implementa Beneficiable. Posee lógica de bonificación basada en antigüedad. |
| EmpleadoFreelance | Concreta | Extiende Empleado e implementa Beneficiable. Posee lógica de salario basada en horas y tarifa. |

## Reglas de Negocio Implementadas

### Clase: EmpleadoTiempoCompleto
| Método | Lógica de Implementación |
| :--- | :--- |
| calcularBonificacion() | salarioBase * 0.10 * antiguedad |
| calcularSalario() | salarioBase + Bonificación calculada |
| aplicarDescuentoSeguro() | 5% del Salario Total (salarioBase + Bonificación) |

### Clase: EmpleadoFreelance
| Método | Lógica de Implementación |
| :--- | :--- |
| calcularSalario() | (horasTrabajadas * tarifaHora) + Bonificación calculada |
| calcularBonificacion() | 5% del salario base (horas * tarifa) si horasTrabajadas > 160, de lo contrario, 0. |
| aplicarDescuentoSeguro() | 3% del Salario Total |

## Cómo Ejecutar

1. Asegúrese de tener un entorno Java (JDK) configurado.
2. Compile todas las clases (Beneficiable.java, Empleado.java, EmpleadoTiempoCompleto.java, EmpleadoFreelance.java).
3. Cree una clase principal (Main) para instanciar las clases concretas y probar el polimorfismo (ejecutando calcularSalario() en diferentes tipos de objetos).