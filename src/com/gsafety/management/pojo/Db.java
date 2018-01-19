package com.gsafety.management.pojo;

import javax.persistence.*;

@Entity
public class Db {
    private int id;
    private String dbAccount;
    private String dbBrand;
    private String dbDataFileLocation;
    private String dbInstallationManual;
    private String dbInstance;
    private String dbPassword;
    private String dbPort;
    private Deploy deploy;
    private Integer deployId;
    private Deploy deployByDeployId;

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "deploy_id", insertable = false, updatable = false)
    public Deploy getDeploy() {
        return deploy;
    }

    public void setDeploy(Deploy deploy) {
        this.deploy = deploy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dbAccount", nullable = false, length = 9)
    public String getDbAccount() {
        return dbAccount;
    }

    public void setDbAccount(String dbAccount) {
        this.dbAccount = dbAccount;
    }

    @Basic
    @Column(name = "dbBrand", nullable = false, length = 50)
    public String getDbBrand() {
        return dbBrand;
    }

    public void setDbBrand(String dbBrand) {
        this.dbBrand = dbBrand;
    }

    @Basic
    @Column(name = "dbDataFileLocation", nullable = false, length = 50)
    public String getDbDataFileLocation() {
        return dbDataFileLocation;
    }

    public void setDbDataFileLocation(String dbDataFileLocation) {
        this.dbDataFileLocation = dbDataFileLocation;
    }

    @Basic
    @Column(name = "dbInstallationManual", nullable = false, length = 50)
    public String getDbInstallationManual() {
        return dbInstallationManual;
    }

    public void setDbInstallationManual(String dbInstallationManual) {
        this.dbInstallationManual = dbInstallationManual;
    }

    @Basic
    @Column(name = "dbInstance", nullable = false, length = 15)
    public String getDbInstance() {
        return dbInstance;
    }

    public void setDbInstance(String dbInstance) {
        this.dbInstance = dbInstance;
    }

    @Basic
    @Column(name = "dbPassword", nullable = false, length = 10)
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @Basic
    @Column(name = "dbPort", nullable = false, length = 5)
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    @Basic
    @Column(name = "deploy_id", nullable = true, insertable = false, updatable = false)
    public Integer getDeployId() {
        return deployId;
    }

    public void setDeployId(Integer deployId) {
        this.deployId = deployId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Db db = (Db) o;

        if (id != db.id) return false;
        if (dbAccount != null ? !dbAccount.equals(db.dbAccount) : db.dbAccount != null) return false;
        if (dbBrand != null ? !dbBrand.equals(db.dbBrand) : db.dbBrand != null) return false;
        if (dbDataFileLocation != null ? !dbDataFileLocation.equals(db.dbDataFileLocation) : db.dbDataFileLocation != null)
            return false;
        if (dbInstallationManual != null ? !dbInstallationManual.equals(db.dbInstallationManual) : db.dbInstallationManual != null)
            return false;
        if (dbInstance != null ? !dbInstance.equals(db.dbInstance) : db.dbInstance != null) return false;
        if (dbPassword != null ? !dbPassword.equals(db.dbPassword) : db.dbPassword != null) return false;
        if (dbPort != null ? !dbPort.equals(db.dbPort) : db.dbPort != null) return false;
        if (deployId != null ? !deployId.equals(db.deployId) : db.deployId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dbAccount != null ? dbAccount.hashCode() : 0);
        result = 31 * result + (dbBrand != null ? dbBrand.hashCode() : 0);
        result = 31 * result + (dbDataFileLocation != null ? dbDataFileLocation.hashCode() : 0);
        result = 31 * result + (dbInstallationManual != null ? dbInstallationManual.hashCode() : 0);
        result = 31 * result + (dbInstance != null ? dbInstance.hashCode() : 0);
        result = 31 * result + (dbPassword != null ? dbPassword.hashCode() : 0);
        result = 31 * result + (dbPort != null ? dbPort.hashCode() : 0);
        result = 31 * result + (deployId != null ? deployId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "deploy_id", referencedColumnName = "id")
    public Deploy getDeployByDeployId() {
        return deployByDeployId;
    }

    public void setDeployByDeployId(Deploy deployByDeployId) {
        this.deployByDeployId = deployByDeployId;
    }
}
