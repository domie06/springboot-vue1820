package com.entity.model;

import com.entity.HaixianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 海鲜表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-08
 */
public class HaixianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 海鲜名称
     */
    private Integer hxTypes;


    /**
     * 海鲜单价 Search
     */
    private Integer money;


    /**
     * 海鲜图片
     */
    private String imgPhoto;


    /**
     * 海鲜描述
     */
    private String haixianContent;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：海鲜名称
	 */
    public Integer getHxTypes() {
        return hxTypes;
    }


    /**
	 * 获取：海鲜名称
	 */

    public void setHxTypes(Integer hxTypes) {
        this.hxTypes = hxTypes;
    }
    /**
	 * 设置：海鲜单价 Search
	 */
    public Integer getMoney() {
        return money;
    }


    /**
	 * 获取：海鲜单价 Search
	 */

    public void setMoney(Integer money) {
        this.money = money;
    }
    /**
	 * 设置：海鲜图片
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：海鲜图片
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：海鲜描述
	 */
    public String getHaixianContent() {
        return haixianContent;
    }


    /**
	 * 获取：海鲜描述
	 */

    public void setHaixianContent(String haixianContent) {
        this.haixianContent = haixianContent;
    }

    }
