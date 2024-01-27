# 📐 GeometryUtils

This project, GeometryUtils, provides a library for efficient calculations of areas, perimeters, and volumes of two-dimensional and three-dimensional geometric figures. This comprehensive solution facilitates the development of applications involving the manipulation and analysis of geometric shapes, offering straightforward and accurate methods.

### 🚀 Features

Here all the features of the GeometryUtils library:

| Function                   | Parameter Order                                      | Description                                                      |
|--------------------------|------------------------------------------------------|------------------------------------------------------------------|
| `squareArea()`           | `double side`                                        | Calculates the area of a square with the provided side length.   |
| `rectangleArea()`        | `double base, double height`                        | Calculates the area of a rectangle with the provided base and height. |
| `triangleAreaHeron()`    | `double sideA, double sideB, double sideC`          | Calculates the area of a triangle using Heron's Formula with the provided side lengths. |
| `triangleAreaEquilateral()` | `double side`                                        | Calculates the area of an equilateral triangle with the provided side length. |
| `triangleArea()`         | `double base, double height`                         | Calculates the area of a right-angled triangle with the provided base and height. |
| `circleArea()`           | `double radius`                                      | Calculates the area of a circle with the provided radius.         |
| `trapezeArea()`          | `double base1, double base2, double height`          | Calculates the area of a trapezoid with the provided base lengths and height. |
| `parallelogramArea()`    | `double base, double height`                         | Calculates the area of a parallelogram with the provided base and height. |
| `rhombusArea()`          | `double diagonal1, double diagonal2`                 | Calculates the area of a rhombus with the provided diagonal lengths. |
| `hexagonArea()`          | `double side`                                        | Calculates the area of a regular hexagon with the provided side length. |
| `pentagonArea()`         | `double side`                                        | Calculates the area of a regular pentagon with the provided side length. |
| `heptagonArea()`         | `double side`                                        | Calculates the area of a regular heptagon with the provided side length. |
| `octagonArea()`          | `double side`                                        | Calculates the area of a regular octagon with the provided side length. |
| `squarePerimeter()`      | `double side`                                        | Calculates the perimeter of a square with the provided side length. |
| `rectanglePerimeter()`   | `double side`                                        | Calculates the perimeter of a rectangle with the provided side length. |
| `trianglePerimeter()`    | `double side`                                        | Calculates the perimeter of an equilateral triangle with the provided side length. |
| `circlePerimeter()`      | `double radius`                                      | Calculates the perimeter of a circle with the provided radius.     |
| `trapezePerimeter()`     | `double sideA, double sideB, double sideC, double sideD` | Calculates the perimeter of a trapezoid with the provided side lengths. |
| `parallelogramPerimeter()`| `double sideA, double sideB, double sideC, double sideD` | Calculates the perimeter of a parallelogram with the provided side lengths. |
| `rhombusPerimeter()`     | `double side`                                        | Calculates the perimeter of a rhombus with the provided side length. |
| `hexagonPerimeter()`     | `double side`                                        | Calculates the perimeter of a regular hexagon with the provided side length. |
| `pentagonPerimeter()`    | `double side`                                        | Calculates the perimeter of a regular pentagon with the provided side length. |
| `heptagonPerimeter()`    | `double side`                                        | Calculates the perimeter of a regular heptagon with the provided side length. |
| `octagonPerimeter()`     | `double side`                                        | Calculates the perimeter of a regular octagon with the provided side length. |
| `cubeArea()`             | `double side`                                        | Calculates the surface area of a cube with the provided side length. |
| `parallelepipedArea()`   | `double length, double width, double height`          | Calculates the surface area of a parallelepiped with the provided dimensions. |
| `sphereArea()`           | `double radius`                                      | Calculates the surface area of a sphere with the provided radius.   |
| `triangularPyramidArea()`| `double sideA, double sideB, double sideC, double height` | Calculates the surface area of a triangular pyramid with the provided side lengths and height. |
| `squarePyramidArea()`    | `double side, double height`                         | Calculates the surface area of a square pyramid with the provided side length and height. |
| `pentagonPyramidArea()`  | `double baseSide, double apothem`                    | Calculates the surface area of a pentagonal pyramid with the provided length of the base side and apothem. |
| `hexagonPyramidArea()`   | `double baseSide, double apothem`                    | Calculates the surface area of a hexagonal pyramid with the provided length of the base side and apothem. |
| `cubeVolume()`           | `double side`                                        | Calculates the volume of a cube with the provided side length.      |
| `parallelepipedVolume()` | `double length, double width, double height`          | Calculates the volume of a parallelepiped with the provided dimensions. |
| `sphereVolume()`         | `double radius`                                      | Calculates the volume of a sphere with the provided radius.        |
| `triangularPyramidVolume()` | `double baseTriangular, double heightTriangular, double pyramidHeight` | Calculates the volume of a triangular pyramid with the area of the triangular base, the height of the triangular base, and the height of the pyramid. |
| `squarePyramidVolume()`  | `double baseLength, double baseWidth, double pyramidHeight` | Calculates the volume of a square pyramid with the length of the base, the width of the base, and the height of the pyramid. |
| `pentagonPyramidVolume()`| `double baseSide, double pyramidHeight`               | Calculates the volume of a pentagonal pyramid with the length of the base side and the height of the pyramid. |
| `hexagonPyramidVolume()` | `double baseSide, double pyramidHeight`               | Calculates the volume of a hexagonal pyramid with the length of the base side and the height of the pyramid. |
| `cylinderVolume()`       | `double radius, double height`                       | Calculates the volume of a cylinder with the radius of the base and the height. |
| `coneVolume()`           | `double radius, double height`                       | Calculates the volume of a cone with the radius of the base and the height. |
| `triangularPrismVolume()`| `double baseTriangular, double heightTriangular, double prismHeight` | Calculates the volume of a triangular prism with the area of the triangular base, the height of the triangular base, and the height of the prism. |
| `pentagonPrismVolume()`  | `double baseSide, double prismHeight`                | Calculates the volume of a pentagonal prism with the length of the base side and the height of the prism. |
| `hexagonPrismVolume()`   | `double baseSide, double prismHeight`                | Calculates the volume of a hexagonal prism with the length of the base

