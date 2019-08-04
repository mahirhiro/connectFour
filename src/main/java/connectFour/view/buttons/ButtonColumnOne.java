package connectFour.view.buttons;

import connectFour.controller.ButtonOneAction;
import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnOne extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnOne(GameBoard board){
        super(new ButtonOneAction(board));
        setButtonProperties();
    }
}