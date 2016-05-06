package eu.jangos.auth.model;
// Generated 06-mai-2016 20:54:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Commands generated by hbm2java
 */
@Entity
@Table(name="commands"
    ,catalog="jangosauth"
)
public class Commands  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Set<Roles> roleses = new HashSet<Roles>(0);

    public Commands() {
    }

	
    public Commands(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Commands(String name, String description, Set<Roles> roleses) {
       this.name = name;
       this.description = description;
       this.roleses = roleses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=35)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", nullable=false, length=60)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="commands_roles", catalog="jangosauth", joinColumns = { 
        @JoinColumn(name="fk_commands", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="fk_roles", nullable=false, updatable=false) })
    public Set<Roles> getRoleses() {
        return this.roleses;
    }
    
    public void setRoleses(Set<Roles> roleses) {
        this.roleses = roleses;
    }




}


