package com.cubjava.maze;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tank
{
	private int x, y, tileX, tileY;
	private Image tankImage;
	
	public Image getTankImage()
	{
		return tankImage;
	}

	public void setTankImage(Image tankImage)
	{
		this.tankImage = tankImage;
	}

	public Tank()
	{
		ImageIcon img = new ImageIcon(Tank.class.getResource("/com/cubjava/resources/tankE.png").getFile());
		
		tankImage = img.getImage();
		x = 32;
		y = 32;
		tileX = 1;
		tileY = 1;
	}
	
	public void move(int dx, int dy, int tx, int ty)
	{
		x += dx;
		y += dy;
		
		tileX += tx;
		tileY += ty;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getTileX()
	{
		return tileX;
	}

	public int getTileY()
	{
		return tileY;
	}
}
