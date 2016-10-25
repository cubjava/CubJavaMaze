package com.cubjava.maze;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class MazeMap
{
	private Scanner scan;
	private String map[] = new String[14];
	private Image road, wall;
	
	public MazeMap()
	{
		ImageIcon img = new ImageIcon(MazeMap.class.getResource("/com/cubjava/resources/road.png").getFile());
		road = img.getImage();
		img = new ImageIcon(MazeMap.class.getResource("/com/cubjava/resources/brickwall.png").getFile());
		wall = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getRoad()
	{
		return road;
	}
	
	public Image getWall()
	{
		return wall;
	}
	
	public String getMap(int x, int y)
	{
		String index = map[y].substring(x, x + 1);
		return index;
	}
	
	public void openFile()
	{
		
		try
		{
			File mazeMap = new File(MazeMap.class.getResource("/com/cubjava/resources/mazemap.txt").getFile());
			scan = new Scanner(mazeMap);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFile()
	{
		while(scan.hasNext())
		{			
			for(int i = 0; i < 14; i++)
			{
				map[i] = scan.next();
			}
		}
	}
	
	public void closeFile()
	{
		
	}
}
