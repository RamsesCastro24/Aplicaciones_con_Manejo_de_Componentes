/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.modelo;


public class vista extends JFrame{
    public JPanel panel;
    public JLabel label;
    public JLabel label2;
    public JComboBox combo = new JComboBox();
    public JButton clear;
    public  JCheckBox rellenoJCheckBox; 
    public  JButton blackBtn, blueBtn, redBtn, greenBtn,magentaBtn;
//    public JCheckBox  sinrellenoJCheckBox; 
    
    public void show(modelo modelo){
     modelo drawArea = modelo;
     JFrame frame = new JFrame("Dibujo");
     Container content = frame.getContentPane();
     content.setLayout(new BorderLayout());
                
     content.add(drawArea, BorderLayout.CENTER);
     JPanel controls = new JPanel();
     
     label = new JLabel("Escoja la figura");
     controls.add(label);
     controls.setLayout(new FlowLayout());
     
     combo.addItem("");
     combo.addItem("Cuadrado");
     combo.addItem("Linea");
     combo.addItem("Circulo");
     controls.add(combo);

     rellenoJCheckBox = new JCheckBox("Rellenado");
     controls.add(rellenoJCheckBox);
     
     clear = new JButton("Limpiar");
      controls.add(clear);
     
     label2 = new JLabel("Colores: ");
     controls.add(label2);
     
     blueBtn = new JButton("Azul");
     blackBtn = new JButton("Negro");
     redBtn = new JButton("Rojo");
     greenBtn = new JButton("Verde");
     magentaBtn = new JButton("Rosa");

    
     controls.add(blueBtn);
     controls.add(blackBtn);
     controls.add(greenBtn);
     controls.add(redBtn);
     controls.add(magentaBtn);
     
     content.add(controls,BorderLayout.NORTH);
     frame.setSize(1000,600);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    }
}
