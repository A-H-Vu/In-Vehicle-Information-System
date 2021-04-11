package sample;

import com.csvreader.CsvReader;
import sample.*;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Summary{
    private ArrayList<VehicleData> VDA = null;
    public Summary() {

    }

    public  void   readCsv(String csvFilePath){
        try {
            //String sql="INSERT INTO app_stock_news(title,external_links,create_time,news_time,stock_code,stock_name,content) VALUES(?,?,?,?,?,?,?)";
            //PreparedStatement pStatement=con.prepareStatement(sql);

            ArrayList<String[]> csvList = new ArrayList<String[]>(); 
            this.VDA = new ArrayList<>();
            CsvReader reader = new CsvReader(csvFilePath,',', Charset.forName("gbk"));    
            reader.readHeaders();
            while(reader.readRecord()){
                csvList.add(reader.getValues());
            }
            reader.close();
            for (String [] s: csvList) {
                VDA.add(createVehicle(s));
                System.out.println(s.toString());
            }

            FileOutputStream output = new FileOutputStream("manufactureAndVinAndModel.txt");
            DataOutputStream bos = new DataOutputStream(output);
            ArrayList<VehicleData> vehicleDataArrayList = new ArrayList();
            VehicleData vehicleData = null;
            for(int row=0;row<csvList.size();row++){
                //String  cell = csvList.get(row)[0]; 
                // System.out.println(cell+"    "+ csvList.get(row)[1]+"    "+ csvList.get(row)[2]+"   "+ csvList.get(row)[3]+"    "+ csvList.get(row)[4]);
                if( csvList.get(row)[0]!=null||csvList.get(row)[1]!=null||csvList.get(row)[2]!=null
                        ||csvList.get(row)[3]!=null||csvList.get(row)[4]!=null
                        ||csvList.get(row)[5]!=null&&csvList.get(row)[6]!=null
                        ||csvList.get(row)[7]!=null&&csvList.get(row)[8]!=null
                        ||csvList.get(row)[9]!=null&&csvList.get(row)[10]!=null
                        ||csvList.get(row)[11]!=null&&csvList.get(row)[12]!=null
                        ||csvList.get(row)[13]!=null&&csvList.get(row)[14]!=null
                        ||csvList.get(row)[15]!=null&&csvList.get(row)[16]!=null
                        ||csvList.get(row)[17]!=null&&csvList.get(row)[18]!=null
                        ||csvList.get(row)[19]!=null&&csvList.get(row)[20]!=null
                ){
                    bos.writeChars(csvList.get(row)[4] + "---" + csvList.get(row)[5] + "---" + csvList.get(row)[6] + "\n");



                }else{
                    System.out.println("Invalid data");
                }
            }
            System.out.println(csvList);
            generateColorTableView(VDA);
            generateModelTableView(VDA);
            generateManufacturerTableView(VDA);
            generateYearTableView(VDA);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void generateModelTableView (List<VehicleData> list) {
        List<ModelSales> modelSalesList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            String manufacturer = list.get(i).getMake();
            String model = list.get(i).getModel();
            int count = 0;

            for (VehicleData vehicleData : list) {

                if (list.get(i).getMake().equals(vehicleData.getMake()) && list.get(i).getModel().equals(vehicleData.getModel())) {
                    count++;
                }
            }
            ModelSales sales = new ModelSales(manufacturer, model, count);
            boolean flag = true;
            for (ModelSales s : modelSalesList) {
                if (sales.getModel().equals(s.getModel())) {
                    flag = false;
                }
            }
            if (flag) {
                modelSalesList.add(sales);
            }

        }

    }
    private static void generateManufacturerTableView (List<VehicleData> list) {
        TreeMap<String,Integer> mfgSales1 = new TreeMap<>();
        List<MfgSales> mfgSalesList = new ArrayList<>();
        for (int i = 0;i<list.size();i++) {

            //mfgSales.put(list.get(i).getMake(),0);
            mfgSales1.put(list.get(i).getMake(),0);
            for (VehicleData vehicleData : list) {

                if (list.get(i).getMake().equals(vehicleData.getMake())) {
                    //int z = mfgSales.get(list.get(i).getMake());
                    int z = mfgSales1.get(list.get(i).getMake());
                    z++;
                    mfgSales1.put(list.get(i).getMake(), z);


                }
            }
        }
        mfgSales1.forEach((key,value) -> {
            MfgSales sales = new MfgSales(key,value);
            mfgSalesList.add(sales);
        });
    }
    private static void attachVehicleCounts (List<VehicleData> list) {
        TreeMap<Integer, Integer> vehicles = new TreeMap<>();
        for (int i = 0;i<list.size();i++) {

            vehicles.put(i,0);

            for (VehicleData vehicleData : list) {
                if (list.get(i).getFirstName().equals(vehicleData.getFirstName()) && list.get(i).getLastName().equals(vehicleData.getLastName())) {
                    int y = vehicles.get(i);
                    y++;
                    vehicles.put(i, y);
                }
            }

        }

        vehicles.forEach((key, value) -> list.get(key).setCount(value));
    }
    private static void generateColorTableView (List<VehicleData> list) {
        TreeMap<String,Integer> colorSales = new TreeMap<>();
        List<ColourSales> colorSalesList = new ArrayList<>();
        for (int i = 0;i<list.size();i++) {
            if (!colorSales.containsKey(list.get(i).getColor())) {
                colorSales.put(list.get(i).getColor(), 0);
            }
            for (VehicleData vehicleData : list) {
                if (list.get(i).getColor().equals(vehicleData.getColor())) {
                    int z = colorSales.get(list.get(i).getColor());
                    z++;
                    colorSales.put(list.get(i).getColor(), z);
                }
            }
        }
        colorSales.forEach((key,value) -> {
            ColourSales sales = new ColourSales(key,value);
            colorSalesList.add(sales);
        });

    }
    private static List<VehicleData> readCSVData (File file) {

        // Create a new List of Vehicle Data to temporarily store our VehicleData coming from the CSV file

        List<VehicleData> infos = new ArrayList();


        try (BufferedReader br = Files.newBufferedReader(file.toPath(),
                StandardCharsets.UTF_8)) {
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                VehicleData info = createVehicle(attributes);
                infos.add(info);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            // If the file cannot be read or is not in UTF8 encoding, throw an error and print the Stack Trace
            ioe.printStackTrace();
        }

        return infos;
    }

    private static VehicleData createVehicle(String[] metadata) {

        // Parse the CSV file into parameters for initializing a VehicleData Class
       

        String firstName = metadata[1];
        String lastName = metadata[2];
        String email = metadata[3];
        String VIN = metadata[4];
        String make = metadata[5];
        String model = metadata[6];
        String color = metadata[8];
        String plateNumber = metadata[9];

        int id = Integer.parseInt(metadata[0]);
        int modelYear = Integer.parseInt(metadata[7]);
        int year1 = Integer.parseInt(metadata[10]);
        int odo1 = Integer.parseInt(metadata[11]);
        int year2 = Integer.parseInt(metadata[12]);
        int odo2 = Integer.parseInt(metadata[13]);
        int year3 = Integer.parseInt(metadata[14]);
        int odo3 = Integer.parseInt(metadata[15]);
        int year4 = Integer.parseInt(metadata[16]);
        int odo4 = Integer.parseInt(metadata[17]);
        int year5 = Integer.parseInt(metadata[18]);
        int odo5 = Integer.parseInt(metadata[19]);

        return new VehicleData(id, firstName,lastName,email,VIN,make,model,modelYear,color,plateNumber,year1,odo1,year2,odo2,year3,odo3,year4,odo4,year5,odo5);
    }
    private static void generateYearTableView(List<VehicleData> list) {
        // Map<Integer,Integer> yearSales = new HashMap<>();

        TreeMap<Integer,Integer> yearSales = new TreeMap<>();

        List<YearSales> yearSalesList = new ArrayList<>();

        // Filter through the list of VehicleData and check to see how many vehicles math the modelYear property
        // Add this value to the count and finally add the year and count to the yearSalesList
        for (int i = 0;i<list.size();i++) {

            yearSales.put(list.get(i).getModelYear(),0);
            for (VehicleData vehicleData : list) {
                if (list.get(i).getModelYear() == vehicleData.getModelYear()) {
                    int z = yearSales.get(list.get(i).getModelYear());
                    z++;
                    yearSales.put(list.get(i).getModelYear(), z);
                }
            }
        }
        // For each value in the Hash Map of Year, Count, add the value at n to a List
        yearSales.forEach((key,value) -> {
            YearSales sales = new YearSales(key,value);
            yearSalesList.add(sales);
        });

        // This stores how many vehicles exist of each year
        // Initialize the Year Table


    }



}