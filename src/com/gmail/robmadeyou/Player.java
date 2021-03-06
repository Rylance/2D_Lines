package com.gmail.robmadeyou;

import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static org.lwjgl.opengl.GL11.glVertex2i;


import static org.lwjgl.opengl.GL11.GL_POINTS;
import static org.lwjgl.opengl.GL11.GL_LINES;
import static org.lwjgl.opengl.GL11.glPointSize;
import static org.lwjgl.opengl.GL11.glColor3f;

public class Player {
	
	
	static Lines lines[] = new Lines[255];
	
	static class Lines{
		int x;
		int y;
		
		int secX;
		int secY;
		
		String colour;
		Lines(int x, int y, int secX, int secY,String colour){
			this.x = x;
			this.y = y;
			this.secX = secX;
			this.secY = secY;
			
			this.colour = colour;
		}
		void draw(){
			
			glBegin(GL_LINES);
				glVertex2f(x, y);
				glVertex2f(secX, secY);
			glEnd();
		}
	}
	
	
	/*
	 * This Array defines the dots, dots are created on click, once 2 dots are created a line is drawn through it, then the line is
	 * checked against all the other quads if it's touching anything, if it is player looses a life, if it doesn't; good work :D
	 */
	static Dots dots[] = new Dots[256];
	static class Dots{
		int x;
		int y;
		
		float size;
		String colour;
		
		float red;
		float green;
		float blue;
		Dots(int x, int y, float size, String colour){
			this.x = x;
			this.y = y;
			
			this.size = size;
			this.colour = colour;
			
		}
		
		void draw(){
			glPointSize(size);
			glBegin(GL_POINTS);
				glColor3f(1, 1, 1);
				glVertex2i(x , y);
			glEnd();
		}
	}
}
