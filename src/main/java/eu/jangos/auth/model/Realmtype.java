package eu.jangos.auth.model;
// Generated 06-mai-2016 20:54:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Realmtype generated by hbm2java
 */
@Entity
@Table(name="realmtype"
    ,catalog="jangosauth"
)
public class Realmtype  implements java.io.Serializable {


     private int id;
     private String type;
     private Set<Realm> realms = new HashSet<Realm>(0);

    public Realmtype() {
    }

	
    public Realmtype(int id) {
        this.id = id;
    }
    public Realmtype(int id, String type, Set<Realm> realms) {
       this.id = id;
       this.type = type;
       this.realms = realms;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="type", length=30)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="realmtype")
    public Set<Realm> getRealms() {
        return this.realms;
    }
    
    public void setRealms(Set<Realm> realms) {
        this.realms = realms;
    }




}


