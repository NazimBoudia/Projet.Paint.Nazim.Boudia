import java.awt.*;
class Circle extends Ellipse {

    public Circle (int a){
        super(a,a);

    }

    public Circle(int px , int py, Color c ){


        super(px,py,c);



    }

    public void setBoundingBox(int heigthBB, int widthBB){
        super.gAxis =super.pAxis = heigthBB;

    }


}
