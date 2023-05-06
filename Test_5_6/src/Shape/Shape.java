package Shape;

public class Shape {
    public void draw(){
        System.out.println("画图形");
    }

    public static void drawShape() {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();

        Shape[] shapes = {rect, cycle, rect, cycle ,flower};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void drawShape1(){
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();

        String[] shape = {"rect" , "cycle","rect" , "cycle", "flower" };

        for (String s: shape) {
            if (s.equals("rect")) {
                rect.draw();
            } else if (s.equals("cycle")) {
                cycle.draw();
            } else if (s.equals("flower")) {
                flower.draw();
            }
        }
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("■");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

class Flower extends  Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }

}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("▲");
    }
}
