package com.cubjava.maze;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tank
{
	private int tileX, tileY;
	private String state = "E";
	private Image tankImage;
	private static final ImageIcon te = new ImageIcon(Tank.class.getResource("/com/cubjava/resources/tankE.png").getFile());
	private static final ImageIcon tse = new ImageIcon(Tank.class.getResource("/com/cubjava/resources/tankSE.png").getFile());
	private static final ImageIcon ts = new ImageIcon(Tank.class.getResource("/com/cubjava/resources/tankS.png").getFile());
	
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
		tankImage = te.getImage();
		
		tileX = 0;
		tileY = 1;
	}
	
	public void move(int dx, int dy)
	{
		if(dx == 0)
		{
			if(dy > 0)
			{
				//move south
				if(state.equals("E"))
				{
					state = "ES";
					setTankImage(tse.getImage());
				}
			}
		}
		tileX += dx;
		tileY += dy;
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
