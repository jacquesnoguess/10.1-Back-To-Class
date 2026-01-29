public class HighSchoolStudent extends Student{
    protected String myAcademy;
    protected int myYear;
    //constructor
    public HighSchoolStudent(String name, int age, String gender, String idNum, double gpa, String academy, int year){
        super(name, age, gender, idNum, gpa);
        myAcademy = academy;
        myYear = year;
    }//getters
    public String getAcademy(){
        return myAcademy;
    }public int getYear(){
        return myYear;
    }//setters
    public void setAcademy(String academy){
        myAcademy = academy;
    }public void setYear(int year){
        myYear = year;
    }//tostring
    public String toString(){ 
		return super.toString() + ", Academy: " + myAcademy + ", Year: " + myYear; 
	} 
}
