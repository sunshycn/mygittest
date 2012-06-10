package org.huamuzhen.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "error")
public class ErrorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @XmlTransient
    private int status;
    
    @XmlElement(required = true)
    private String code;
    
    @XmlElement
    private String description;
    
    public ErrorDTO() {
        
    }

    public ErrorDTO(int status, String code, String description) {
        super();
        this.status = status;
        this.code = code;
        this.description = description;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
