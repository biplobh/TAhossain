public class TreasureRoom extends MapTile{
    public TreasureRoom(int x, int y) {
        super(x, y);
    }
    private String[] TREAS_INTRO = {"Gold! Gold! Gold! "};

    public String intro_text(){
        return TREAS_INTRO[(int) (java.lang.Math.random() * TREAS_INTRO.length)];
    }

    public void playerInfo(Player player){

    }
}
