package geometryutils;
public class GeometryUtils {
    
    // --------------------------------------
    // Methods - Two Dimensional Figures Area
    // --------------------------------------
    
    // Method - Square Area
    public static double squareArea(double side) {
        return side * side;
    }
    
    // Method - Rectangle Area
    public static double rectangleArea(double base, double height){
        return base * height;
    }
    
    // Method - Triangle Area (Heron's Formula)
    public static double triangleAreaHeron (double sideA, double sideB, double sideC) {
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }
    
    // Method - Triangle Area (Equilateral Triangle)
    public static double triangleAreaEquilateral (double side) {
        double area = (Math.sqrt(3)) / 4 * Math.pow(side, 2);
        return area;
    }
    
    // Method - Triangle Area (Right Triangle)
    public static double triangleArea (double base, double height) {
        double area = (base * height) / 2;
        return area;
    }
    
    // Method - Circle Area
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    // Method - Trapeze Area
    public static double trapezeArea(double base1, double base2, double height) {
        double area = ((base1 + base2) * height) / 2;
        return area;
    }
    
    // Method - Parallelogram Area
    public static double parallelogramArea(double base, double height){
        double area = base * height;
        return area;
    }
    
    // Method - Rhombus Area
    public static double rhombusArea(double diagonal1, double diagonal2) {
        double area = (diagonal1 * diagonal2) / 2;
        return area;
    }
    
    // Method - Hexagon Area
    public static double hexagonArea(double side) {
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        return area;
    }
    
    // Method  - Pentagon Area
    public static double pentagonArea (double side) {
        double area = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
        return area;
    }
    
    // Method - Heptagon Area
    public static double heptagonArea (double side) {
        double pi = Math.PI;
        double anguloRad = pi / 7.0;
        double area = (7.0 / 4.0) * Math.pow(side, 2) / Math.tan(anguloRad);
        return area;
    }
    
    // Method - Octagon Area
    public static double octagonArea (double side) {
        double area = 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
        return area;
    }
    
    // -------------------------------------------
    // Methods - Two Dimensional Figures Perimeter
    // -------------------------------------------
    
    // Method - Square Perimeter
    public static double squarePerimeter (double side) {
        return side * 4;
    }
    
    // Method - Rectangle Perimeter
    public static double rectanglePerimeter (double side) {
        return side * 4;
    }
    
    // Method - Triangle Perimeter
    public static double trianglePerimeter (double side) {
        return side * 3;
    }
    
    // Method - Circle Perimeter
    public static double circlePerimeter (double radius) {
        double pi = Math.PI;
        return 2 * pi * radius;
    }
    
    // Method - Trapeze Perimeter
    public static double trapezePerimeter (double sideA, double sideB, double sideC, double sideD) {
        return sideA + sideB + sideC + sideD;
    }
    
    // Method - Parallelogram Perimeter
    public static double parallelogramPerimeter (double sideA, double sideB, double sideC, double sideD) {
        return sideA + sideB + sideC + sideD;
    }
    
    // Method - Rhombus Perimeter
    public static double rhombusPerimeter (double side) {
        return side * 4;
    }
    
    // Method - Hexagon Perimeter
    public static double hexagonPerimeter (double side) {
        return side * 6;
    }
    
    // Method - Pentagon Perimeter
    public static double pentagonPerimeter (double side) {
        return side * 5;
    }
    
    // Method - Heptagon Perimeter
    public static double heptagonPerimeter (double side) {
        return side * 7;
    }
    
    // Method - Octagon Perimeter
    public static double octagonPerimeter (double side) {
        return side * 8;
    }
    
    // -------------------------------------------
    // Methods - Three Dimensional Figures Area
    // -------------------------------------------
    
    // Method - Cube Surface Area
    public static double cubeArea(double side) {
        double area = 6 * Math.pow(side, 2);
        return area;
    }
    
    // Method - Parallelepiped Surface Area
    public static double parallelepipedArea(double length, double width, double height) {
        double area = 2 * (length * width + width * height + height * length);
        return area;
    }
    
    // Method - Sphere Surface Area
    public static double sphereArea (double radius) {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    // Method - Triangular Pyramid Surface Area
    public static double triangularPyramidArea(double sideA, double sideB, double sideC, double height) {
        double semiperimeter = (sideA + sideB + sideC) / 2;
        double areaBase = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
        double areaSide = 0.5 * (sideA + sideB + sideC) * height;
        return areaBase + areaSide;
    }
    
    // Method - Square Pyramid Surface Area
    public static double squarePyramidArea (double side, double height) {
        double area = Math.pow(side, 2) + 4 * 0.5 * side * height;
        return area;
    }
    
    // Method - Pentagon Pyramid Surface Area
    public static double pentagonPyramidArea (double sideBase, double apothem) {
        double areaBase = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideBase, 2);
        double basePerimeter = 5 * sideBase;
        return areaBase + 0.5 * basePerimeter * apothem;
    }
    
