package Ejercicios1;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre del 2017
 * Ventana para mostrar archivos de una manera estetica 
 * Interaz de arbol 
 */
public class JTressTest22 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setTitle("JTreeTest");
	f.setSize(200, 150);
	f.getContentPane().setLayout(new FlowLayout());
	DefaultMutableTreeNode titulo=new DefaultMutableTreeNode("Programacion en Java");
	DefaultMutableTreeNode capitulo=new DefaultMutableTreeNode("AWT");
	titulo.add(capitulo);
	capitulo=new DefaultMutableTreeNode("JFC");
	titulo.add(capitulo);
	JTree tree=new JTree(titulo);
	JScrollPane sp=new JScrollPane(tree);
	f.getContentPane().add(sp);
	f.setVisible(true);
}
}
