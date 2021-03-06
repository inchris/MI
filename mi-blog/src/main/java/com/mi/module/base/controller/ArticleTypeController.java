package com.mi.module.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.base.service.IArticleTypeService;
import com.mi.module.base.entity.ArticleType;



/**
 *
 * 文章分类关联; InnoDB free: 3072 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@RestController
@RequestMapping("/base/articleType")
public class ArticleTypeController {

    @Autowired
    IArticleTypeService iArticleTypeService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public ArticleType selectById(@RequestParam String id){
        ArticleType entity = iArticleTypeService.selectById(id);
        return entity;
    }

    /** insert **/
    @RequestMapping(value = "insert")
    public void insert(){

    }

    /** delete **/
    @RequestMapping(value = "delete")
    public void delete(){

    }

    /** update **/
    @RequestMapping(value = "update")
    public void update(){

    }

}
