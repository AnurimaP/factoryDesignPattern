package sbd.digital.accelerator;

public class RoomFactory {

    public Room getRoom(String room){
        if(room.equalsIgnoreCase("Kitchen")){
            return new Kitchen();
        }
        if(room.equalsIgnoreCase("LivingRoom")){
            return new LivingRoom();
        }

        return null;
    }
}
