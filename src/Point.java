public class Point {
    int x = 0;
    int y = 0;


    public Point (int x1,int y1){

        this.x = x1;
        this.y = y1;

    }

    public Point (){

        this.x = 0;
        this.y = 0;

    }

    public int getX (){

        int a = this.x ;
        return a;
    }

    public int getY (){

        int a = this.y ;
        return a;

    }
    public  void setX(int a){this.x=a;}
    public void setY(int b){this.y=b;}

}
