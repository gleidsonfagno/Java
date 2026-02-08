package Execicio.InterfacesELambda;

public record Squere(double side) implements GeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }
}
