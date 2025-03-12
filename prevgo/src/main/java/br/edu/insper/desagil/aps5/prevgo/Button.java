package br.edu.insper.desagil.aps5.prevgo;

public class Button extends Component {
    private Label label;
    private int padding;

    public Button(int x, int y, Label label, int padding) {
        super(x, y, label.getX() + label.getWidth() + padding, label.getY() + label.getHeight() + padding);
        this.label = label;
        this.padding = padding;
    }

    public Label getLabel() {
        return label;
    }

    @Override
    public void setWidth(int width) {
        label.setWidth(width - horizontalSpace());
    }

    @Override
    public void setHeight(int height) {
        label.setHeight(height - verticalSpace());
    }

    private int horizontalSpace() {
        return label.getX() + padding;
    }

    private int verticalSpace() {
        return label.getY() + padding;
    }
}
