package Task2;

public class Main {
    public static void main(String[] args){
        Room[] rooms = new Room[3];
        rooms[0] = new Room(new Wall(), 2,1,0);
        rooms[1] = new Room(new Wall(), 1,5,3);
        rooms[2] = new Room(new Wall(), 3,2,5);

        Building building = new Building(rooms, 2,4, false);

        int count = 0;
        for (int i = 0; i < building.getRooms().length; i++)
            count += building.getRooms()[i].getLampCount();
        System.out.println(count);

        if(building.getRooms().length < building.getFloorCount())
            System.out.println("This is an odd building!");
    }
}
