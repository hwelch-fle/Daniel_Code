
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.Graphics.*;

public class Character {
	
	//instance variables
	private int X;
	private int Y;
	private String[] spriteList;
	private ArrayList<Image> sprites;
	
	// constructor
	public Character (int initX, int initY, String[] defnSprites, String[] spriteLinks) {
		X = initX;
		Y = initY;
		spriteList = defnSprites;
		for (int count = 0; count < spriteList.length; count++) {
			ImageIcon icon = new ImageIcon(spriteList[count]);
			Image sprite = icon.getImage();
			sprites.add(sprite);
		}
	}
	
	// Accessors 
	public int getX() {return X;}
	public int getY() {return Y;}
	
	// Mutators
	public void setX(int newX) {X = newX;}
	public void setY(int newY) {X = newY;}
	public void move(int moveX, int moveY) {X+=moveX; Y+=moveY;}
	
	// functions
	public void draw(Graphics Draw2D) {
		// create the Graphics2D object
		Graphics2D draw = (Graphics2D) Draw2D;
		RenderingHints renderingHints
        = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		renderingHints.put(RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_QUALITY);
		draw.setRenderingHints(renderingHints);
		
		// draw sprite
		Rectangle2D bg = new Rectangle2D.Double(X, Y, 50, 70);
        draw.setColor(Color.red);
        draw.fill(bg);
	}
}
