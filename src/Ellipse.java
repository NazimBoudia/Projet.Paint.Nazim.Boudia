//import java.lang.Math ;
import java.awt.*;

class Ellipse extends Figure{

    int gAxis;
    int pAxis;

    public Ellipse(int a , int b ){

        gAxis = a;
        pAxis = b;




    }

    public Ellipse(int px , int py, Color c ){


        super(new Point(px,py),c);

        this.gAxis = 0;
        this.pAxis = 0;


    }


    public double getPerimeter  (){

        double c= 2*Math.PI*Math.sqrt(((pAxis^2)+(gAxis^2))/2);
        return c;



    }

    public  double getSurface (){

        double c= Math.PI*gAxis*pAxis*(1/4);

        return c;

    }

    public  void setBoundingBox(int heigthBB, int widthBB){



        this.gAxis= heigthBB;
        this.pAxis= widthBB;



    }



    public  void draw(Graphics g){




        g.setColor(super.c);
        g.fillOval(super.origin.x,super.origin.y,this.pAxis,this.gAxis);


    }

}
