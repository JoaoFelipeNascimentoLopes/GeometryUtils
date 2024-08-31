# 📐 GeometryUtils - Biblioteca Para Cálculos Geométricos

Este projeto, GeometryUtils, fornece uma biblioteca para cálculos de áreas, perímetros e volumes de figuras geométricas bidimensionais e tridimensionais. Esta solução abrangente facilita o desenvolvimento de aplicações que envolvem a manipulação e análise de formas geométricas, oferecendo métodos simples e de fácil utilização.

⚠️ Os resultados retornados pela biblioteca são valores aproximados.

## 🚀 Features

Aqui estão os recursos da biblioteca GeometryUtils: 

| Função                   | Ordem dos Parâmetros                                | Descrição                                                      |
|--------------------------|------------------------------------------------------|------------------------------------------------------------------|
| `squareArea()`           | <span style="color:blue">`double`</span> side                                       | Calcula a área de um quadrado com o comprimento do lado fornecido.   |
| `rectangleArea()`        | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                      | Calcula a área de um retângulo com a base e altura fornecidas. |
| `triangleAreaHeron()`    | <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC          | Calcula a área de um triângulo usando a Fórmula de Heron com os comprimentos dos lados fornecidos. |
| `triangleAreaEquilateral()` | <span style="color:blue">`double`</span> side                                       | Calcula a área de um triângulo equilátero com o comprimento do lado fornecido. |
| `triangleArea()`         | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                       | Calcula a área de um triângulo retângulo com a base e altura fornecidas. |
| `circleArea()`           | <span style="color:blue">`double`</span> radius                                      | Calcula a área de um círculo com o raio fornecido.         |
| `trapezeArea()`          | <span style="color:blue">`double`</span> base1, <span style="color:blue">`double`</span> base2, <span style="color:blue">`double`</span> height         | Calcula a área de um trapézio com os comprimentos das bases e altura fornecidos. |
| `parallelogramArea()`    | <span style="color:blue">`double`</span> base, <span style="color:blue">`double`</span> height                      | Calcula a área de um paralelogramo com a base e altura fornecidas. |
| `rhombusArea()`          | <span style="color:blue">`double`</span> diagonal1, <span style="color:blue">`double`</span> diagonal2              | Calcula a área de um losango com os comprimentos das diagonais fornecidos. |
| `hexagonArea()`          | <span style="color:blue">`double`</span> side                                       | Calcula a área de um hexágono regular com o comprimento do lado fornecido. |
| `pentagonArea()`         | <span style="color:blue">`double`</span> side                                       | Calcula a área de um pentágono regular com o comprimento do lado fornecido. |
| `heptagonArea()`         | <span style="color:blue">`double`</span> side                                       | Calcula a área de um heptágono regular com o comprimento do lado fornecido. |
| `octagonArea()`          | <span style="color:blue">`double`</span> side                                       | Calcula a área de um octógono regular com o comprimento do lado fornecido. |
| `squarePerimeter()`      | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um quadrado com o comprimento do lado fornecido. |
| `rectanglePerimeter()`   | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um retângulo com o comprimento do lado fornecido. |
| `trianglePerimeter()`    | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um triângulo equilátero com o comprimento do lado fornecido. |
| `circlePerimeter()`      | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um círculo com o raio fornecido.     |
| `trapezePerimeter()`     | <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> sideD | Calcula o perímetro de um trapézio com os comprimentos dos lados fornecidos. |
| `parallelogramPerimeter()`| <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> sideD | Calcula o perímetro de um paralelogramo com os comprimentos dos lados fornecidos. |
| `rhombusPerimeter()`     | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um losango com o comprimento do lado fornecido. |
| `hexagonPerimeter()`     | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um hexágono regular com o comprimento do lado fornecido. |
| `pentagonPerimeter()`    | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um pentágono regular com o comprimento do lado fornecido. |
| `heptagonPerimeter()`    | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um heptágono regular com o comprimento do lado fornecido. |
| `octagonPerimeter()`     | <span style="color:blue">`double`</span> side                                       | Calcula o perímetro de um octógono regular com o comprimento do lado fornecido. |
| `cubeArea()`             | <span style="color:blue">`double`</span> side                                       | Calcula a área superficial de um cubo com o comprimento do lado fornecido. |
| `parallelepipedArea()`   | <span style="color:blue">`double`</span> length, <span style="color:blue">`double`</span> width, <span style="color:blue">`double`</span> height | Calcula a área superficial de um paralelepípedo com as dimensões fornecidas. |
| `sphereArea()`           | <span style="color:blue">`double`</span> radius                                       | Calcula a área superficial de uma esfera com o raio fornecido.   |
| `triangularPyramidArea()`| <span style="color:blue">`double`</span> sideA, <span style="color:blue">`double`</span> sideB, <span style="color:blue">`double`</span> sideC, <span style="color:blue">`double`</span> height | Calcula a área superficial de uma pirâmide triangular com os comprimentos dos lados e altura fornecidos. |
| `squarePyramidArea()`    | <span style="color:blue">`double`</span> side, <span style="color:blue">`double`</span> height                      | Calcula a área superficial de uma pirâmide quadrada com o comprimento do lado e altura fornecidos. |
| `pentagonPyramidArea()`  | <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> apothem                 | Calcula a área superficial de uma pirâmide pentagonal com o comprimento da base lateral e apótema fornecidos. |
| `hexagonPyramidArea()`   | <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> apothem                 | Calcula a área superficial de uma pirâmide hexagonal com o comprimento da base lateral e apótema fornecidos. |
| `cubeVolume()`           | <span style="color:blue">`double`</span> side                                       | Calcula o volume de um cubo com o comprimento do lado fornecido.      |
| `parallelepipedVolume()` | <span style="color:blue">`double`</span> length, <span style="color:blue">`double`</span> width, <span style="color:blue">`double`</span> hight | Calcula o volume de um paralelepípedo com as dimensões fornecidas. |
| `sphereVolume()`         | <span style="color:blue">`double`</span> radius                                       | Calcula o volume de uma esfera com o raio fornecido.        |
| `triangularPyramidVolume()` | <span style="color:blue">`double`</span> triangleBase, <span style="color:blue">`double`</span> triangleHeight, <span style="color:blue">`double`</span> pyramidHeight | Calcula o volume de uma pirâmide triangular com a área da base triangular, a altura da base triangular e a altura da pirâmide. |
| `squarePyramidVolume()`  | <span style="color:blue">`double`</span> lengthBase, <span style="color:blue">`double`</span> widthBase, <span style="color:blue">`double`</span> pyramidHeight | Calcula o volume de uma pirâmide quadrada com o comprimento da base, a largura da base e a altura da pirâmide. |
| `pentagonPyramidVolume()`| <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> pyramidHeight           | Calcula o volume de uma pirâmide pentagonal com o comprimento do lado da base e a altura da pirâmide. |
| `hexagonPyramidVolume()` | <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> pyramidHeight            | Calcula o volume de uma pirâmide hexagonal com o comprimento do lado da base e a altura da pirâmide. |
| `cylinderVolume()`       | <span style="color:blue">`double`</span> radius, <span style="color:blue">`double`</span> height                  | Calcula o volume de um cilindro com o raio da base e a altura. |
| `coneVolume()`           | <span style="color:blue">`double`</span> radius, <span style="color:blue">`double`</span> height                  | Calcula o volume de um cone com o raio da base e a altura. |
| `triangularPrismVolume()`| <span style="color:blue">`double`</span> triangleBase, <span style="color:blue">`double`</span>triangleHeight, <span style="color:blue">`double`</span> prismHeight | Calcula o volume de um prisma triangular com a área da base triangular, a altura da base triangular e a altura do prisma. |
| `pentagonPrismVolume()`  | <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> prismHeight           | Calcula o volume de um prisma pentagonal com o comprimento do lado da base e a altura do prisma. |
| `hexagonPrismVolume()`   | <span style="color:blue">`double`</span> sideBase, <span style="color:blue">`double`</span> prismHeight           | Calcula o volume de um prisma hexagonal com o comprimento do lado da base e a altura do prisma. |

⚠️ Lembre-se, durante o desenvolvimento do seu software, de seguir a ordem dos parâmetros especificada pela biblioteca para garantir o funcionamento adequado.

## 🔧 Como Usar

A biblioteca GeometryUtils está disponível para a linguagem ![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) .


Para usar a biblioteca GeometryUtils em seus projetos Java, siga estas etapas:

1. Faça o download do arquivo GeometryUtils.JAR
2. Adicione a biblioteca ao seu projeto seguindo as instruções do seu IDE.
3. Importe a classe 'GeometryUtils' no seu código:

   ~~~~java
   import geometryutils.GeometryUtils;
   ~~~~
5. Utilize os métodos fornecidos para calcular áreas, perímetros e volumes.

## </> Tecnologias Utilizadas

![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## 💻 Autor

👤 Desenvolvido por: João Felipe  
📅 Ano de Desenvolvimento: 2024
