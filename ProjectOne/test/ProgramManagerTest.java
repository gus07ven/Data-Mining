import static org.junit.Assert.*;
import org.junit.Test;

public class ProgramManagerTest {

    @Test
    public void readCommandLineArgs_PassThreeArguments_ShouldReturnCorrectArgs() {
        String[] args = {"5","myDocumentsIn", "myDocsOut"};
        ProgramManager pm = new ProgramManager();

        pm.readCommandLineArgs(args);

        assertEquals("myDocumentsIn", pm.getInput_file_path());
        System.out.println(pm.getInput_file_path());
    }
}