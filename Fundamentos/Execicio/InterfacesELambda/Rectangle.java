package Execicio.InterfacesELambda;

public record Rectangle(double height, double width) implements GeometricForm {
    public double getArea() {
        return height * width;
    }
}
