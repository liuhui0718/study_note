import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/11 下午3:15
 * @Version 1.0
 */
public class Inner {



    public void readRomateFile(String romatefilename){
        URL urlfile;
        BufferedReader in;
        PrintWriter out;
        String content = "";
        String inputLine;
        try{
            urlfile = new URL(romatefilename);
            in = new BufferedReader(new InputStreamReader(urlfile.openStream()));
            inputLine = in.readLine();
            int i=0;
            while (inputLine != null){
                content += inputLine ;
                inputLine = in.readLine();
                i++;
            }
            System.out.println(i);
            in.close();
        } catch (MalformedURLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Inner of = new Inner();
        String romatefilename = "https://algo-gen.oss-cn-hangzhou.aliyuncs.com/vframe_server/backflow/video/160628034468676/f62d1a984b0d4105880e92a12bc8235e/2022-03-28-20-50-02.195.mp4";
        of.readRomateFile(romatefilename);

        
}
}
