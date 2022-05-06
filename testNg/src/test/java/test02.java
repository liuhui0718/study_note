import java.io.File;
import java.util.List;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/12 上午11:17
 * @Version 1.0
 */
public class test02 {

//    ffmpeg -i input.mp4 -r 10 image%02d.png
    //生成视频文件的首帧为图片
//windows下的版本
        // public static final String FFMPEG_PATH = "E:/ffmpeg/ffmpeg.exe";
        public static boolean processImg(String veido_path, String ffmpeg_path) {
            File file = new File(veido_path);
            if (!file.exists()) {
                System.err.println("路径[" + veido_path + "]对应的视频文件不存在!");
                return false;
            }
            List<String> commands = new java.util.ArrayList<String>();
            commands.add(ffmpeg_path);
            commands.add("-i");
            commands.add(veido_path);
            commands.add("-y");
            commands.add("-f");
            commands.add("image2");
            commands.add("-ss");
            commands.add("8");// 这个参数是设置截取视频多少秒时的画面
             commands.add("-t");
             commands.add("0.001");
            commands.add("-s");
            commands.add("1080x1920");
//            commands.add(ffmpeg_path);
//            commands.add("i");
//            commands.add(veido_path);
//            commands.add("-r");
//            commands.add("1");
//            commands.add("image%02d.png");
            commands.add(veido_path.substring(0, veido_path.lastIndexOf("."))
                    .replaceFirst("vedio", "file") + ".jpg");
            try {
                ProcessBuilder builder = new ProcessBuilder();
                System.out.println(builder.command(commands));
                builder.start();
                System.out.println("截取成功");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        public static void main(String[] args) {
            processImg("/Users/liuhui/Desktop/share_08d5cc2b9a50d63ae587608d4b815b27.mp4", "/Users/liuhui/Programe/ffmpeg/ffmpeg");
        }

}