    // Method - Hexagon Pyramid Surface Area
    public static double hexagonPyramidArea (double sideBase, double apothem) {
        double areaBase = (3 * Math.sqrt(3) / 2) * Math.pow(sideBase, 2);
        double basePerimeter = 6 * sideBase;
        return areaBase + 0.5 * basePerimeter * apothem;
    }
    
    // Method - Cylinder Surface Area
    public static double cylinderArea (double radius, double height) {
        double pi = Math.PI;
        double baseArea = 2 * pi * Math.pow(radius, 2);
        double sideArea = 2 * pi * radius * height;
        return baseArea + sideArea;
    }
    
    // Method - Cone Surface Area
    public static double coneArea (double radius, double sideHeight) {
        double pi = Math.PI;
        double baseArea = pi * Math.pow(radius, 2);
        double sideArea = pi * radius * sideHeight;
        return baseArea + sideArea;
    }
    
    // Method - Triangular Prism Surface Area
    public static double triangularPrismArea (double sideA, double sideB, double prismHeight) {
        double areaBase = 0.5 * sideA * sideB;
        double basePerimeter = sideA + sideB + Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        double sideArea = basePerimeter * prismHeight;
        return areaBase + 2 * sideArea;
    }
    
    // Method - Pentagon Prism Surface Area
    public static double pentagonPrismArea (double pentagonSide, double prismHeight) {
        double areaBase = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(pentagonSide, 2);
        double basePerimeter = 5 * pentagonSide;
        double sideArea = basePerimeter * prismHeight;
        return areaBase + 5 * sideArea;
    }
    
    // Method - Hexagon Prism Surface Area
    public static double hexagonPrismArea (double hexagonSide, double prismHeight) {
        double areaBase = (3 * Math.sqrt(3) / 2) * Math.pow(hexagonSide, 2);
        double basePerimeter = 6 * hexagonSide;
        double sideArea = basePerimeter * prismHeight;
        return areaBase + 6 * sideArea;
    }
    
    // -------------------------------------------
    // Methods - Three Dimensional Figures Volume
    // -------------------------------------------
    
    // Method - Cube Volume
    public static double cubeVolume (double sideCube) {
        return Math.pow(sideCube, 3);
    }
    
    // Method - Parallelepiped Volume
    public static double parallelepipedVolume (double length, double width, double height) {
        return length * width * height;
    }
    
    // Method - Sphere Volume
    public static double sphereVolume (double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    // Method - Triangular Pyramid Volume
    public static double triangularPyramidVolume (double triangleBase, double triangleHeight, double pyramidHeight) {
        double baseArea = 0.5 * triangleBase * triangleHeight;
        return (1.0 / 3.0) * baseArea * pyramidHeight;
    }
    
    // Method - Pyramid Volume
    public static double squarePyramidVolume (double baseLength, double baseWidth, double pyramidHeight) {
        double areaBase = baseLength * baseWidth;
        return (1.0 / 3.0) * areaBase * pyramidHeight;
    }
    
    // Method - Pentagon Pyramid Volume
    public static double pentagonPyramidVolume (double pentagonSide, double pyramidHeight) {
        double baseArea = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(pentagonSide, 2);
        return (1.0 / 3.0) * baseArea * pyramidHeight;
    }
    
    // Method - Hexagon Pyramid Volume
    public static double hexagonPyramidVolume (double hexagonSide, double pyramidHeight) {
        double areaBase = (3 * Math.sqrt(3) / 2) * Math.pow(hexagonSide, 2);
        return (1.0 / 3.0) * areaBase * pyramidHeight;
    }
    
    // Method - Cylinder Volume
    public static double cylinderVolume (double radius, double cylinderHeight) {
        double pi = Math.PI;
        return pi * Math.pow(radius, 2) * cylinderHeight;
    }
    
    // Method - Cone Volume
    public static double coneVolume(double radius, double coneHeight) {
        double pi = Math.PI;
        return (1.0 / 3.0) * pi * Math.pow(radius, 2) * coneHeight;
    }
    
    // Method - Triangular Prism Volume
    public static double triangularPrismVolume (double triangleBase, double triangleHeight, double prismHeight) {
        double baseArea = 0.5 * triangleBase * triangleHeight;
        return baseArea * prismHeight;
    }
    
    // Method - Pentagon Prism Volume
    public static double pentagonPrismVolume (double pentagonSide, double prismHeight) {
        double baseArea = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(pentagonSide, 2);
        return baseArea * prismHeight;
    }
    
    // Method - Hexagon Prism Volume
    public static double hexagonPrismVolume (double hexagonSide, double prismHeight) {
        double baseArea = (3 * Math.sqrt(3) / 2) * Math.pow(hexagonSide, 2);
        return baseArea * prismHeight;
    }
}
