package throwsExceptionPre;

import java.io.*;

public class ThrowsPre {

    // 1. try 대신 throws IOException 작성 개꿀팁
    public void method1() throws IOException {
        String path = System.getProperty("user.home")+"/Desktop/";
        String filename = "여행지도";
        String extName = ".docs"; // docs 파일로 만들예정
        //            C://User//user1/Desktop/여행지도.docs
        File f = new File(path+filename+extName);

        f.createNewFile();
        System.out.println("파일 생성이 완료되었습니다");

        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        String content = "안녕하세요";
        bw.write(content);
        bw.close();
    }

    // 2. try 대신 throws Exception 작성하고 에러 확인하기
    public void method2() throws IOException {
        FileReader fr = new FileReader(System.getProperty("user.home")+"/Desktop/"+"여행지도"+".docs");
        String line = fr.toString();
        System.out.println(line);
    }
}
