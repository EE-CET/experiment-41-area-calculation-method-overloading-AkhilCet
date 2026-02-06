[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/SXDc0CCl)
# Experiment 41: Area Calculation (Method Overloading)

## Problem Statement

Write a Java program to calculate the area of different shapes using **Method Overloading**. Create a class `AreaCalculator` with three overloaded methods named `calculateArea`:
1. `calculateArea(float radius)`: Calculates area of a circle ($\pi r^2$).
2. `calculateArea(float length, float breadth)`: Calculates area of a rectangle ($l \times b$).
3. `calculateArea(double base, double height)`: Calculates area of a triangle ($0.5 \times b \times h$).

## Input Format

* First line: Radius of circle (float).
* Second line: Length and Breadth of rectangle (float, space-separated).
* Third line: Base and Height of triangle (double, space-separated).

## Output Format

* Area of Circle (printed to 2 decimal places).
* Area of Rectangle (printed to 2 decimal places).
* Area of Triangle (printed to 2 decimal places).

### Example 1

**Input:**

```text
5
4 5
3 6
```

**Output:**

```text
78.54
20.00
9.00
```
