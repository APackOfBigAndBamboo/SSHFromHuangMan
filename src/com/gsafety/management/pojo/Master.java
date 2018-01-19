package com.gsafety.management.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Master {
    private int id;
    private int cpuCores;
    private int cpuNum;
    private String masterAccount;
    private String masterIp;
    private String masterPassword;
    private int memory;
    private String onPremise;
    private int storageSpace;
    private String systemBrand;
    private String systemName;
    private Set<Deploy> deploys = new HashSet<Deploy>();
    private Collection<Deploy> deploysById;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public void setCpuNum(Integer cpuNum) {
        this.cpuNum = cpuNum;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    @OneToMany
    @JoinColumn(name = "master_id")
    public Set<Deploy> getDeploys() {
        return deploys;
    }

    public void setDeploys(Set<Deploy> deploys) {
        this.deploys = deploys;
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
    @Column(name = "cpuCores", nullable = false)
    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    @Basic
    @Column(name = "cpuNum", nullable = false)
    public int getCpuNum() {
        return cpuNum;
    }

    public void setCpuNum(int cpuNum) {
        this.cpuNum = cpuNum;
    }

    @Basic
    @Column(name = "masterAccount", nullable = false, length = 9)
    public String getMasterAccount() {
        return masterAccount;
    }

    public void setMasterAccount(String masterAccount) {
        this.masterAccount = masterAccount;
    }

    @Basic
    @Column(name = "masterIp", nullable = false, length = 15)
    public String getMasterIp() {
        return masterIp;
    }

    public void setMasterIp(String masterIp) {
        this.masterIp = masterIp;
    }

    @Basic
    @Column(name = "masterPassword", nullable = false, length = 18)
    public String getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
    }

    @Basic
    @Column(name = "memory", nullable = false)
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Basic
    @Column(name = "onPremise", nullable = false, length = 15)
    public String getOnPremise() {
        return onPremise;
    }

    public void setOnPremise(String onPremise) {
        this.onPremise = onPremise;
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
    @Column(name = "systemBrand", nullable = false, length = 50)
    public String getSystemBrand() {
        return systemBrand;
    }

    public void setSystemBrand(String systemBrand) {
        this.systemBrand = systemBrand;
    }

    @Basic
    @Column(name = "systemName", nullable = false, length = 50)
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Master master = (Master) o;

        if (id != master.id) return false;
        if (cpuCores != master.cpuCores) return false;
        if (cpuNum != master.cpuNum) return false;
        if (memory != master.memory) return false;
        if (storageSpace != master.storageSpace) return false;
        if (masterAccount != null ? !masterAccount.equals(master.masterAccount) : master.masterAccount != null)
            return false;
        if (masterIp != null ? !masterIp.equals(master.masterIp) : master.masterIp != null) return false;
        if (masterPassword != null ? !masterPassword.equals(master.masterPassword) : master.masterPassword != null)
            return false;
        if (onPremise != null ? !onPremise.equals(master.onPremise) : master.onPremise != null) return false;
        if (systemBrand != null ? !systemBrand.equals(master.systemBrand) : master.systemBrand != null) return false;
        if (systemName != null ? !systemName.equals(master.systemName) : master.systemName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cpuCores;
        result = 31 * result + cpuNum;
        result = 31 * result + (masterAccount != null ? masterAccount.hashCode() : 0);
        result = 31 * result + (masterIp != null ? masterIp.hashCode() : 0);
        result = 31 * result + (masterPassword != null ? masterPassword.hashCode() : 0);
        result = 31 * result + memory;
        result = 31 * result + (onPremise != null ? onPremise.hashCode() : 0);
        result = 31 * result + storageSpace;
        result = 31 * result + (systemBrand != null ? systemBrand.hashCode() : 0);
        result = 31 * result + (systemName != null ? systemName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "masterByMasterId")
    public Collection<Deploy> getDeploysById() {
        return deploysById;
    }

    public void setDeploysById(Collection<Deploy> deploysById) {
        this.deploysById = deploysById;
    }
}
