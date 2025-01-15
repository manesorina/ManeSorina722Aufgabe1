import java.time.DateTimeException;
import java.util.Date;

public class PatientLog {

    private int id;
    private String patient;
    private String symptom;
    private String diagnosis;
    private String date;
    private String hospital;

    public PatientLog(int id, String patient, String symptom, String diagnosis, String date, String hospital) {
        this.id = id;
        this.patient = patient;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.date = date;
        this.hospital=hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital=hospital;
    }
}
