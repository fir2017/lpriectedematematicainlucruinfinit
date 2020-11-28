package gui.p2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {

	protected int startX, startY;
	protected int stopX, stopY;

	protected Color color = Color.BLACK;

	protected boolean fill = false;

	public  void draw(Graphics g){
		g.setColor(color);
		int width = Math.abs( stopX - startX);
		int height = Math.abs(stopY - startY);
		int x = Math.min(startX, stopX);
		int y = Math.min(startY, stopY);
		actualDraw(g, x,y, width, height);
		
	}
	
	protected abstract void actualDraw(Graphics g,int x, int y, int width, int height);
	
	public Figura(){
		this.startX = 0;
		this.startY = 0;
		this.stopX = 0;
		this.stopY = 0;
		this.fill = FigureMng.getInstance().isFill();
		this.color=FigureMng.getInstance().getColor();
	}

	public Figura(int startX, int startY, int stopX, int stopY, Color c, boolean fill) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.stopX = stopX;
		this.stopY = stopY;
		this.color = c;
		this.fill= fill;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getStopX() {
		return stopX;
	}

	public void setStopX(int stopX) {
		this.stopX = stopX;
	}

	public int getStopY() {
		return stopY;
	}

	public void setStopY(int stopY) {
		this.stopY = stopY;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}
}
