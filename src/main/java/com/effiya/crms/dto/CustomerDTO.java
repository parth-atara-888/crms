package com.effiya.crms.dto;

public class CustomerDTO {
    private String custId;
    private String accNo;
    private String custName;
    private String assignedRiskTeam;
    private String assignedBusinessTeam;
    private String scoring;

    // Getters and Setters
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAssignedRiskTeam() {
        return assignedRiskTeam;
    }

    public void setAssignedRiskTeam(String assignedRiskTeam) {
        this.assignedRiskTeam = assignedRiskTeam;
    }

    public String getAssignedBusinessTeam() {
        return assignedBusinessTeam;
    }

    public void setAssignedBusinessTeam(String assignedBusinessTeam) {
        this.assignedBusinessTeam = assignedBusinessTeam;
    }

    public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring;
    }
}
