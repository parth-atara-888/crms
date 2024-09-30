package com.effiya.crms.entitities;

import jakarta.persistence.*;


@Entity
    @Table(name= "cutomer_master")
    public class CustomerMaster{
    @Id
    private String customerId;
    private String accountNo;
    private String Name;
    private String assignedRiskTeam;
    private String assignedBusinessTeam;
    private String scoring ;

    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring;
    }

    public String getAssignedBusinessTeam() {
        return assignedBusinessTeam;
    }

    public void setAssignedBusinessTeam(String assignedBusinessTeam) {
        this.assignedBusinessTeam = assignedBusinessTeam;
    }

    public String getAssignedRiskTeam() {
        return assignedRiskTeam;
    }

    public void setAssignedRiskTeam(String assignedRiskTeam) {
        this.assignedRiskTeam = assignedRiskTeam;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}


