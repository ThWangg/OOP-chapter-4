public class Square extends Rectangle{
    public Square(){
    }


    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void getWidth(double side){
        super.setWidth(side);
    }

    public void getLength(double side){
        super.setLength(side);
    }

    public String toString() {
        return "Square[" + super.toString() + ", width=" + super.getWidth() + ",leight=" + super.getLength() + "]";
    }
}