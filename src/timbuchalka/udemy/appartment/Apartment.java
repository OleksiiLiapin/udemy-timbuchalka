package timbuchalka.udemy.appartment;

public class Apartment {
    private int floor;
    private boolean isReparing;
    private Room bedRoom;
    private Room livingRoom;
    private int roomNumber;

    public Apartment(int floor, boolean isReparing, Room bedRoom, Room livingRoom, int roomNumber) {
        this.floor = floor;
        this.isReparing = isReparing;
        this.bedRoom = bedRoom;
        this.livingRoom = livingRoom;
        this.roomNumber = roomNumber;

    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isReparing() {
        return isReparing;
    }

    public Room getBedRoom() {
        return bedRoom;
    }
    public Room getLivingRoom() {
        return livingRoom;
    }




    public int getRoomNumber() {
        return roomNumber;
    }


}
