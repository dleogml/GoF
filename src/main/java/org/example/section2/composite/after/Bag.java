package org.example.section2.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
    public List<Component> getComponents() {
        return components;
    }
}
