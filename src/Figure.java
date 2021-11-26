import java.awt.*;


public  abstract class Figure {
    protected   Point origin ;
    protected  Color c;
    public  Figure(Point a){

        this.origin = a;


    }
    public  Figure(){

        this.origin = new Point(0,0);


    }

    public  Figure(Point p , Color co){

        this.origin =p;
        this.c=co;

    }


    public String toString(){


        String a ="xaxis :"+origin.getX() ;
        a+= "\nyaxis :" +origin.getY();

        return a;





    }

    public abstract double getPerimeter();
    public abstract double getSurface();
    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void draw(Graphics g);





}
