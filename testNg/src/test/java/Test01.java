import lombok.SneakyThrows;
import org.bytedeco.javacpp.Loader;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/11 下午2:34
 * @Version 1.0
 */
public class Test01 {

    /**
     * 史上最简单的方式调用javacv中的ffmpeg本地程序
     *
     * @author eguid
     */

    @SneakyThrows
    @Test
    public void test01() {
        // String ffmpeg = Loader.load(org.bytedeco.ffmpeg.ffmpeg.class);
//        System.out.println(ffmpeg);
//
////        ProcessBuilder pb = new ProcessBuilder(ffmpeg, "-i", "/path/to/input.mp4", "-vcodec", "h264", "/path/to/output.mp4");
////        pb.inheritIO().start().waitFor();
//
//        String url = "https://algo-gen.oss-cn-hangzhou.aliyuncs.com/vframe_server/backflow/video/160628034468676/f62d1a984b0d4105880e92a12bc8235e/2022-03-28-20-53-44.148.mp4";
//
//        String cmd = "ffmpeg -i /Users/liuhui/Desktop/share_08d5cc2b9a50d63ae587608d4b815b27.mp4 r 1 -q:v 2 -f /Users/liuhui/Desktop/nw.jpg";
//        try {
//            Process process = new ProcessBuilder(cmd).start();
//            process.waitFor();
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
            String ffmpeg = Loader.load(org.bytedeco.ffmpeg.ffmpeg.class);
            ProcessBuilder pb = new ProcessBuilder(ffmpeg, "-i", "/Users/liuhui/Desktop/share_08d5cc2b9a50d63ae587608d4b815b27.mp4", "-vcodec", "h264", "/Users/liuhui/Desktop/nw.jpg");
            pb.inheritIO().start().waitFor();


        }




    public void files(String romatefilename) {
        URL urlfile;
        BufferedReader in;
        PrintWriter out;
        String content = "";
        String inputLine;
        try {
            urlfile = new URL(romatefilename);
            in = new BufferedReader(new InputStreamReader(urlfile.openStream()));
            inputLine = in.readLine();
            int i = 0;
            while (inputLine != null) {
                content += inputLine;
                inputLine = in.readLine();
                i++;
            }
            System.out.println(i);
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}