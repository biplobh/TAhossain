public class EnemyRoom extends MapTile {
    private Enemy enemy;

    public EnemyRoom(int x, int y, Enemy enemy) {
        super(x, y);
        this.enemy = enemy;
    }

    public EnemyRoom(int x, int y) {
        super(x, y);
    }
}