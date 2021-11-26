import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{
    private Drawing drawing;
    public Window (String title, int  length,int width){
        super (title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE	);
        setLocation(0,200);
        setSize(length ,width);


        Container contentPane = getContentPane();
//Menus

//Menu1

        String tab [] = {"New","Open","Save","Quit"};
        JMenuBar m= new JMenuBar();
        JMenuItem item [] = new JMenuItem[4];
        JMenu menu1 =new JMenu("File");

        for(int i=0;i<4;i++){
            item[i]= new JMenuItem(tab[i]) ;
            if (i==3) menu1.addSeparator();
            item[i].addActionListener(this);
            menu1.add(item[i]);
        }
        item[2].setAccelerator(KeyStroke.getKeyStroke('S',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
        m.add(menu1);

// Menu2

        JMenu menu2 = new JMenu("About Me");



        JMenuItem item2 = new JMenuItem("Author");
        item2.addActionListener(this);
        menu2.add(item2);
        m.add(menu2);

        setJMenuBar(m);
        setVisible(true);




//Space of area

//Text's Space
        drawing = new Drawing();
        contentPane .add(drawing,"Center");

// Panel Bottom

        JPanel pan1=new JPanel();
        JPanel pan2=new JPanel();
        JPanel pan3=new JPanel();


//First Panel

        pan1.setLayout(new GridLayout(2,4));


//Button and Colors

        String tabColor []= {"Black","Red","Green","Blue","Yellow","Rose","Magenta","Orange"};

        Color color [] = {Color.black,Color.red,Color.green,Color.blue,Color.yellow,Color.pink,Color.magenta,Color.orange};
        JButton button [] = new JButton [8] ;

        for(int i=0;i<8;i++){ button[i]=new JButton(tabColor[i]); button[i].setBackground(color[i]);
            button[i].addActionListener(this);
            pan1.add(button[i]);
        }


//Second Panel
        String figure []= {"Ellipse","Circle","Square","Rectangle"};
        JButton fig [] = new JButton [4];
        pan2.setLayout(new GridLayout(2,2));


        for(int i=0;i< 4;i++){
            fig[i]=new JButton(figure[i]);
            fig[i].addActionListener(this);
            pan2.add(fig[i]);

        }

        pan3.setLayout(new GridLayout(1,2));
        pan3.add(pan1);
        pan3.add(pan2);
        contentPane .add(pan3,"South");





    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        String tabColor []= {"Black","Red","Green","Blue","Yellow","Rose","Magenta","Orange"};
        Color color [] = {Color.black,Color.red,Color.green,Color.blue,Color.yellow,Color.pink,Color.magenta,Color.orange};

	/*switch(cmd){

		case "Black" :  drawing.setColor(Color.black) ;
			           System.out.println("You clicked on: " + cmd);
	                   break ;

	    case "Quit" : System.exit(0);
			           System.out.println("You clicked on: " + cmd);
	                   break  ;

	}*/


        if(cmd.equals("Quit")) {
            System.exit(0);
        }
        else if (cmd=="Ellipse" || cmd== "Circle"||cmd== "Square"||cmd== "Rectangle")   {
            System.out.println("You clicked: " + cmd);
            this.drawing.nameFig(cmd);
            System.out.println("\n the new name oof the figure is  " +drawing.getName());
        }

        else if(cmd.equals("About Me")) {
            System.out.println("You clicked on: " + cmd);
        }

        else if(cmd.equals("New")) {
            System.out.println("You clicked on: " + cmd);
            this.drawing.getList ().clear();
            this.drawing.repaint();

        }

        else if(cmd.equals("Author")) {
            System.out.println("You clicked on: " + cmd);


            //	String retour = JOptionPane.showInputDialog( "Who's author");

            //	System.out.println(retour);

            JOptionPane d = new JOptionPane();
            d.showMessageDialog(this, "The author is Nazim Boudia , 2G3TD1");
            //d.showOutputDialog( "Who's author");
        }








        else   {


            for(int  i =0;i<8;i++){
                if (cmd==tabColor[i])
                {
                    drawing.setColor(color[i]) ;
                    System.out.println("You clicked on: " + cmd);

                }
            }


            //this.drawing.color();
        }









    }
}
