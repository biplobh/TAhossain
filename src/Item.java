public class Item {

    protected String name;

    protected String desc;

    protected int value;

    public Item(String name, String desc, int value){
    //Item i1 = new Item(name="Item name", desc="Item desc", value = 5);

        this.name = name;
        this.desc = desc;
        this.value = value;

    }
    public String toString() {
        return String.format("%s\nDescription: %s\nValue: %d", this.name, this.desc, this.value);
    }

}
