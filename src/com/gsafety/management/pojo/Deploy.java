package com.gsafety.management.pojo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Deploy {
    private int id;
    private String browser;
    private String contact;
    private String deploymentInterfacePeople;
    private String deploymentServices;
    private String industry;
    private byte[] manual;
    private byte[] script;
    private int storageSpace;
    private String systemStatus;
    private String systemSynopsis;
    private String url;
    private Integer masterId;
    private Master master;
    private Set<Db> dbs = new HashSet<Db>();
    private Set<Middleware> middlewares = new HashSet<Middleware>();
    private Set<Gis> gis = new HashSet<Gis>();
    private Collection<Db> dbsById;
    private Master masterByMasterId;
    private Collection<Gis> gisById;
    private Collection<Middleware> middlewaresById;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    @Basic
    @Column(name = "master_id", nullable = true, insertable = false, updatable = false)
    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    @ManyToOne
    @JoinColumn(name = "master_id", insertable = false, updatable = false)
    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    @OneToMany
    @JoinColumn(name = "deploy_id")
    public Set<Db> getDbs() {
        return dbs;
    }

    public void setDbs(Set<Db> dbs) {
        this.dbs = dbs;
    }

    @OneToMany
    @JoinColumn(name = "deploy_id")
    public Set<Middleware> getMiddlewares() {
        return middlewares;
    }

    public void setMiddlewares(Set<Middleware> middlewares) {
        this.middlewares = middlewares;
    }

    @OneToMany
    @JoinColumn(name = "deploy_id")
    public Set<Gis> getGis() {
        return gis;
    }

    public void setGis(Set<Gis> gis) {
        this.gis = gis;
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
    @Column(name = "browser", nullable = false, length = 50)
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Basic
    @Column(name = "contact", nullable = false, length = 25)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "deploymentInterfacePeople", nullable = false, length = 10)
    public String getDeploymentInterfacePeople() {
        return deploymentInterfacePeople;
    }

    public void setDeploymentInterfacePeople(String deploymentInterfacePeople) {
        this.deploymentInterfacePeople = deploymentInterfacePeople;
    }

    @Basic
    @Column(name = "deploymentServices", nullable = false, length = 10)
    public String getDeploymentServices() {
        return deploymentServices;
    }

    public void setDeploymentServices(String deploymentServices) {
        this.deploymentServices = deploymentServices;
    }

    @Basic
    @Column(name = "industry", nullable = false, length = 10)
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "manual", nullable = false)
    public byte[] getManual() {
        return manual;
    }

    public void setManual(byte[] manual) {
        this.manual = manual;
    }

    @Basic
    @Column(name = "script", nullable = false)
    public byte[] getScript() {
        return script;
    }

    public void setScript(byte[] script) {
        this.script = script;
    }

    @Basic
    @Column(name = "storageSpace", nullable = false)
    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    @Basic
    @Column(name = "systemStatus", nullable = false, length = 2)
    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus;
    }

    @Basic
    @Column(name = "systemSynopsis", nullable = false, length = 100)
    public String getSystemSynopsis() {
        return systemSynopsis;
    }

    public void setSystemSynopsis(String systemSynopsis) {
        this.systemSynopsis = systemSynopsis;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 50)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deploy deploy = (Deploy) o;

        if (id != deploy.id) return false;
        if (storageSpace != deploy.storageSpace) return false;
        if (browser != null ? !browser.equals(deploy.browser) : deploy.browser != null) return false;
        if (contact != null ? !contact.equals(deploy.contact) : deploy.contact != null) return false;
        if (deploymentInterfacePeople != null ? !deploymentInterfacePeople.equals(deploy.deploymentInterfacePeople) : deploy.deploymentInterfacePeople != null)
            return false;
        if (deploymentServices != null ? !deploymentServices.equals(deploy.deploymentServices) : deploy.deploymentServices != null)
            return false;
        if (industry != null ? !industry.equals(deploy.industry) : deploy.industry != null) return false;
        if (!Arrays.equals(manual, deploy.manual)) return false;
        if (!Arrays.equals(script, deploy.script)) return false;
        if (systemStatus != null ? !systemStatus.equals(deploy.systemStatus) : deploy.systemStatus != null)
            return false;
        if (systemSynopsis != null ? !systemSynopsis.equals(deploy.systemSynopsis) : deploy.systemSynopsis != null)
            return false;
        if (url != null ? !url.equals(deploy.url) : deploy.url != null) return false;
        if (masterId != null ? !masterId.equals(deploy.masterId) : deploy.masterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (deploymentInterfacePeople != null ? deploymentInterfacePeople.hashCode() : 0);
        result = 31 * result + (deploymentServices != null ? deploymentServices.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(manual);
        result = 31 * result + Arrays.hashCode(script);
        result = 31 * result + storageSpace;
        result = 31 * result + (systemStatus != null ? systemStatus.hashCode() : 0);
        result = 31 * result + (systemSynopsis != null ? systemSynopsis.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (masterId != null ? masterId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "deployByDeployId")
    public Collection<Db> getDbsById() {
        return dbsById;
    }

    public void setDbsById(Collection<Db> dbsById) {
        this.dbsById = dbsById;
    }

    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id")
    public Master getMasterByMasterId() {
        return masterByMasterId;
    }

    public void setMasterByMasterId(Master masterByMasterId) {
        this.masterByMasterId = masterByMasterId;
    }

    @OneToMany(mappedBy = "deployByDeployId")
    public Collection<Gis> getGisById() {
        return gisById;
    }

    public void setGisById(Collection<Gis> gisById) {
        this.gisById = gisById;
    }

    @OneToMany(mappedBy = "deployByDeployId")
    public Collection<Middleware> getMiddlewaresById() {
        return middlewaresById;
    }

    public void setMiddlewaresById(Collection<Middleware> middlewaresById) {
        this.middlewaresById = middlewaresById;
    }
}
