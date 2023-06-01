package com.jw.webprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {

    public static Long userIdSeq;

    public static void main(String[] args) {

        userIdSeq = 1L;

        String rootPath = System.getProperty("user.dir");
        System.out.println("root dir is " +rootPath);

        File folder = new File(rootPath + "c");

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
