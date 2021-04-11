package sample;


import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.nio.Buffer;
import java.sql.SQLOutput;

public class App {
    public static void main(String [] args) throws IOException {



        long startTime = System.currentTimeMillis(); //get start time
        Summary summary = new Summary();
        summary.readCsv("VehicleInformation.csv");
        long endTime = System.currentTimeMillis(); //get end time
        MemoryMXBean bean = ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryUsage = bean.getHeapMemoryUsage();


        String usage = "Usage:" + memoryUsage.getUsed() + "byte" ;
        String runTime = "RunTime： " + (endTime - startTime) + "ms";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("outputExample/runTimeAndUsage.txt"));
            bw.write(usage);
            bw.newLine();
            bw.write(runTime);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }finally{
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
