import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFileXML="patientsLog.xml";
        String outputFileXML="result.xml";

        PatientReader reader=new PatientReader(inputFileXML,outputFileXML);
        List<PatientLog> patientLogList=reader.parse(inputFileXML);

        patientLogList.forEach(System.out::println);

    }
}