public class Education {
    long id;
    String instituteName;
    String courseName;
    String year;
    String stream;
    boolean ishavingBacklog;
    float percentage;
    String university;
    public static void main(String[] args) {
        Education student1 = new Education();
        student1.id = 1;
        student1.instituteName = "S.BJain";
        student1.year = "4th";
        student1.stream = "CSE";
        student1.ishavingBacklog = false;
        student1.percentage = 84.8f;
        student1.university = "RTMNU";
        System.out.println(student1.id);

    }
}