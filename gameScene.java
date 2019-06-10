/****************************************************************************
 *
 * Created by: James Lee
 * Created on: June 2019
 * Created for: ICS4U
 * Connect 4 code, main game
 *
 *
 * Still needs : 
 * 
 * - Literally everything
 * 
 ****************************************************************************/

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class gameScene extends JFrame
{
	public static void main(String[] args) 
	{	
	    gameScene frame = new gameScene();
	    
	    frame.setTitle("Connect 4");
	    frame.setSize(850, 850);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);	    
	}
	
	public gameScene()
	{
		// Creates a panel for the board
	    JPanel board = new JPanel();
	    
	    // Makes an 8 x 8 grid
	    board.setLayout(new GridLayout(6, 8));
	    board.setSize(1100, 1100);
	    
	    Spot spots[][] = new Spot[6][8];
	    
	    for (int i = 0; i < 6; i++)
	    {
	    	for (int j = 0; j < 8; j++)
	    	{
	    		Spot spot = new Spot();
	    		board.add(spot);
	    		
	    		try
	    		{
	    		    Image img = ImageIO.read(getClass().getResource("resources/spot.PNG"));
	    		    spot.setIcon(new ImageIcon(img));
	    		    spot.setSize(100,100);
	    		}
	    		
	    		catch (Exception e) {}
	    		
	    		spots[i][j] = spot;
	    	}
	    }
	    
	    add(board);
	}
}

class Spot extends JButton
{
	// Constructor
	public Spot()
	{
		
	}
}

class Board extends JPanel
{
	
}