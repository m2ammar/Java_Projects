public class StudentMarks {
    public static void main(String[] args){
        int subj1,subj2, subj3;
        subj1= 3; subj2=7; subj3=6;
        int marks;


        for(int i=1; i<=4; i++){
            System.out.print("Student "+i+": ");
            for(int j=1; j<=3; j++) {
                System.out.print(i*10 + j+5+" ");
            }System.out.println();

        }

    }

}
