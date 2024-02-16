public class VectorType implements Visitor {
    @Override
    public void visit(ShapesSave shapesSave){
        shapesSave.setCircle(shapesSave.getCircle().replace("\n", " as vactor\n"));
        shapesSave.setTriangle(shapesSave.getTriangle().replace("\n", " as vactor\n"));
        shapesSave.setRectangle(shapesSave.getRectangle().replace("\n", " as vactor\n"));
    }
}
