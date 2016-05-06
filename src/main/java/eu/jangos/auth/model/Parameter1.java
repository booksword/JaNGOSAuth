package eu.jangos.auth.model;
// Generated 06-mai-2016 20:54:54 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Parameter1 generated by hbm2java
 */
@Entity
@Table(name="parameter1"
    ,catalog="jangosauth"
)
public class Parameter1  implements java.io.Serializable {


     private Integer id;
     private String param;
     private String val;

    public Parameter1() {
    }

    public Parameter1(String param, String val) {
       this.param = param;
       this.val = val;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="param", nullable=false, length=50)
    public String getParam() {
        return this.param;
    }
    
    public void setParam(String param) {
        this.param = param;
    }

    
    @Column(name="val", nullable=false)
    public String getVal() {
        return this.val;
    }
    
    public void setVal(String val) {
        this.val = val;
    }




}


