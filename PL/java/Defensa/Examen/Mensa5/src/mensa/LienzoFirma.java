/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.awt.Point;
import java.util.Iterator;

/**
 *
 * @author quevedo
 */
public class LienzoFirma extends javax.swing.JPanel {
    private int lHorizontal;
    private int lVertical;
    private int limitX;
    private int limitY;
    
    public LienzoFirma() {
        super();
        puntos=new LinkedList<>();
        trazoRadio=4;
        trazoColor=Color.BLACK;
        lHorizontal = 0;
        lVertical = 0;
        
    }
    
    public void setGridBounds(int[] x) {
        limitX = x[0];
        limitY = x[1];
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int radio=trazoRadio;
        g.setColor(trazoColor);
        Iterator<Point> iter=puntos.iterator();
        while(iter.hasNext()){
            Point p=iter.next();
            g.fillOval(p.x-radio,p.y-radio, radio*2, radio*2);
        }
        
        if(lHorizontal != 0) {
            int inc = limitX / lHorizontal;
            for(int i = inc; i < limitX; i += inc) {
                g.drawLine(i, 0, i, limitY);
            }
        }
        
        if(lVertical != 0) {
            int inc = limitY / lVertical;
            for(int i = inc; i < limitY; i += inc) {
                g.drawLine(0, i, limitX, i);
            }
        }

    }
    
    public void insertaPunto(Point p){
           puntos.add(p);
    }
    
    public void setTrazoRadio(int trazoRadio){
        if(trazoRadio>=0)
            this.trazoRadio=trazoRadio;
    }
    
    public int getTrazoRadio(){
        return trazoRadio;
    }
    
    public void setTrazoColor(Color trazoColor){
        if(trazoColor!=null)
            this.trazoColor=trazoColor;
    }
    
    public Color getTrazoColor(){
        return trazoColor;
    }
    
    public void borra(){
        puntos.clear();
    }
    
    public void setHorizontal(int val) {
        if(val >= 0 && val <= 100) lHorizontal = val;
    }
    
    public void setVertical(int val) {
        if(val >= 0 && val <= 100) lVertical = val;
    }
    
   
    private int trazoRadio; // Grosor del trazo
    private Color trazoColor; // Color con el que se pintará el trazo
    private LinkedList<Point> puntos; // Puntos que forman el trazo
}
