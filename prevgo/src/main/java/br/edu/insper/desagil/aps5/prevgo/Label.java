package br.edu.insper.desagil.aps5.prevgo;

public class Label extends Component {
    private String text;

    public Label(int x, int y, int width, int height, String text) {
        super(x, y, width, height);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        setText("");
    }

    public void lower() {
        text = text.toLowerCase();
    }

    public void upper() {
        text = text.toUpperCase();
    }
}
