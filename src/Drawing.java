import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class Drawing extends JPanel implements MouseListener, MouseMotionListener{
    private ArrayList<Figure> liste;
    private Color c;
    private String nameFigure;
    private int position_x;
    private int position_y;
    MouseEvent e;
    public Drawing(){

        super();

        this.liste=new ArrayList<Figure>();
//	this.mouseMoved();
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paintComponent(Graphics g){


        super.paintComponent(g);

        for (Figure f : liste){


            f.draw(g);

        }


    }

    public void setColor (Color m){

        this.c= m;
    }


    public  void nameFig(String o){

        this.nameFigure = o;

    }

    public String getName(){

        return nameFigure;

    }


    public Color getColor(){

        return c;

    }

    public ArrayList<Figure> getList (){

        return this.liste;


    }
    public void mouseClicked(MouseEvent e ){


        System.out.println("I clicked on ;  " );
        // String cmd = e.getClickCount();




    }
    public void mouseExited(MouseEvent e ){


        //System.out.println("You clicked on: " );

    }

    public void mouseEntered(MouseEvent e ){


        //System.out.println("You clicked on: " );

    }
    public void mousePressed(MouseEvent e ){


        position_x = e.getX();
        position_y = e.getY();


        System.out.println("The position of x is : "+position_x+"  The new position of y is : "+position_y );


        if (nameFigure.equals("Rectangle")){liste.add(new Rectangle(position_x,position_y,c));}
        if (nameFigure.equals("Square")){liste.add(new Square(position_x,position_y,c));}
        if (nameFigure.equals("Circle")){liste.add(new Circle(position_x,position_y,c));}
        if (nameFigure.equals("Ellipse")){liste.add(new Ellipse(position_x,position_y,c));}









//	repaint();



    }

    public void mouseReleased(MouseEvent e ){

        int b =Math.abs(e.getX()-position_x);
        int a =Math.abs(e.getY()-position_y);
        System.out.println("The new origin is :"+e.getX()+" and "+e.getY());

        int size =this.liste.size();




        Figure bob = liste.get(size-1);



        if( e.getX()<position_x){
            System.out.println("The position of x "+this.position_x+" is lower to before and"+e.getX());
            bob.origin.setX(e.getX());
            System.out.println("The new position of x is "+position_x);

        }


        if( e.getY()<position_y){
            System.out.println("The position of x "+this.position_y+"  is lower to before and"+e.getY());
            bob.origin.setY(e.getY());
            System.out.println("The new position of x is "+position_y);

        }




        bob.setBoundingBox(a,b);


//


        repaint();



    }

    public void mouseMoved( MouseEvent e){


    }

    public void mouseDragged(MouseEvent e ){


        int b =Math.abs(e.getX()-position_x);
        int a =Math.abs(e.getY()-position_y);
        System.out.println("The new origin is :"+e.getX()+" and "+e.getY());

        int size =this.liste.size();




        Figure bob = liste.get(size-1);



        if( e.getX()<position_x){
            System.out.println("The position of x "+this.position_x+"  is lower to before and"+e.getX());
            bob.origin.setX(e.getX());
            System.out.println("The new position of x "+position_x);

        }


        if( e.getY()<position_y){
            System.out.println("The position of x "+this.position_y+"  is lower to before and"+e.getY());
            bob.origin.setY(e.getY());
            System.out.println("The new position of x is "+position_y);

        }




        bob.setBoundingBox(a,b);


//


        repaint();


    }



}
