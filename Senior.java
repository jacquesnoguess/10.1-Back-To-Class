public class Senior extends HighSchoolStudent{
    protected String myCar;
    public Senior(String name, int age, String gender, String idNum, double gpa, String academy, int year, String car){
        super(name,age,gender,idNum,gpa,academy,year);
        myCar = car;
    }//getters
    public String getCar(){
        return myCar;
    }//setters
    public void setCar(String car){
        myCar = car;
    }//tostring
    public String toString(){ 
		return super.toString() + ", My car: "+ myCar; 
	}//methods
    public void cutClass(){
        System.out.println("I hate going to class! I'd rather drive away in my "+myCar+"!");
    }
}
