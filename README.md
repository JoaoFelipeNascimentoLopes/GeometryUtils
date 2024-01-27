# 📐 GeometryUtils

This project, GeometryUtils, provides a library for efficient calculations of areas, perimeters, and volumes of two-dimensional and three-dimensional geometric figures. This comprehensive solution facilitates the development of applications involving the manipulation and analysis of geometric shapes, offering straightforward and accurate methods.

## 🚀 Features

Here all the features of the GeometryUtils library:

| Function                   | Parameter Order                                      | Description                                                      |
|--------------------------|------------------------------------------------------|------------------------------------------------------------------|
| `squareArea()`           | <span style="color:blue">`double`</span> side                                        | Calculates the area of a square with the provided side length.   |
| `rectangleArea()`        | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                        | Calculates the area of a rectangle with the provided base and height. |
| `triangleAreaHeron()`    | <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC          | Calculates the area of a triangle using Heron's Formula with the provided side lengths. |
| `triangleAreaEquilateral()` | <span style="color:blue">`double`</span> side                                        | Calculates the area of an equilateral triangle with the provided side length. |
| `triangleArea()`         | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                         | Calculates the area of a right-angled triangle with the provided base and height. |
| `circleArea()`           | <span style="color:blue">`double`</span> radius                                      | Calculates the area of a circle with the provided radius.         |
| `trapezeArea()`          | <span style="color:blue">`double`</span> base1, <span style="color:blue">`double`</span> base2, <span style="color:blue">`double`</span> height          | Calculates the area of a trapezoid with the provided base lengths and height. |
| `parallelogramArea()`    | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                         | Calculates the area of a parallelogram with the provided base and height. |
| `rhombusArea()`          | <span style="color:blue">`double`</span> diagonal1, <span style="color:blue">`double`</span> diagonal2                 | Calculates the area of a rhombus with the provided diagonal lengths. |
| `hexagonArea()`          | <span style="color:blue">`double`</span> side                                        | Calculates the area of a regular hexagon with the provided side length. |
| `pentagonArea()`         | <span style="color:blue">`double`</span> side                                        | Calculates the area of a regular pentagon with the provided side length. |
| `heptagonArea()`         | <span style="color:blue">`double`</span> side                                        | Calculates the area of a regular heptagon with the provided side length. |
| `octagonArea()`          | <span style="color:blue">`double`</span> side                                        | Calculates the area of a regular octagon with the provided side length. |
| `squarePerimeter()`      | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a square with the provided side length. |
| `rectanglePerimeter()`   | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a rectangle with the provided side length. |
| `trianglePerimeter()`    | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of an equilateral triangle with the provided side length. |
| `circlePerimeter()`      | <span style="color:blue">`double`</span> radius                                      | Calculates the perimeter of a circle with the provided radius.     |
| `trapezePerimeter()`     | <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> sideD | Calculates the perimeter of a trapezoid with the provided side lengths. |
| `parallelogramPerimeter()`| <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> sideD | Calculates the perimeter of a parallelogram with the provided side lengths. |
| `rhombusPerimeter()`     | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a rhombus with the provided side length. |
| `hexagonPerimeter()`     | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a regular hexagon with the provided side length. |
| `pentagonPerimeter()`    | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a regular pentagon with the provided side length. |
| `heptagonPerimeter()`    | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a regular heptagon with the provided side length. |
| `octagonPerimeter()`     | <span style="color:blue">`double`</span> side                                        | Calculates the perimeter of a regular octagon with the provided side length. |
| `cubeArea()`             | <span style="color:blue">`double`</span> side                                        | Calculates the surface area of a cube with the provided side length. |
| `parallelepipedArea()`   | <span style="color:blue">`double`</span> length, <span style="color:blue">`double`</span> width, <span style="color:blue">`double`</span> height | Calculates the surface area of a parallelepiped with the provided dimensions. |
| `sphereArea()`           | <span style="color:blue">`double`</span> radius                                      | Calculates the surface area of a sphere with the provided radius.   |
| `triangularPyramidArea()`| <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> height | Calculates the surface area of a triangular pyramid with the provided side lengths and height. |
| `squarePyramidArea()`    | <span style="color:blue">`double`</span> side, <span style="color:blue">`double`</span> height                         | Calculates the surface area of a square pyramid with the provided side length and height. |
| `pentagonPyramidArea()`  | <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> apothem                   | Calculates the surface area of a pentagonal pyramid with the provided length of the base side and apothem. |
| `hexagonPyramidArea()`   | <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> apothem                   | Calculates the surface area of a hexagonal pyramid with the provided length of the base side and apothem. |
| `cubeVolume()`           | <span style="color:blue">`double`</span> side                                        | Calculates the volume of a cube with the provided side length.      |
| `parallelepipedVolume()` | <span style="color:blue">`double`</span> length, <span style="color:blue">`double`</span> width, <span style="color:blue">`double`</span> height | Calculates the volume of a parallelepiped with the provided dimensions. |
| `sphereVolume()`         | <span style="color:blue">`double`</span> radius                                      | Calculates the volume of a sphere with the provided radius.        |
| `triangularPyramidVolume()` | <span style="color:blue">`double`</span> baseTriangular, <span style="color:blue">`double`</span> heightTriangular, <span style="color:blue">`double`</span> pyramidHeight | Calculates the volume of a triangular pyramid with the area of the triangular base, the height of the triangular base, and the height of the pyramid. |
| `squarePyramidVolume()`  | <span style="color:blue">`double`</span> baseLength, <span style="color:blue">`double`</span> baseWidth, <span style="color:blue">`double`</span> pyramidHeight | Calculates the volume of a square pyramid with the length of the base, the width of the base, and the height of the pyramid. |
| `pentagonPyramidVolume()`| <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> pyramidHeight             | Calculates the volume of a pentagonal pyramid with the length of the base side and the height of the pyramid. |
| `hexagonPyramidVolume()` | <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> pyramidHeight             | Calculates the volume of a hexagonal pyramid with the length of the base side and the height of the pyramid. |
| `cylinderVolume()`       | <span style="color:blue">`double`</span> radius, <span style="color:blue">`double`</span> height                   | Calculates the volume of a cylinder with the radius of the base and the height. |
| `coneVolume()`           | <span style="color:blue">`double`</span> radius, <span style="color:blue">`double`</span> height                   | Calculates the volume of a cone with the radius of the base and the height. |
| `triangularPrismVolume()`| <span style="color:blue">`double`</span> baseTriangular, <span style="color:blue">`double`</span> heightTriangular, <span style="color:blue">`double`</span> prismHeight | Calculates the volume of a triangular prism with the area of the triangular base, the height of the triangular base, and the height of the prism. |
| `pentagonPrismVolume()`  | <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> prismHeight            | Calculates the volume of a pentagonal prism with the length of the base side and the height of the prism. |
| `hexagonPrismVolume()`   | <span style="color:blue">`double`</span> baseSide, <span style="color:blue">`double`</span> prismHeight            | Calculates the volume of a hexagonal prism with the length of the base side and the height of the prism. |

⚠️ Remember, during the development of your software, to follow the parameter order specified by the library to ensure proper functionality.

## 🔧 How to Use

The GeometryUtils library is available for the Java language.                                  ![java](https://cdn.icon-icons.com/icons2/2415/PNG/64/java_original_wordmark_logo_icon_146459.png) 

To use the GeometryUtils library in your Java projects, follow these steps:

1. Download the latest JAR file.
2. Add the library to your project following the instructions for your IDE.
3. Import the 'GeometryUtils' class into your code:
   ~~~~java
   import geometryutils.GeometryUtils;
   ~~~~
4. Use the provided methods to calculate areas, perimeters and volumes.
