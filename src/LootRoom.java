public class LootRoom extends MapTile{
    Item item;
    public boolean pickedItem = false;
    public LootRoom(int x, int y, Item item){
        super(x, y);
        this.item = item;
    }
    public void add_Loot(Player player){
        player.inventory.add(item);
        pickedItem = true;
    }
}
