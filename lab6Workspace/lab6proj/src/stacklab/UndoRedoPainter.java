package stacklab;

import java.util.*;


public class UndoRedoPainter extends Painter
{
	public UndoRedoPainter() {
		setUndoButtonEnabled(false);
		setRedoButtonEnabled(false);
	}
	
	// Called when the user pushes the Undo button.
	void undo()
	{
		if (!getHistory().isEmpty()) {
			Circle circle = getHistory().pop();
			getUndoHistory().push(circle);
			setRedoButtonEnabled(true);
			repaint();
			if (getHistory().isEmpty())
				setUndoButtonEnabled(false);
		} else {
			setUndoButtonEnabled(false);
		}
	}


	// Called when the user pushes the Redo button.
	void redo()
	{
		if (!getUndoHistory().isEmpty()) {
			Circle circle = getUndoHistory().pop();
			getHistory().push(circle);
			repaint();
			if (getUndoHistory().isEmpty()) {
				setRedoButtonEnabled(false);
				setUndoButtonEnabled(true);
			}
		} else {
			setRedoButtonEnabled(false);
		}
	}
	
	
	public static void main(String[] args)
	{
		new UndoRedoPainter().setVisible(true);
	}
}
