public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if(this == o) return true;

        if(!(o instanceof Item)) return false;

        Item otherItem = (Item) o;

        return this.getIdentifier().equals(otherItem.getIdentifier());
    }

    public String toString() {
        return identifier + ": " + name;
    }
}
