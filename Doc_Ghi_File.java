package demo;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 
public class Doc_Ghi_File {
 
    public static void main(String[] args) throws IOException {
        String fileName = "demo.doc";                 
        try {     
            FileWriter fileWriter = new FileWriter(new File(fileName));
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("Ho va ten: Pham Trung Ky");
            bufferWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Doc_Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
         FileReader fileReader = new FileReader(new File(fileName));
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String target = "";
         target = bufferedReader.readLine();
         System.out.println(target);
        } catch ( FileNotFoundException ex){
          Logger.getLogger(Doc_Ghi_File.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
