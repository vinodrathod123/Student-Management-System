public class Student {
    private int studID;
    private String studName;
    private int studAge;
    private String studCourse;

    public Student(int studID, String studName, int studAge, String studCourse){
        this.studID = studID;
        this.studName = studName;
        this. studAge = studAge;
        this.studCourse = studCourse;
    }

    public int getStudID(){
        return studID;
    }

    public void setStudName(String studName){
        this.studName = studName;
    }

    public void setStudAge(int studAge){
        this.studAge = studAge;
    }

    public void setStudCourse(String studCourse){
        this.studCourse = studCourse;
    }

    public String toString(){
        return studID + "\t" + studName + "\t" + studAge + "\t" + studCourse;
    }
}
