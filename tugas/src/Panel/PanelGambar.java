/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class PanelGambar extends JPanel {
    Image gambar;
    public PanelGambar(){
        gambar=new ImageIcon(getClass().getResource("/tugas.img/ijo.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gambar, 0, 0, getWidth(),getWeight(),null);
        gd.dispose();
    }

    private int getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}