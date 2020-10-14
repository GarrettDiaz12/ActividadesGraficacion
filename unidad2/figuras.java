
package unidad2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class figuras extends JPanel{
    private JFrame ventana;
    private Container contenedor;
    public  figuras(){         
// inicializar la ventana
        ventana = new JFrame("Diaz Cervera Brian Noe/ITL/Graficacion/-Figuras-");
        // definir tamaño a ventana
        ventana.setSize(740, 410);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);     
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }   
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        // figura 1 de lineas
        g.setColor(Color.red);
        g.drawRect(10, 10, 230, 170);
        // figuea dentro
        g.setColor(Color.black);
        g.drawLine(130, 30, 40, 80);
        g.drawLine(130, 30, 210,80);
        g.drawLine(40, 80, 210, 80);
        g.drawLine(210, 80, 210, 130);
        g.drawLine(40, 80, 40, 130);
        g.drawLine(40, 130, 210, 130);
        // puerta
        g.drawLine(70, 100, 100, 100);
        g.drawLine(70, 100, 70, 130);
        g.drawLine(100, 100, 100, 130);
        // reflejo
        g.drawLine(70, 130, 50, 140);
        g.drawLine(100, 130, 80, 140);
        //mensaje
        g.drawString("Dibujado de lineas", 76, 170);
        // figura 2 circulos   
        g.setColor(Color.red);
        g.drawRect(10, 195, 230, 170);
        g.setColor(Color.black);
        g.drawOval(65, 210, 120, 120);
        // ojos
        g.drawOval(95, 240, 20, 20);
        g.drawOval(135, 240, 20, 20);
        // relleno ojos
        g.fillOval(100, 245, 10,10 );
        g.fillOval(140, 245, 10,10 );
        
        //boca
        g.drawOval(108, 280, 35, 35);
        // texto
        g.drawString("Dibujado de circulos", 75, 353);
        // figura 3 rectangulos
        g.setColor(Color.red);
        g.drawRect(260, 10, 220, 170);
        g.setColor(Color.black);
        g.drawRect(275, 100, 30, 50);
        g.drawRect(315, 80, 30, 70);
        g.drawRect(355, 60, 30, 90);
        g.drawRect(395, 40, 30, 110);
        g.drawRect(435, 20, 30, 130); 
        g.drawString("Dibujado de rectangulos", 300, 170);
        
        //figura 4 ovalos y circulos
        g.setColor(Color.red);
        g.drawRect(260, 195, 220, 170);
        g.setColor(Color.black);
        g.drawOval(353, 210, 35, 125);
        g.drawOval(295, 250, 150, 40);
        g.drawOval(327, 230, 87, 35);
        g.drawString("Dibujado de ovalos y circulos", 293, 358);
        
        
        //figura 5 ovalos y rectangulo
        g.setColor(Color.red);
        g.drawRect(500, 10, 220, 170);
        g.setColor(Color.black);
        g.drawRoundRect(568, 35, 85, 40, 140, 140);
        g.drawRoundRect(535, 60, 160, 50, 160, 160);
        g.drawOval(594, 19, 35, 125);
        g.drawString("Dibujado de ovalos rectangulos", 525, 170);
        
        //figura 6 triangulos
        g.setColor(Color.red);
        g.drawRect(500, 195, 220, 170);
        g.setColor(Color.BLACK);
        //triangulo 1
        g.drawLine(530, 280, 530, 220);
        g.drawLine(530, 280, 570, 280);
        g.drawLine(570, 280, 530, 220);
        //triangulo 2  
        g.drawLine(640, 280, 640, 250);
        g.drawLine(640, 280, 690, 280);
        g.drawLine(690, 280, 640, 250);
        //triangulo 3
        g.drawLine(640, 280, 540, 330);
        g.drawLine(640, 280, 680, 330);
        g.drawLine(540, 330, 680, 330);
        g.drawString("Dibujado de ovalos rectangulos", 525, 358);      
//        
//        g.setColor(Color.gray);
//        g.drawLine(100, 50, 150, 20);
//        g.drawLine(200, 50, 150, 20);
//        //rectangulos
//        g.setColor(Color.blue);
//        //contordno
//        g.drawRect(280, 50, 100, 50);
//        g.fillRect(280, 110, 100, 50);
//        // Rectangulo redondeado
//        g.setColor(Color.PINK);
//        g.drawRoundRect(450, 50, 100, 50, 50, 50);
//        g.fillRoundRect(450, 110, 100, 50, 20, 20);// GRADO MENOR DE REDONDEO
//        // TRAZO DE CIRCULOS
//        g.setColor(Color.RED);
//        g.drawOval(100, 200, 80, 80);
//        g.fillOval(100, 290, 50, 50);
//        // Ovalos
//        g.setColor(Color.GREEN);
//        g.drawOval(280,200,80,40);// ancho y alto no se pone igual para notar la diferencia
//        g.fillOval(280, 290, 40,80 );
//        // triangulo
//        g.setColor(Color.black);
//        g.drawLine(450, 300, 550, 300);
//        g.drawLine(450, 300, 500, 250);
//        g.drawLine(550, 300, 500, 250);
//        // DIBUJO DE CADENA DE TEXTO
//        g.setColor(Color.RED);
//        g.drawString("EJEMPLO DE TRAZO DE FIGURAS", 200, 400);
//        // TAREA ARCO CONTORNO Y RELLENO
//        g.setColor(Color.magenta);
//        g.drawArc(70, 370, 100,100, 180, 180);
//        g.fillArc(200, 370, 100, 100, 180, 180);
        
          
        
          
        
        
          
        
    }
    
}
    
