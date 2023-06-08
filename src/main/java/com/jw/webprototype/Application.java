package com.jw.webprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {

    public static Long userSeq, boardId, commentId, itemId = 1L;
    public static final String ROOT_PATH = System.getProperty("user.dir");
    public static final String FILE_UPLOAD_PATH = "/src/main/resources/static/uploads/";

    public static void main(String[] args) {

        File folder = new File(ROOT_PATH + FILE_UPLOAD_PATH);

        if(folder.isDirectory()){

            System.out.println("디렉토리가 존재하여 삭제 후 재 생성합니다.");

            File[] folder_list = folder.listFiles(); //파일리스트 얻어오기

            for (int j = 0; j < folder_list.length; j++) {
                folder_list[j].delete(); //파일 삭제
                System.out.println("파일이 삭제되었습니다.");
            }

            folder.delete();

            folder.mkdirs();
        }else {
            System.out.println("디렉토리를 생성합니다.");
            folder.mkdirs();
        }

        SpringApplication.run(Application.class, args);
    }

}
