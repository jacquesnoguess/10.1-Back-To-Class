public class Freshman extends HighSchoolStudent{
    protected int myNewFriends;
    public Freshman(String name, int age, String gender, String idNum, double gpa, String academy, int year, int newFriends){
        super(name,age,gender,idNum,gpa,academy,year);
        myNewFriends = newFriends;
    }//getters
    public int getNewFriends(){
        return myNewFriends;
    }//setters
    public void setNewFriends(int newFriends){
        myNewFriends = newFriends;
    }//tostring
    public String toString(){ 
		return super.toString() + ", Number of New Friends: "+ myNewFriends; 
	}//methods
    public void goofOff(){
        System.out.println("I hate going to class! I'd rather hang out with my "+myNewFriends+" new friends!");
    }
    
}
