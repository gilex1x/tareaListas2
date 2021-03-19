package listas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Lamina extends JPanel {
    //los JPanelñ van dentro del JFrame
    //Establecemos los botones 
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    int num,num2;
    MyLista lista1;
    public Lamina(){
        lista1=new MyLista();
        bt1= new JButton("Agregar inicio");
        bt2= new JButton("Agregar Final");
        bt3 = new JButton("Agregar medio");
        bt4 = new JButton("Mostrar datos");
        bt5 = new JButton("Contar nodos");
        bt6 = new JButton("Sumar valores");
        bt1.addActionListener(new handleOperations());
        bt2.addActionListener(new handleOperations());
        bt3.addActionListener(new handleOperations());
        bt4.addActionListener(new handleOperations());
        bt5.addActionListener(new handleOperations());
        bt6.addActionListener(new handleOperations());
        //para agregar botones u otras vcosas usamos add(myElemento)
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
       
    }
    
    private class handleOperations implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == bt1){
                num=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero:"));
                lista1.insertarComienzo(num);
                JOptionPane.showMessageDialog(null,"Lista;\n "+lista1.mostrarList());
            }else if(evento.getSource() == bt2){
                num=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero:"));
                lista1.insertarFinal(num);
                JOptionPane.showMessageDialog(null,"Lista;\n "+lista1.mostrarList());
            }else if(evento.getSource()== bt3){
                num=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero:"));
                num2=Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion"));
                lista1.insertarMedio(num2, num);
                JOptionPane.showMessageDialog(null,"Lista:\n"+lista1.mostrarList());
            }else if(evento.getSource()== bt4){
                JOptionPane.showMessageDialog(null,"La lista esta así:\n"+lista1.mostrarList());
            }else if(evento.getSource()==bt5){
                JOptionPane.showMessageDialog(null,"La cantidad de nodos actual es de:\n"+lista1.contarNodos());
            }else if(evento.getSource()==bt6){
                JOptionPane.showMessageDialog(null,"La suma de los datos en los nodos es de: \n"+lista1.sumarValores());
            }
        }//fin action performed
    }//Fin del handleOperator
    
}
