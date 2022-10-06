import java.io.*;
public class No2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in1 = new BufferedReader(new FileReader("src/first.txt"));
        BufferedReader in2 = new BufferedReader(new FileReader("src/second.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/third.txt"));
        try{
            String f="";
            String s="";
            while(true){
                String line = in1.readLine();
                if(line==null) break;
                f = line;
            }
            while(true){
                String line = in2.readLine();
                if(line==null)break;
                s = line;
            }
            String[] first = f.split(" ");
            String[] second = s.split(" ");
            String third = "";
            for(int i = 0; i<first.length;i++){
                for(int j=0; j<second.length;j++){
                    if(first[i].equals(second[j])){
                        third = third + second[j] +" ";
                    }
                }
            }
            out.write(third);
        }finally{
                if(in1!=null){
                    in1.close();
                }
                if(in2!=null){
                    in2.close();
                }
                if(out!=null){
                    out.close();
            }
        }
    }
}
