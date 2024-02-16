public class RasterType implements Visitor {
    @Override
    public void visit(ShapesSave shapesSave){
        shapesSave.setCircle(shapesSave.getCircle().replace("\n", " as raster\n"));
        shapesSave.setTriangle(shapesSave.getTriangle().replace("\n", " as raster\n"));
        shapesSave.setRectangle(shapesSave.getRectangle().replace("\n", " as raster\n"));
    }
}
