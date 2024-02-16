public class ShapesSave implements Element {

    private String circle;
	private String triangle; 
	private String rectangle;

    public ShapesSave (){
        this.circle = "";
        this.triangle = "";
        this.rectangle = "";
    }

    public void setCircle(String circle){
        this.circle = circle;
    }

    public String getCircle(){
        return circle;
    }

    public void setTriangle(String triangle){
        this.triangle = triangle;
    }

    public String getTriangle(){
        return triangle;
    }

    public void setRectangle(String rectangle){
        this.rectangle = rectangle;
    }

    public String getRectangle(){
        return rectangle;
    }

    public void printShape(){
        System.out.print(circle+triangle+rectangle);
    }

    public String getString(Circle circle){
        return "Saving the circle... with radius= "+circle.getRadius()
            +" at position "+circle.getxPos()+", "+circle.getyPos()+"\n";
    }

    public String getString(Triangle triangle){
        return "Saving the triangle...with base = "+triangle.getBase()
            +" height = "+triangle.getHeight()+" at position "+triangle.getxPos()+", "+
            triangle.getyPos()+"\n";
    }

    public String getString(Rectangle rectangle){
        return "Saving the rectangle...with width = "+rectangle.getWidth()+
            " height = "+rectangle.getHeight()+" at position "+rectangle.getxPos()+", "
            +rectangle.getyPos()+"\n";
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
