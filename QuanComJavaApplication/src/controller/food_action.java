package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MouseInputListener;

import main.java.GUI.LeftMenu;



public class food_action implements MouseInputListener{
    private LeftMenu Lmn;

    public food_action(LeftMenu Lmn){
    	this.Lmn = Lmn;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for(int i = 0; i < Lmn.funcBtn.length; i++){

            if(e.getSource() == Lmn.funcBtn[i]){
                
                Lmn.funcBtn[i].setBackground(Color.orange);
            }
        }
		
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
        for(int i = 0; i < Lmn.funcBtn.length; i++){

            if(e.getSource() == Lmn.funcBtn[i]){
                
                Lmn.funcBtn[i].setBackground(Color.darkGray);
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }
    
    
}


