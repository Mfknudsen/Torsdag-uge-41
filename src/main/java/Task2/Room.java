package Task2;

public class Room {
    private Wall walls;
    private int doorCount;
    private int lampCount;
    private int windowCount;

    public Room(Wall walls, int doorCount, int lampCount, int windowCount) {
        this.walls = walls;
        this.doorCount = doorCount;
        this.lampCount = lampCount;
        this.windowCount = windowCount;
    }

    public Wall getWalls() {
        return walls;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getLampCount() {
        return lampCount;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWalls(Wall walls) {
        this.walls = walls;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setLampCount(int lampCount) {
        this.lampCount = lampCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }
}
