import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(5.5, 200, 100));
		shapes.add(new Triangle(4,5, 500, 1000));
		shapes.add(new Rectangle(6,8, 400, 720));

		ShapesSave shapesSave1 = new ShapesSave();
		shapesSave1.setCircle(shapesSave1.getString((Circle)shapes.get(0)));
		shapesSave1.setTriangle(shapesSave1.getString((Triangle)shapes.get(1)));
		shapesSave1.setRectangle(shapesSave1.getString((Rectangle)shapes.get(2)));
		VectorType vectorType = new VectorType();
		shapesSave1.accept(vectorType);
		shapesSave1.printShape();

		ShapesSave shapesSave2 = new ShapesSave();
		shapesSave2.setCircle(shapesSave2.getString((Circle)shapes.get(0)));
		shapesSave2.setTriangle(shapesSave2.getString((Triangle)shapes.get(1)));
		shapesSave2.setRectangle(shapesSave2.getString((Rectangle)shapes.get(2)));
		RasterType rasterType = new RasterType();
		shapesSave2.accept(rasterType);
		shapesSave2.printShape();
				
	}
}
