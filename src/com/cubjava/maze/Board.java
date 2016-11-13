package com.cubjava.maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener
{
	private Timer	timer;
	private MazeMap	m;
	private Tank	t;

	public Board()
	{
		m = new MazeMap();
		t = new Tank();
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();

	}

	public void paint(Graphics g)
	{
		super.paint(g);
		for (int y = 0; y < 14; y++)
		{
			for (int x = 0; x < 14; x++)
			{
				if (m.getMap(x, y).equals("g"))
				{
					g.drawImage(m.getRoad(), x * 32, y * 32, null);
				}

				if (m.getMap(x, y).equals("w"))
				{
					g.drawImage(m.getWall(), x * 32, y * 32, null);
				}
			}

			g.drawImage(t.getTankImage(), t.getTileX() * 32, t.getTileY() * 32, null);
		}
	}

	public class Al extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_UP)
			{
				if (t.getTileY() > 0 &&
					!m.getMap(t.getTileX(), t.getTileY() - 1).equals("w"))
					t.move(0, -1);
			}
			if (keycode == KeyEvent.VK_DOWN)
			{
				if (t.getTileY() < 13 &&
					!m.getMap(t.getTileX(), t.getTileY() + 1).equals("w"))
					t.move(0, 1);
			}
			if (keycode == KeyEvent.VK_LEFT)
			{
				if (t.getTileX() > 0 &&
					!m.getMap(t.getTileX() - 1, t.getTileY()).equals("w"))
					t.move(-1, 0);
			}
			if (keycode == KeyEvent.VK_RIGHT)
			{
				if (t.getTileX() < 13 
					&& !m.getMap(t.getTileX() + 1, t.getTileY()).equals("w"))
					t.move(1, 0);
			}
		}

		public void keyReleased(KeyEvent e)
		{

		}

		public void keyTyped(KeyEvent e)
		{

		}
	}
}
