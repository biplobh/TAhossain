public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getter method that return x
    public int getX() {
        return x;
    }
    // Getter method that return y
    public int getY() {
        return y;
    }
//The MapTile class will contain a public method adjacent_moves()
// that handles all move actions (x or y position) for the adjacent tiles
    public MapTile[] adjacent_moves() {
        // Create an array of 4 MapTiles to hold the adjacent moves
        MapTile[] moves = new MapTile[4];

        // move right
        moves[0] = new MapTile(x + 1, y);
        // left
        moves[1] = new MapTile(x - 1, y);
        // up
        moves[2] = new MapTile(x, y + 1);
        // down
        moves[3] = new MapTile(x, y - 1);
        return moves;  // Return the array of adjacent MapTiles
    }
}
