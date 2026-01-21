package Methods;

class area {

    static void areaCircle() {
        int r = 7;
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    static void areaTriangle() {
        int b = 10;
        int h = 5;
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle = " + area);
    }

    static void areaSquare() {
        int side = 6;
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public static void main(String[] args) {
        areaCircle();
        areaTriangle();
        areaSquare();
    }
}

