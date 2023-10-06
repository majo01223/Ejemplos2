/*
Autor: María José Corredor y Gabriela Gordillo
 */
package ejemploradiobutton;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploRadioButton extends JFrame implements ChangeListener {

    private final JRadioButton radio1;
    private final JRadioButton radio2;
    private final JRadioButton radio3;
    private final ButtonGroup grupoBotones;

    public EjemploRadioButton() {

        grupoBotones = new ButtonGroup();

        radio1=new JRadioButton("Tamaño uno");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupoBotones.add(radio1);

        radio2=new JRadioButton("Tamaño dos");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupoBotones.add(radio2);

        radio3=new JRadioButton("Tamaño tres");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupoBotones.add(radio3);

       
        Frame();
    }

    private void Frame() {

        setLayout(null);
        setTitle("Ejemplo Radio Button");
        setBounds(450, 150, 350, 230);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploRadioButton();
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        if (radio1.isSelected()) {
            setSize(300,200);
        }
        if (radio2.isSelected()) {
            setSize(600,400);
        }
        if (radio3.isSelected()) {
            setSize(900,600);
        }

    }
}
