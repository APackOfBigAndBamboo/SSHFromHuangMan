package com.gsafety.management.pojo;

import javax.persistence.*;

@Entity
public class Middleware {
    private int id;
    private String deployDirectory;
    private String domainAccount;
    private String domainName;
    private String domainPassword;
    private String installationManual;
    private String middlewareBrand;
    private String middlewarePort;
    private String middlewareUrl;
    private String remarks;
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
    @Column(name = "deployDirectory", nullable = false, length = 50)
    public String getDeployDirectory() {
        return deployDirectory;
    }

    public void setDeployDirectory(String deployDirectory) {
        this.deployDirectory = deployDirectory;
    }

    @Basic
    @Column(name = "domainAccount", nullable = false, length = 9)
    public String getDomainAccount() {
        return domainAccount;
    }

    public void setDomainAccount(String domainAccount) {
        this.domainAccount = domainAccount;
    }

    @Basic
    @Column(name = "domainName", nullable = false, length = 15)
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Basic
    @Column(name = "domainPassword", nullable = false, length = 10)
    public String getDomainPassword() {
        return domainPassword;
    }

    public void setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
    }

    @Basic
    @Column(name = "installationManual", nullable = false, length = 50)
    public String getInstallationManual() {
        return installationManual;
    }

    public void setInstallationManual(String installationManual) {
        this.installationManual = installationManual;
    }

    @Basic
    @Column(name = "middlewareBrand", nullable = false, length = 50)
    public String getMiddlewareBrand() {
        return middlewareBrand;
    }

    public void setMiddlewareBrand(String middlewareBrand) {
        this.middlewareBrand = middlewareBrand;
    }

    @Basic
    @Column(name = "middlewarePort", nullable = false, length = 5)
    public String getMiddlewarePort() {
        return middlewarePort;
    }

    public void setMiddlewarePort(String middlewarePort) {
        this.middlewarePort = middlewarePort;
    }

    @Basic
    @Column(name = "middlewareURL", nullable = false, length = 50)
    public String getMiddlewareUrl() {
        return middlewareUrl;
    }

    public void setMiddlewareUrl(String middlewareUrl) {
        this.middlewareUrl = middlewareUrl;
    }

    @Basic
    @Column(name = "remarks", nullable = false, length = 255)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

        Middleware that = (Middleware) o;

        if (id != that.id) return false;
        if (deployDirectory != null ? !deployDirectory.equals(that.deployDirectory) : that.deployDirectory != null)
            return false;
        if (domainAccount != null ? !domainAccount.equals(that.domainAccount) : that.domainAccount != null)
            return false;
        if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;
        if (domainPassword != null ? !domainPassword.equals(that.domainPassword) : that.domainPassword != null)
            return false;
        if (installationManual != null ? !installationManual.equals(that.installationManual) : that.installationManual != null)
            return false;
        if (middlewareBrand != null ? !middlewareBrand.equals(that.middlewareBrand) : that.middlewareBrand != null)
            return false;
        if (middlewarePort != null ? !middlewarePort.equals(that.middlewarePort) : that.middlewarePort != null)
            return false;
        if (middlewareUrl != null ? !middlewareUrl.equals(that.middlewareUrl) : that.middlewareUrl != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (deployId != null ? !deployId.equals(that.deployId) : that.deployId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (deployDirectory != null ? deployDirectory.hashCode() : 0);
        result = 31 * result + (domainAccount != null ? domainAccount.hashCode() : 0);
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (domainPassword != null ? domainPassword.hashCode() : 0);
        result = 31 * result + (installationManual != null ? installationManual.hashCode() : 0);
        result = 31 * result + (middlewareBrand != null ? middlewareBrand.hashCode() : 0);
        result = 31 * result + (middlewarePort != null ? middlewarePort.hashCode() : 0);
        result = 31 * result + (middlewareUrl != null ? middlewareUrl.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
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
