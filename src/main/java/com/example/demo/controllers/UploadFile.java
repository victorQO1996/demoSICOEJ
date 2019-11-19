package com.example.demo.controllers;

import com.example.demo.services.UploadFileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
/*
@Controller
public class UploadFile {

    @Autowired
    private UploadFileServices uploadFileService;

    @GetMapping("/")
    public String index() {

        return "subirArchivos";
    }

    @PostMapping("upload")

    public ResponseEntity<?> uploatFile(@RequestParam("file")MultipartFile file){
    if(file.isEmpty()){
        return  new ResponseEntity<Object>("Seleccionar un archivo", HttpStatus.OK);
    }
    try{
        uploadFileService.saveFile(file);
    } catch (IOException e) {
        e.printStackTrace();
    }
        return  new ResponseEntity<Object>("Archivo subido correctamente", HttpStatus.OK);
    }


}
*/
