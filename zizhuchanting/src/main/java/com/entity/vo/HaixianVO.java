package com.entity.vo;

import com.entity.HaixianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 海鲜表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-08
 */
@TableName("haixian")
public class HaixianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 海鲜名称
     */

    @TableField(value = "hx_types")
    private Integer hxTypes;


    /**
     * 海鲜单价 Search
     */

    @TableField(value = "money")
    private Integer money;


    /**
     * 海鲜图片
     */

    @TableField(value = "img_photo")
    private String imgPhoto;


    /**
     * 海鲜描述
     */

    @TableField(value = "haixian_content")
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
