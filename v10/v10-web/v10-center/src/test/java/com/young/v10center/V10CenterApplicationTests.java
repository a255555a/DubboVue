package com.young.v10center;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
@RunWith(SpringRunner.class)
class V10CenterApplicationTests {

    @Autowired
    private FastFileStorageClient client;

    @Test
    void contextLoads() {

    }

    @Test
    public void upload() throws FileNotFoundException {

        File file =new File("D:\\IdeaWorkPlaces\\DubboVue\\v10\\v10-web\\v10-center\\src\\main\\resources\\static\\images\\girl.jpg");
        FileInputStream fileInputStream =new FileInputStream(file);
        StorePath storePath = client.uploadImageAndCrtThumbImage(fileInputStream, file.length(), "jpg", null);
        System.out.println(storePath.getFullPath());
        System.out.println(storePath.getGroup());
        System.out.println(storePath.getPath());

    }

    @Test
    public void delete(){

        client.deleteFile("group1/M00/00/00/wKhAg2BBptKAEVtdAABIsa5AZlE350.jpg");
        System.out.println("ok!");
    }

}
