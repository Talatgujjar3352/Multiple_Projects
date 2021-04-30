
package encapsulation;


public class Encapsulation {

    private int studentId;
    private String studentName;
    private int studentAge;
    
    public int getStudentId(){
        return studentId;
    
}
    public String getStudentName(){
        return studentName;
    }
    
    public int getStudentAge(){
        return studentAge;
    }
    
    
    public void setStudentId(int newValue){
        studentId = newValue;
    }
    
    public void setStudentName(String newValue ){
       studentName = newValue; 
    }
    
    public void setStudentAge(int newValue){
        studentAge = newValue;
    }
    
    
    public static void main(String[] args) {
        Encapsulation stu = new Encapsulation();
        
        stu.setStudentId(2019027050);
        stu.setStudentName("Talat");
        stu.setStudentAge(22);
        
        System.out.println("Student Id: "  + stu.getStudentId());
        System.out.println("Student Name:" + stu.getStudentName() );
        System.out.println("Studnet Age:"  + stu.getStudentAge());
        
        
       
    }
    
}
