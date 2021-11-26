import java.awt.*;
class Rectangle extends Figure {
    protected int length ;
    protected int width ;
    public Rectangle (){






    }

    public  Rectangle (int a, int b){

        super();
        this.length = a;
        this.width = b;


    }


    public Rectangle(int px , int py, Color c ){


        super(new Point(px,py),c);

        this.length = 0;
        this.width = 0;

    }

    public int getLength (){

        int b = this.length;
        return b ;
    }

    public  int getWidth (){

        int b = this.width;
        return b;


    }

    public double getPerimeter  (){
        double a = (this.length + this.width)*2;
        return a;



    }

    public  double getSurface (){
        double a = this.length* this.width;
        return a;

    }

    public void setLength (int a){
        this.length = a;



    }

    public void setWidth (int a){

        this.width = a;


    }








    public String toString(){

        String s ="+";

        for(int i=0;i<this.length;i++){

            s+="--";

        }

        s+="+\n" ;

        for(int i=0;i<this.width;i++){

            s+="|";

            for(int j=0;j<this.length;j++){

                s+="  ";

            }
            s+="| \n";
        }
        s+="+";

        for(int j=0;j<this.length;j++){

            s+="--";

        }

        s+="+";



        return s;
    }


    public  void setBoundingBox(int heigthBB, int widthBB){


        this.length= heigthBB;
        this.width= widthBB;

    }





    public  void draw(Graphics g){


        g.setColor(c);
        g.fillRect(super.origin.x,super.origin.y,this.width,this.length);

    }





}
