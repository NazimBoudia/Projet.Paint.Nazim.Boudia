import java.awt.*;
class Square extends Rectangle {

    public Square(int side){
        super(side,side);
    }

    public Square(int px , int py, Color c ){

        super(px,py,c);

    }

    public void setLength (int a){
        super.length = a;
        super.width = a;

    }

    public void setWidth (int a){
        super.length = a;
        super.width = a;
    }

    public void setBoundingBox(int heigthBB, int widthBB){

        setLength (heigthBB);
        setWidth (widthBB);

    }


}
