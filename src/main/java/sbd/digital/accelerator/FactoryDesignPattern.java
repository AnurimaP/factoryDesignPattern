package sbd.digital.accelerator;

public class FactoryDesignPattern {

    public static void main(String [] args){
        RoomFactory factory = new RoomFactory();
        Room room1;
        Room room2;
        room1 = factory.getRoom("Kitchen");
        room2 = factory.getRoom("LivingRoom");
        room1.buildRoom();
        room2.buildRoom();
    }
}
