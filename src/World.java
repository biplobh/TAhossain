import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();
    public void load_tiles() {
        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;
        // Todo: verify the x and y exist in the world
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length) && _world[x][y] != null) {
            switch (_world[x][y]) {

                case "StartingRoom":
                    mt = new StartingRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "FindDaggerRoom":
                    mt = new FindDaggerRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "GiantSpiderRoom":
                    mt = new GoblinCave(x, y, new Goblin());
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureRoom":
                    mt = new TreasureRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyCavePath":
                    mt = new EmptyCavePathRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "OgreRoom":
                    mt = new OgreRoom(x, y, new Ogre());
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveCaveRoom":
                    mt = new LeaveCaveRoom(x, y);
                    break;
            }
        }
        return mt;
    }
    private static MapTile checkRoomExists(MapTile mt){
        if (history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }else
        {
            history.add(mt);
        }
        return mt;
    }
}