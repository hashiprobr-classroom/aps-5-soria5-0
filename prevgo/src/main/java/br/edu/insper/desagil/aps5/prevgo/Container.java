package br.edu.insper.desagil.aps5.prevgo;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
    private List<Component> children;

    public Container(int x, int y, int width, int height) {
        super(x, y, width, height);
        children = new ArrayList<>();
    }

    public List<Component> getChildren() {
        return children;
    }

    public void addChild(Component component) {
        children.add(component);
    }
}
