package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static com.sun.tools.javac.util.Constants.format;

public class Main {
    public static void Erase(String Filepath){

        File filepath= new File(Filepath);

        try{
            if(!filepath.exists()) {
                final var newFile = filepath.createNewFile();
            }
            FileWriter fileWriter= new FileWriter(filepath);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Erase("test.txt");
	// create new text file and write some text to it and then read it
    File file = new File("test.txt");
    file.createNewFile();


    FileWriter fw = new FileWriter(file);


        ArrayList<String> NameAppSource = new ArrayList<>();
        ArrayList<String> NameAppDest = new ArrayList<>();
        ArrayList<String> TypeTrans = new ArrayList<>();


        NameAppSource.add("Facebook.exe");
        NameAppSource.add("Twitter.exe");
        NameAppSource.add("Instagram.exe");
        NameAppSource.add("Snapchat.exe");
        NameAppSource.add("Whatsapp.exe");
        NameAppSource.add("Google.exe");
        NameAppSource.add("Youtube.exe");
        NameAppSource.add("Linkedin.exe");
        NameAppSource.add("Gmail.exe");
        NameAppSource.add("Microsoft.exe");
        NameAppSource.add("Amazon.exe");
        NameAppSource.add("Google.exe");


        Collections.shuffle(NameAppSource);


        NameAppDest.add("Ads.exe");
        NameAppDest.add("Firebase.exe");
        NameAppDest.add("Ads.exe");
        NameAppDest.add("Firebase.exe");
        NameAppDest.add("reddit.exe");
        NameAppDest.add("Pintrest.exe");
        NameAppDest.add("Walmart.exe");
        NameAppDest.add("Costco.exe");
        NameAppDest.add("Target.exe");
        NameAppDest.add("Ebay.exe");
        NameAppDest.add("AWS.exe");
        NameAppDest.add("MongoDB.exe");


        Collections.shuffle(NameAppDest);
        ArrayList<String> data = new ArrayList<>();
        data.add("Computer");
        data.add("Phone");
        data.add("Tablet");
        data.add("Laptop");
        data.add("Smartwatch");
        data.add("Smartphone");
        data.add("Smart TV");
        data.add("Speaker");
        data.add("Headphones");
        data.add("Camera");
        data.add("Printer");
        Collections.shuffle(data);

        TypeTrans.add("DATA"+"       ");
        TypeTrans.add("LIB");
        TypeTrans.add("CONNECT");
        
        Collections.shuffle(TypeTrans);


 for (int i =0;i<3;i++)
 {
fw.write(NameAppSource.get(i) +"       "+NameAppDest.get(i)+"       "+TypeTrans.get(0)+"\n");

}
  for (int i =0;i<6;i++)
  {
 fw.write(NameAppSource.get(i)+"       "+NameAppDest.get(i)+"       "+TypeTrans.get(1)+"\n");
                                                                                                   
 }
 for (int i =0;i<8;i++)
 {
fw.write(NameAppSource.get(i)+"       "+NameAppDest.get(i)+"       "+TypeTrans.get(2)+"\n");

}



    fw.close();

    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    br.close();
    fr.close();
    }

protected void doInBackground(String String) throws IOException {
    // TODO Auto-generated method stub
    Erase("test.txt");
}


    }

