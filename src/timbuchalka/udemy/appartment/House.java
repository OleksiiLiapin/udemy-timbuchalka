package timbuchalka.udemy.appartment;

public class House {
    private String material;
    private int storages;
    private boolean elevator;
    private int entrancesNumber;
    private Apartment flat;
    private Room room;
    private TheWindow theWindow;

    public House(String material, int storages, boolean elevator, int entrancesNumber,
                 Apartment flat, Room room, TheWindow theWindow) {
        this.material = material;
        this.storages = storages;
        this.elevator = elevator;
        this.entrancesNumber = entrancesNumber;
        this.flat = flat;
        this.room = room;
        this.theWindow = theWindow;
    }

    public String getMaterial() {
        return material;
    }

    public int getStorages() {
        return storages;
    }

    public boolean isElevator() {
        return elevator;
    }

    public int getEntrancesNumber() {
        return entrancesNumber;
    }

    public Apartment getFlat() {
        return flat;
    }

    public Room getRoom() {
        return room;
    }

    public TheWindow getTheWindow() {
        return theWindow;
    }
}
