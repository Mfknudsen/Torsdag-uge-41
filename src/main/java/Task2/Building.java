package Task2;

public class Building {
    private final Room[] rooms;
    private int bathCount;
    private int floorCount;
    private boolean isOffice;

    public Building(Room[] rooms, int bathCount, int floorCount, boolean isOffice) {
        this.rooms = rooms;
        this.bathCount = bathCount;
        this.floorCount = floorCount;
        this.isOffice = isOffice;
    }

    public int getBathCount() {
        return bathCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public boolean getIsOffice(){
        return isOffice;
    }

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public void setOffice(boolean office) {
        isOffice = office;
    }
}
