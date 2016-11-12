package com.cubjava.maze;

import javax.swing.JFrame;

public class Maze
{
	public static void main(String[] args)
	{
		new Maze();
	}

	public Maze()
	{
		JFrame f = new JFrame();
		f.setTitle("Cub Java Maze");
		f.add(new Board());
		f.setSize(463, 485);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
