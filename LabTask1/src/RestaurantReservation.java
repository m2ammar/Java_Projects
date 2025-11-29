public class RestaurantReservation {
    public static void main(String[] args){

        for(int i=1; i<=4; i++){
            System.out.println("Row "+i);
            for(int j=1; j<=5; j++){
                System.out.println("Table "+j);
                if(j %2==0){
                    System.out.println("Reserved");
                } else {
                    System.out.println("Available");
                }

            }
            System.out.println();
        }
    }

}
