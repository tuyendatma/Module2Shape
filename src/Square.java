public class Square extends Rectangle {
    public Square(){

    }
    public Square(double size){
        super(size,size);
    }
    public Square(double size,String color, boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return getWidth();
    }
    public void setSize(double size){
        super.setWidth(size);
        super.setLength(size);
    }

//    @Override
//    public void setWidth(double width){
//        super.setWidth(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        super.setLength(length);
//    }
}
