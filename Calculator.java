package swing;



import org.mariuszgromada.math.mxparser.Expression;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Calculator extends JFrame {
    String expression="";
    JMenuBar bar;
    JMenu fileMenu,editMenu;
        JMenuItem newMnItem,saveMnItem,openMnItem,saveasMnItem,printMnItem,exitMnItem;
        JMenuItem cutMnItem,cpyMnItem,pstMnItem;

        JPopupMenu popUpMenu;
        JMenuItem cut,copy,paste;
        Calculator (){
        setTitle("Calculator");
        setSize(300,300);
        setLayout(new GridLayout(2,1));
        setLocation(400,300);
        setResizable(false);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(5,4));
        JTextArea jTextArea = new JTextArea(3,10);
        jTextArea.setFont(new Font("Arial Black", Font.BOLD, 30));;
        jPanel.add(jTextArea,BorderLayout.WEST);


        bar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        newMnItem = new JMenuItem("New");
        newMnItem.addActionListener(e->{

        });

        saveMnItem = new JMenuItem("Save");
        openMnItem= new JMenuItem("Open..");
        openMnItem.addActionListener(e->{
            JFileChooser saveFileDg = new JFileChooser();
            saveFileDg.showSaveDialog(this);
        }); // FileChooser

        saveasMnItem= new JMenuItem("Save as..");
        printMnItem=new JMenuItem("Print");
        exitMnItem=new JMenuItem("Exit");


        cutMnItem = new JMenuItem("Cut");
        cpyMnItem = new JMenuItem("Copy");
        pstMnItem = new JMenuItem("Paste");

        fileMenu.add(newMnItem);
        fileMenu.add(openMnItem);
        fileMenu.add(saveMnItem);
        fileMenu.add(saveasMnItem);
        fileMenu.addSeparator();
        fileMenu.add(printMnItem);
        fileMenu.add(exitMnItem);

        editMenu.add(cutMnItem);
        editMenu.add(cpyMnItem);
        editMenu.add(pstMnItem);

        bar.add(fileMenu);
        bar.add(editMenu);
        setJMenuBar(bar);

        // Create Popup menus  step1
        popUpMenu = new JPopupMenu();
        // Create JmenuItem menus  step2
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        // add menuitems to popup menu step-3
        popUpMenu.add(cut);
        popUpMenu.add(copy);
        popUpMenu.add(paste);
        jPanel.add(popUpMenu);
        jTextArea.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    popUpMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    popUpMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        setJMenuBar(bar);

        // Create Popup menus  step1
        popUpMenu = new JPopupMenu();
        // Create JmenuItem menus  step2
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        // add menuitems to popup menu step-3
        popUpMenu.add(cut);
        popUpMenu.add(copy);
        popUpMenu.add(paste);




        JButton jButton = new JButton("0");
        jButton.addActionListener(e->{
            expression +="0";
            jTextArea.setText(expression);
        });
        JButton jButton1 = new JButton("1");
        jButton1.addActionListener(e->{
            expression +="1";
            jTextArea.setText(expression);
        });
        JButton jButton2 = new JButton("2");
        jButton2.addActionListener(e->{
            expression +="2";
            jTextArea.setText(expression);
        });
        JButton jButton3 = new JButton("3");
        jButton3.addActionListener(e->{
            expression +="3";
            jTextArea.setText(expression);
        });
        JButton jButton4 = new JButton("4");
        jButton4.addActionListener(e->{
            expression +="4";
            jTextArea.setText(expression);
        });
        JButton jButton5 = new JButton("5");
        jButton5.addActionListener(e->{
            expression +="5";
            jTextArea.setText(expression);
        });
        JButton jButton6 = new JButton("6");
        jButton6.addActionListener(e->{
            expression +="6";
            jTextArea.setText(expression);
        });
        JButton jButton7 = new JButton("7");
        jButton7.addActionListener(e->{
            expression +="7";
            jTextArea.setText(expression);
        });
        JButton jButton8 = new JButton("8");
        jButton8.addActionListener(e->{
            expression +="8";
            jTextArea.setText(expression);
        });
        JButton jButton9 = new JButton("9");
        jButton9.addActionListener(e->{
            expression +="9";
            jTextArea.setText(expression);
        });
        JButton jButtonDot = new JButton(".");
        jButtonDot.addActionListener(e->{
            expression +=".";
            jTextArea.setText(expression);
        });
        JButton jButtonPlus = new JButton("+");
        jButtonPlus.addActionListener(e->{
            expression +="+";
            jTextArea.setText(expression);
        });
        JButton jButtonNegative = new JButton("-");
        jButtonNegative.addActionListener(e->{
            expression +="-";
            jTextArea.setText(expression);
        });
        JButton jButtonMultiplication = new JButton("x");
        jButtonMultiplication.addActionListener(e->{
            expression +="*";
            jTextArea.setText(expression);
        });
        JButton jButtonDivide = new JButton("/");
        jButtonDivide.addActionListener(e->{
            expression +="/";
            jTextArea.setText(expression);
        });
        JButton jButtonEqual = new JButton("=");
        jButtonEqual.addActionListener(e->{
            
//            expression +="=";
            Expression exp = new Expression(expression);
            jTextArea.setText(String.valueOf(exp.calculate()));
            expression=jTextArea.getText();
        });
        JButton jButtonTwoZero = new JButton("00");
        jButtonTwoZero.addActionListener(e->{
            expression +="00";
            jTextArea.setText(expression);
        });
        JButton jButtonClear= new JButton("c");
        jButtonClear.addActionListener(e->{
            expression ="";
            jTextArea.setText(expression);


        });
        JButton jButtonRightBracket = new JButton(")");
        jButtonRightBracket.addActionListener(e->{
            expression +=")";
            jTextArea.setText(expression);
        });
        JButton jButtonLeftBracket = new JButton("(");
        jButtonLeftBracket.addActionListener(e->{
            expression +="(";
            jTextArea.setText(expression);
        });


        jPanel1.add(jButtonClear);
        jPanel1.add(jButtonLeftBracket);
        jPanel1.add(jButtonRightBracket);
        jPanel1.add(jButtonDivide);


        jPanel1.add(jButton7);
        jPanel1.add(jButton8);
        jPanel1.add(jButton9);
        jPanel1.add(jButtonMultiplication);

        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel1.add(jButton6);
        jPanel1.add(jButtonNegative);

        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButtonPlus);

        jPanel1.add(jButton);
        jPanel1.add(jButtonTwoZero);
        jPanel1.add(jButtonDot);
        jPanel1.add(jButtonEqual);

        getContentPane().add(jPanel);
        getContentPane().add(jPanel1);






        setVisible(true);

    }
    public static void main(String[] args) {
        Calculator  calculator = new Calculator() ;


    }
}
