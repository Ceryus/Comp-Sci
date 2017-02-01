//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public Block(int x, int y, int w)
	{
		xPos = x;
		yPos = y;
		width = w;
	}
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	
	public Block(int x, int y, int w, int h, Color col)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
	}
	
	public void setX(int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}

	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}  
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
   //add the other set methods
   public void setColor(Color col)
   {
	   color = col;
   }

   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight()
   {
	   return height;
   }
   
   public Color getColor()
   {
	   return color;
   }
   
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	public String toString()
	{
		return getX() + getY() + getWidth() + getHeight() + getColor();
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}