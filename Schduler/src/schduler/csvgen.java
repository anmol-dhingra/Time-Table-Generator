package schduler;
import java.io.*;
public class csvgen {
    public static void CsvFilebug(String sFileName)
   {
	try
	(FileWriter w = new FileWriter(sFileName)) { 
	    w.append("DAY/TIME SLOT");
	    w.append(',');
	    w.append("Time(8-10)");
            w.append(',');
	    w.append("Time(10-12)");
            w.append(',');
	    w.append("Time(1-3)");
            w.append(',');
	    w.append("Time(3-5)");
	    w.append('\n');
	    w.append("MONDAY");
            w.append('\n');
            w.append("TUESDAY");
	    w.append(',');
	    w.append("COE9");
            w.append(',');
	    w.append("CML1");
            w.append(',');
	    w.append("CML2");
            w.append(',');
	    w.append("CML3");
            w.append('\n');
            w.append("WEDNESDAY");
	    w.append(',');
	    w.append("CAG1");
            w.append(',');
	    w.append("CAG2");
            w.append('\n');
            w.append("THURSDAY");
	    w.append(',');
	    w.append("COE5");
            w.append(',');
	    w.append("COE6");
            w.append('\n');
            w.append("COE7");
            w.append(',');
            w.append("COE8");
            w.append('\n');
            w.append("FRIDAY");
            w.append(',');
            w.append("COE1");
            w.append(',');
            w.append("COE2");
            w.append(',');
            w.append("COE3");
            w.append(',');
            w.append("COE4");
            w.append('\n');	
	    w.flush();
	}
	catch(IOException e)
	{
	}
    }
    public static void CsvFilena(String sFileName)
   {
	try
	(FileWriter w = new FileWriter(sFileName)) { 
	    w.append("DAY/TIME SLOT");
	    w.append(',');
	    w.append("Time(8-10)");
            w.append(',');
	    w.append("Time(10-12)");
            w.append(',');
	    w.append("Time(1-3)");
            w.append(',');
	    w.append("Time(3-5)");
	    w.append('\n');
	    w.append("MONDAY");
	    w.append(',');
	    w.append("COE1");
            w.append(',');
	    w.append("COE2");
            w.append(',');
	    w.append("COE3");
            w.append(',');
	    w.append("COE4");
            w.append('\n');
            w.append("TUESDAY");
	    w.append(',');
	    w.append("COE5");
            w.append(',');
	    w.append("COE6");
            w.append(',');
	    w.append("COE7");
            w.append(',');
	    w.append("COE8");
            w.append('\n');
            w.append("WEDNESDAY");
	    w.append(',');
	    w.append("COE9");
            w.append(',');
	    w.append("CML1");
            w.append(',');
	    w.append("CML2");
            w.append(',');
	    w.append("CML3");
            w.append('\n');
            w.append("THURSDAY");
	    w.append(',');
	    w.append("CAG1");
            w.append(',');
	    w.append("CAG2");
            w.append('\n');
            w.append("FRIDAY");
            w.append('\n');	
	    w.flush();
	}
	catch(IOException e)
	{
	} 
    }
    public static void CsvFileds1(String sFileName)
   {
	try
	(FileWriter w = new FileWriter(sFileName)) { 
	    w.append("DAY/TIME SLOT");
	    w.append(',');
	    w.append("Time(8-10)");
            w.append(',');
	    w.append("Time(10-12)");
            w.append(',');
	    w.append("Time(1-3)");
            w.append(',');
	    w.append("Time(3-5)");
	    w.append('\n');
	    w.append("MONDAY");
            w.append(',');
	    w.append("COE5");
            w.append(',');
            w.append("COE7");
            w.append(',');
            w.append("COE9");
            w.append(',');
            w.append("CML2");
            w.append('\n');
            w.append("TUESDAY");
	    w.append(',');
	    w.append("COE1");
            w.append(',');
	    w.append("COE3");
            w.append(',');
	    w.append("CAG1");
            w.append('\n');
            w.append("WEDNESDAY");
	    w.append(',');
	    w.append("COE6");
            w.append(',');
	    w.append("COE8");
            w.append('\n');
            w.append("THURSDAY");
	    w.append(',');
	    w.append("COE2");
            w.append(',');
	    w.append("COE4");
            w.append('\n');
            w.append("CML1");
            w.append(',');
            w.append("CML3");
            w.append('\n');
            w.append("FRIDAY");
            w.append(',');
            w.append("CAG2");
            w.append('\n');	
	    w.flush();
	}
	catch(IOException e)
	{
	}
    }
        public static void CsvFileds2(String sFileName)
   {
	try
	(FileWriter w = new FileWriter(sFileName)) { 
	    w.append("DAY/TIME SLOT");
	    w.append(',');
	    w.append("Time(8-10)");
            w.append(',');
	    w.append("Time(10-12)");
            w.append(',');
	    w.append("Time(1-3)");
            w.append(',');
	    w.append("Time(3-5)");
	    w.append('\n');
	    w.append("MONDAY");
            w.append(',');
	    w.append("COE6");
            w.append(',');
            w.append("COE8");
            w.append(',');
            w.append("CML1");
            w.append(',');
            w.append("CML3");
            w.append('\n');
            w.append("TUESDAY");
	    w.append(',');
	    w.append("COE2");
            w.append(',');
	    w.append("COE4");
            w.append(',');
	    w.append("CAG2");
            w.append('\n');
            w.append("WEDNESDAY");
	    w.append(',');
	    w.append("COE5");
            w.append(',');
	    w.append("COE7");
            w.append('\n');
            w.append("THURSDAY");
	    w.append(',');
	    w.append("COE1");
            w.append(',');
	    w.append("COE3");
            w.append('\n');
            w.append("COE9");
            w.append(',');
            w.append("CML2");
            w.append('\n');
            w.append("FRIDAY");
            w.append(',');
            w.append("CAG1");
            w.append('\n');	
	    w.flush();
	}
	catch(IOException e)
	{
	}
    }
}
