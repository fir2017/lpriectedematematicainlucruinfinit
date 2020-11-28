package gui.p2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class FigureMng {

	private static FigureMng obj = null;

	private FigureMng() {
	}

	public static FigureMng getInstance() {
		if (obj == null)
			obj = new FigureMng();
		return obj;
	}

	private List<Figura> figs = new ArrayList<>();
	private Figura currFig;
	private boolean fill = false;
	private Color color = Color.black;

	public void addFigure() {
		figs.add(currFig);

		try {
			currFig = currFig.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Figura> getFigs() {
		return figs;
	}

	public Figura getCurrFig() {
		return currFig;
	}

	public void setCurrFig(Figura currFig) {
		this.currFig = currFig;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
		currFig.setFill(fill);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		currFig.setColor(color);
	}

}
