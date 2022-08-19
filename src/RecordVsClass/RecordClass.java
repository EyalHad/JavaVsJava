package RecordVsClass;


import java.util.ArrayList;
import java.util.List;

public class RecordClass {

    public static void start(){
        List<ThisIsRecord> recordList = new ArrayList<>();
        for (int i = 0; i < Main.SIZE ; i++) {
            String firstName = "name" + i;
            String lastName = "lastname" + i;
            double age = i + 0.5;
            long id = (long) i *2*3*7 + 1;
            recordList.add( new ThisIsRecord(firstName,lastName,age,id));
        }

        for (int i = 0; i < Main.SIZE; i++) {
            ThisIsRecord isRecord = recordList.get(i);
            if (isRecord.idNumber() == 0){
                System.out.println("This is redundant");
            }
        }
    }
public record ThisIsRecord(String firstName,
                           String lastName,
                           double age,
                           long idNumber) { }

}