package com.baizhi.controller;

import com.baizhi.conf.MsgQueue;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.MapDto;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by admin on 2018/7/10.
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("QueryWeek")
    public List<Integer> QueryWeek(){
        return userService.queryWeek(new int[]{7,14,21});
    }


    @RequestMapping("QueryPri")
    public Map<String,List<MapDto>> QueryPri(){
        return userService.queryPri();
    }

    //导出，下载
    @RequestMapping("PoiExport")
    public void PoiExport(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //构建excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        //设置日期格式
        DataFormat dataFormat = workbook.createDataFormat();
        short format = dataFormat.getFormat("yyyy年MM月dd天");
        CellStyle cellStyle1 = workbook.createCellStyle();
        cellStyle1.setDataFormat(format);
        //构建居中样式
        CellStyle cellStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        font.setColor(Font.COLOR_RED);
        font.setFontName("楷体");
        cellStyle.setFont(font);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        //创建表
        Sheet sheet = workbook.createSheet("user");
        sheet.setColumnWidth(11, 28 * 256);
        //创建行      行 下标
        String[] titles = {"编号", "头像", "法名","名字", "性别","省份","城市","签名","电话","密码", "盐","生日","状态"};
        Row row = sheet.createRow(0);
        //构建标题    单元格下标
        for (int i = 0; i < titles.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(titles[i]);
        }
        List<User> users = userService.queryAll();
        for (int i = 0; i < users.size(); i++) {
            Row row1 = sheet.createRow(i + 1);
            row1.createCell(0).setCellValue(users.get(i).getUserId());
            row1.createCell(1).setCellValue(users.get(i).getUserPhoto());
            row1.createCell(2).setCellValue(users.get(i).getUserDharmaname());
            row1.createCell(3).setCellValue(users.get(i).getUserName());
            row1.createCell(4).setCellValue(users.get(i).getUserSex());
            row1.createCell(5).setCellValue(users.get(i).getUserPrivoince());
            row1.createCell(6).setCellValue(users.get(i).getUserCity());
            row1.createCell(7).setCellValue(users.get(i).getUserSign());
            row1.createCell(8).setCellValue(users.get(i).getUserPhonenum());
            row1.createCell(9).setCellValue(users.get(i).getUserPasswrod());
            row1.createCell(10).setCellValue(users.get(i).getUserSalt());

            row1.createCell(12).setCellValue(users.get(i).getUserStatus());


            Cell cell = row1.createCell(11);
            cell.setCellStyle(cellStyle1);
            cell.setCellValue(users.get(i).getUserCteatetime());
        }
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = dateFormat.format(date);
        format1 = format1 + ".xls";
        String aa = null;
        try {
            aa = new String(format1.getBytes("UTF-8"), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setHeader("content-disposition", "attachment;filename=" + aa);
        response.setContentType("application/vnd.ms-excel");

        try {
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //导入并插入数据库
    @RequestMapping("PoiImport")
    public void poiImport(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        Workbook workbook = new HSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet("user");
        List<User> list=new ArrayList<>();
        for (int i = 1; i <=sheet.getLastRowNum();i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);
            String id = cell.getStringCellValue();

            User user = new User();
            user.setUserId(id);
            list.add(user);
        }
        for (User user : list) {
            System.out.println(user);
        }

    }

    @RequestMapping("QueryAll")
    public List<User> QueryAll(){
        return userService.queryAll();
    }

    @RequestMapping("GoEasyWeek")
    public void GoEasyWeek() {
        MsgQueue.save(userService.queryWeek(new int[]{7,14,21}));
    }


}
