package enumm;

public enum StudentGrade {

    BASARLI(1) , ORTA(2), KOTU(3);
    StudentGrade(int x){
        this.x = x;
    }

    private final  int x;


}
