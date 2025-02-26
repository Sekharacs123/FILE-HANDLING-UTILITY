import java.io.*;
class FileHandling {
    public static void main(String[] args)
     {
        try {
            FileWriter fw = new FileWriter("D://hello.txt");
            fw.write("PYTHON PROGRAMMING INTERNSHIP");
            fw.close();
            System.out.println("File written successfully.");
        } catch (Exception h) 
        {
            h.printStackTrace();
        }
        StringBuilder content = new StringBuilder();
        try {
            FileReader fr = new FileReader("D://hello.txt");
            BufferedReader bfr = new BufferedReader(fr);
            String code;
            while ((code = bfr.readLine()) != null) {
                content.append(code);
            }
            bfr.close();
        } catch (Exception s) {
            s.printStackTrace();
        }
        String changing = content.toString().replace("PYTHON", "JAVA");
        try {
            FileWriter fw = new FileWriter("D://hello.txt");
            fw.write(changing);
            fw.close();
            System.out.println("File changed successfully.");
        } catch (Exception t) {
            t.printStackTrace();
        }
        try {
            FileReader fr = new FileReader("D://hello.txt");
            int i;
            System.out.println("reading file content:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i); 
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
