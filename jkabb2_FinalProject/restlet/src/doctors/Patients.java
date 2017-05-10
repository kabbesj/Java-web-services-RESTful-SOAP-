package doctors;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Patients {
    private static CopyOnWriteArrayList<Patient> patients;
    private static AtomicInteger id;

    static {
	String[ ] doctorsPatients = 
	    {	"JimDr!3!KimSick!CC123!EmilySick!CC456!JackSick!CC789",
			"JohnDr!2!RoseSick!CC111!LouSick!CC222"};
			
			

	
	patients = new CopyOnWriteArrayList<Patient>();
	id = new AtomicInteger();
	for (String str : doctorsPatients) add(str);
	
	
    }

    public static String toPlain() {
	String retval = "";
	int i = 1;
	for (Patient patient : patients) retval += patient.toString() + "\n";
	return retval;
    }
    
    public static CopyOnWriteArrayList<Patient> getList() { return patients; }
	
	

    // Support GET one operation.
    public static Patient find(int id) {
	Patient patient = null;
	for (Patient a : patients) {
	    if (a.getId() == id) {
		patient = a;
		break;
	    }
	}	
	
	return patient;
    }

    // Support POST operation.
    public static void add(String doctor) {
	String[] parts = doctor.split("!");
	int x = parts.length;
	String[ ] array = new String[parts.length - 2];
	for (int i = 2; i < parts.length; i++) {
		array[i-2] = parts[i];
   }
	Patient patient = new Patient(array);
	patient.setWords(parts[0]);
	patient.setId(Integer.parseInt(parts[1]));
	patients.add(patient);
    }
}
