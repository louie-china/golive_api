package com.golive.config.api.model;


import com.louie.mapper.BaseEO;
import com.louie.mapper.Generate;
import com.louie.mapper.Id;
import com.louie.mapper.Table;

/**
 * Created by Administrator on 2016/5/4.
 */
@Table(name = "b_system_publicnumber")
public class PublishNumber extends BaseEO {
    @Id
    @Generate
    private Long ID;
    private String Name;
    private String BarCode;
    private String Logo;
    private Integer Type;
    private String LanguageCode;
    private Integer Status;
    private String Description;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public String getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(String languageCode) {
        LanguageCode = languageCode;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
