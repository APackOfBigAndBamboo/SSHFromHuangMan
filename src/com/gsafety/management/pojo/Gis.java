package com.gsafety.management.pojo;

import javax.persistence.*;

@Entity
public class Gis {
    private int id;
    private String gisBrand;
    private String gisPort;
    private String gisUrl;
    private String mapService;
    private String sliceFilePosition;
    private String softwareInstallationPosition;
    private String systemInformation;
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
    @Column(name = "gisBrand", nullable = false, length = 50)
    public String getGisBrand() {
        return gisBrand;
    }

    public void setGisBrand(String gisBrand) {
        this.gisBrand = gisBrand;
    }

    @Basic
    @Column(name = "gisPort", nullable = false, length = 5)
    public String getGisPort() {
        return gisPort;
    }

    public void setGisPort(String gisPort) {
        this.gisPort = gisPort;
    }

    @Basic
    @Column(name = "gisURL", nullable = false, length = 50)
    public String getGisUrl() {
        return gisUrl;
    }

    public void setGisUrl(String gisUrl) {
        this.gisUrl = gisUrl;
    }

    @Basic
    @Column(name = "mapService", nullable = false, length = 15)
    public String getMapService() {
        return mapService;
    }

    public void setMapService(String mapService) {
        this.mapService = mapService;
    }

    @Basic
    @Column(name = "sliceFilePosition", nullable = false, length = 50)
    public String getSliceFilePosition() {
        return sliceFilePosition;
    }

    public void setSliceFilePosition(String sliceFilePosition) {
        this.sliceFilePosition = sliceFilePosition;
    }

    @Basic
    @Column(name = "softwareInstallationPosition", nullable = false, length = 50)
    public String getSoftwareInstallationPosition() {
        return softwareInstallationPosition;
    }

    public void setSoftwareInstallationPosition(String softwareInstallationPosition) {
        this.softwareInstallationPosition = softwareInstallationPosition;
    }

    @Basic
    @Column(name = "systemInformation", nullable = false, length = 255)
    public String getSystemInformation() {
        return systemInformation;
    }

    public void setSystemInformation(String systemInformation) {
        this.systemInformation = systemInformation;
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

        Gis gis = (Gis) o;

        if (id != gis.id) return false;
        if (gisBrand != null ? !gisBrand.equals(gis.gisBrand) : gis.gisBrand != null) return false;
        if (gisPort != null ? !gisPort.equals(gis.gisPort) : gis.gisPort != null) return false;
        if (gisUrl != null ? !gisUrl.equals(gis.gisUrl) : gis.gisUrl != null) return false;
        if (mapService != null ? !mapService.equals(gis.mapService) : gis.mapService != null) return false;
        if (sliceFilePosition != null ? !sliceFilePosition.equals(gis.sliceFilePosition) : gis.sliceFilePosition != null)
            return false;
        if (softwareInstallationPosition != null ? !softwareInstallationPosition.equals(gis.softwareInstallationPosition) : gis.softwareInstallationPosition != null)
            return false;
        if (systemInformation != null ? !systemInformation.equals(gis.systemInformation) : gis.systemInformation != null)
            return false;
        if (deployId != null ? !deployId.equals(gis.deployId) : gis.deployId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (gisBrand != null ? gisBrand.hashCode() : 0);
        result = 31 * result + (gisPort != null ? gisPort.hashCode() : 0);
        result = 31 * result + (gisUrl != null ? gisUrl.hashCode() : 0);
        result = 31 * result + (mapService != null ? mapService.hashCode() : 0);
        result = 31 * result + (sliceFilePosition != null ? sliceFilePosition.hashCode() : 0);
        result = 31 * result + (softwareInstallationPosition != null ? softwareInstallationPosition.hashCode() : 0);
        result = 31 * result + (systemInformation != null ? systemInformation.hashCode() : 0);
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
