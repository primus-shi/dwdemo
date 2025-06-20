package com.example.demo.controller;

import com.example.demo.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

@RestController
public class FileUpload {
    @RequestMapping("/fileUpload")
    public Map<String, Object> fileUpload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        if (multipartFile.isEmpty()) {
            return null;
        }
        //设置的是上传文件的路径
        Path uploadPathDir = Paths.get("D:/upload");
        //对文件夹进行判断，如果文件夹不存在，那么使用java中的file类命令，在系统中创建对应的文件
        if (!Files.exists(uploadPathDir)) {
            Files.createDirectories(uploadPathDir);
        }
        //根据multipartFile能够获取到所上传文件的文件名
        String originalFilename = multipartFile.getOriginalFilename();//ikun.png
        String newFileName = UUID.randomUUID().toString() + originalFilename;//生成一个随机字符串 dad545x236_x2232652ikun.png
        //上传目录和上传的文件进行关联
        Path resolve = uploadPathDir.resolve(newFileName);
        File file = resolve.toFile();
        //把上传的文件保存到目录中
        multipartFile.transferTo(file);
        return Result.success("/upload/" + newFileName);
    }
}



