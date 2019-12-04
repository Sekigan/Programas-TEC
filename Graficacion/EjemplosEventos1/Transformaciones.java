package EjemplosEventos1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transformaciones extends JApplet implements ActionListener  {

    private JButton t, r, e, s;
    private Rectang miRectangulo;
    
    public void init()
    {
        Container c = getContentPane();
        JPanel panelDeBotones = new JPanel();
        
        t= new JButton ("Trasladar");
        panelDeBotones.add(t);
        t.addActionListener(this);
        
        r = new JButton("Rotar");
        panelDeBotones.add(r);
        r.addActionListener(this);
        
        e = new JButton("Escalar");
        panelDeBotones.add(e);
        e.addActionListener(this);
        
        s = new JButton("Sesgar");
        panelDeBotones.add(s);
        s.addActionListener(this);
        
        c.add(panelDeBotones, BorderLayout.NORTH);
        miRectangulo = new Rectang(100, 50, 50);
        c.add(miRectangulo, BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == t)
            miRectangulo.trasladar(5);
        if (event.getSource() == r)
            miRectangulo.rotar(5);
        if (event.getSource() == e)
            miRectangulo.escalar(0.9);
        if (event.getSource() == s)
            miRectangulo.sesgar(0.5);
        miRectangulo.mostrar();
    }   
}
 