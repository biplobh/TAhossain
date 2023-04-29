public class EmptyCavePathRoom extends MapTile{
    public EmptyCavePathRoom(int x, int y) {
        super(x, y);
    }
    private final String[] ECP_INTRO = {"The path look empty."};
    public String intro_text(){
        return ECP_INTRO[(int) (java.lang.Math.random() * ECP_INTRO.length)];
    }
}
