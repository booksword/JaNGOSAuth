package eu.jangos.auth.model;
// Generated 06-mai-2016 20:54:54 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RealmAccountId generated by hbm2java
 */
@Embeddable
public class RealmAccountId  implements java.io.Serializable {


     private int fkAccount;
     private int fkRealm;

    public RealmAccountId() {
    }

    public RealmAccountId(int fkAccount, int fkRealm) {
       this.fkAccount = fkAccount;
       this.fkRealm = fkRealm;
    }
   


    @Column(name="fk_account", nullable=false)
    public int getFkAccount() {
        return this.fkAccount;
    }
    
    public void setFkAccount(int fkAccount) {
        this.fkAccount = fkAccount;
    }


    @Column(name="fk_realm", nullable=false)
    public int getFkRealm() {
        return this.fkRealm;
    }
    
    public void setFkRealm(int fkRealm) {
        this.fkRealm = fkRealm;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RealmAccountId) ) return false;
		 RealmAccountId castOther = ( RealmAccountId ) other; 
         
		 return (this.getFkAccount()==castOther.getFkAccount())
 && (this.getFkRealm()==castOther.getFkRealm());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkAccount();
         result = 37 * result + this.getFkRealm();
         return result;
   }   


}


