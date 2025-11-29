public class RoomReservation {
    public static void main(String[] args){


        for(int floor=1; floor<=5; floor++){

            for(int room=1; room<=10; room++) {

                System.out.print(floor *100+ room+" ");
            }

            System.out.println();
        }
    }

}
