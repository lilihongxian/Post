package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;
import com.baizhi.service.BannerService;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by admin on 2018/7/8.
 */
@RestController
@RequestMapping("/Banner")
public class BannerController{

    @Autowired
    private BannerService bannerService;

    @RequestMapping("QueryAll")
    public BannerDto QueryAll(int page, int rows){
        return bannerService.querySplit(page, rows);
    }

    @RequestMapping("Add")
    public void Add(MultipartFile bannerPicpath, String bannerStatus,String bannerDescription,HttpServletRequest request){
        String realPath = request.getSession().getServletContext().getRealPath("/");
        realPath = realPath + "banner";
        File file1 = new File(realPath);
        if(!file1.exists()){
            file1.mkdir();
        }
        String originalFilename = bannerPicpath.getOriginalFilename();
        String extension = FilenameUtils.getExtension(originalFilename);
        UUID uuid = UUID.randomUUID();
        String newName1 = uuid + "." + extension;
        String newName = realPath + "/" + newName1;
        try {
            bannerPicpath.transferTo(new File(newName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Banner banner = new Banner();
        banner.setBannerPicname(newName1);
        banner.setBannerDescription(bannerDescription);
        banner.setBannerPicpath(newName);
        banner.setBannerStatus(bannerStatus);
        bannerService.regist(banner);

    }

    @RequestMapping("Update")
    public void Update(Banner banner){
        bannerService.change(banner);
    }

    @RequestMapping("Delete/{id}")
    public void Delete(@PathVariable("id") String bannerId){
        bannerService.drop(bannerId);
    }

}
