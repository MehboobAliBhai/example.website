package mysecondproject;

abstract class Shape {
    int cornerOfShape;

    abstract void firstShape();

    public abstract String secondShape();

    public Shape(int cornerOfShape) {
        this.cornerOfShape = cornerOfShape;
    }
}

class RectangleShape extends Shape {

    public RectangleShape(int cornerOfShape) {
        super(cornerOfShape);
    }

    public void firstShape(){
        System.out.printf("My first shape");
    }

    public String secondShape(){
        return " ";
    }

}
class RunClass{
    public static void main(String[] args) {
        RectangleShape rs = new RectangleShape(89);

    }


}