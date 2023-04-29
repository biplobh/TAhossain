import java.io.IOException;
import java.util.ArrayList;

public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        return x == other.x && y == other.y;
    }

    public void playerInfo(Player player) throws IOException {
        // Implementation goes here
    }

    public String intro_text() {
        return "Welcome!";
    }

    public ArrayList<Action> adjacent_moves() {
        ArrayList<Action> moves = new ArrayList<Action>();
        if (World.tile_exists(x, y + 1) != null)
            moves.add(new MoveEast()); // moves east
        if (World.tile_exists(x, y - 1) != null)
            moves.add(new MoveWest()); // moves west
        if (World.tile_exists(x - 1, y) != null)
            moves.add(new MoveNorth()); // moves north
        if (World.tile_exists(x + 1, y) != null)
            moves.add(new MoveSouth()); // moves south

        return moves;
    }

    public ArrayList<Action> available_actions() {
        ArrayList<Action> moves = adjacent_moves();
        moves.add(new ViewInventory());

        return moves;
    }
}
