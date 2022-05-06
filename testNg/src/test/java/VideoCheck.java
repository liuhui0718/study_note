import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.opencv.global.opencv_core;
import org.bytedeco.opencv.opencv_core.IplImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/26 上午11:14
 * @Version 1.0
 */
public class VideoCheck {

    public static void main(String[] args) throws Exception {
        String url = "http://mgc-video-store.oss-cn-hangzhou.aliyuncs.com/mix/2021-09-06/concat/399b1c49241a41f3be7eaa2b1289de4a.mp4";
//        String url =  System.getProperty("user.dir")+"src/main/resources/210830.mp4";
        randomGrabberFFmpegImage(url, "/study_notes/testNg/src/test", "pic");
    }

    /**
     *
     * @param filePath 视频路径
     * @param targerFilePath 第一帧图片存储位置
     * @param targetFileName 图片名称
     * @throws Exception
     */
    public static void randomGrabberFFmpegImage(String filePath, String targerFilePath, String targetFileName)
            throws Exception {

        FFmpegFrameGrabber ff = FFmpegFrameGrabber.createDefault(filePath);

        ff.start();
        String rotate =ff.getVideoMetadata("rotate");
        int ffLength = ff.getLengthInFrames();
        Frame f;
        int i = 0;
        int index = 1;
        IplImage src = null;

        while (i <=index) {
            f =ff.grabImage();
            if(i==index){
                if(null != rotate && rotate.length() == index) {
                    OpenCVFrameConverter.ToIplImage converter =new OpenCVFrameConverter.ToIplImage();
                    src =converter.convert(f);
                    f =converter.convert(rotate(src, Integer.valueOf(rotate)));
                }
                doExecuteFrame(f,targerFilePath,targetFileName);
            }
            i++;
        }
        ff.stop();
    }

    /**
     * 旋转角度,保证截取到的图和视频中的旋转信息一致
     *
     * @return*/
    public static IplImage rotate(IplImage src, int angle) {
        IplImage img = IplImage.create(src.height(), src.width(), src.depth(), src.nChannels());
        opencv_core.cvTranspose(src, img);
        opencv_core.cvFlip(img, img, angle);
        return img;
    }

    public static void doExecuteFrame(Frame f, String targerFilePath, String targetFileName) {
        if (null ==f ||null ==f.image) {
            return;
        }
        Java2DFrameConverter converter =new Java2DFrameConverter();
        String imageMat ="jpg";
        String FileName =targerFilePath + File.separator +targetFileName +"." +imageMat;
        BufferedImage bi =converter.getBufferedImage(f);
        File output =new File(FileName);
        try {
            ImageIO.write(bi,imageMat,output);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
