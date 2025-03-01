//NOTE: Read data from user.
//QNO 1:-
//
// Hospital Patient Management System
//Scenario: A hospital maintains a list of patients using an ArrayList. Each patient has a patient ID, name, disease, and age. Implement:
//
//Adding new patients
//Displaying all patient records
//Searching for patients by disease
//Removing a discharged patient by ID
//Finding the youngest patient

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient{

    private int patientId ;
    private String patientName;
    private String disesase;

    public Patient(int patientId, String patientName, String disesase) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.disesase = disesase;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDisesase() {
        return disesase;
    }

    public void setDisesase(String disesase) {
        this.disesase = disesase;
    }
//    void displayAll() {
//        System.out.println("Patient Id "+patientId+" Patient Name "+patientName+" Diseases of Patient "+disesase);
//    }


    @Override
    public String toString() {
        return "Patient {" +
                ", patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                "disesase='" + disesase + '\'' +
                '}'+"\n";

    }
}
class Hospital{
    Scanner sc = new Scanner(System.in);

    List<Patient> patientDetails = new ArrayList<Patient>();
    public Patient addNewPatient(String patientName, int patientId, String disease ){
        System.out.println("Enter patient Name ");
        patientName = sc.nextLine();
        System.out.println("Enter patient Id ");
        patientId=sc.nextInt();
        System.out.println("Enter patient Disease");
        disease = sc.nextLine();
        patientDetails.add(addNewPatient(patientName,patientId,disease));
        System.out.println();


        return null;
    }
    public void patientSearchByDisease(String disease){

        for(Patient pat : patientDetails){
           if(pat.getDisesase().equalsIgnoreCase(disease)){
               System.out.println("No Patient found");
           }
           else{
               System.out.println("Patient is suffering from "+disease +" :"+pat.getPatientName());
           }
        }
    }

    public void addNewPatient() {

    }
}


public class Q1Scene {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entr Your list size");
        int size = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter the details of Patient");
        Hospital h1 = new Hospital();
        h1.addNewPatient();


    }

}
