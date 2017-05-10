package doctors;

public class Patient {
    private String doctor;
	private String[] words2;
    private int id;

    public Patient(String[] words2) { this.words2 = words2;}
    // overrides
    @Override
    public String toString() {
	String a = "Dr. ID: " + id + " / Doctor name: " + doctor;
	int x = 1;
	for (int i = 0; i < words2.length; i = i+2){	
		a = a + " \n 	Patient #" + x + ": " + words2[i] + " ==> " + words2[i+1];
		x++;
	}
	x = 1;
	return a;
    }
    // properties
    public void setWords(String doctor) {this.doctor = doctor; }
    public String getWords() { return this.doctor; }
    public void setId(int id) { this.id = id; }
    public int getId() { return this.id; }
}