package it.caladyon.kaleo_standalone_1.workflow;

import java.util.Date;

public interface WorkflowEnabledEntity {

	/**
	 * @return the workflowStatus
	 */
	int getWorkflowStatus();

	/**
	 * @param workflowStatus the workflowStatus to set
	 */
	void setWorkflowStatus(int workflowStatus);

	/**
	 * @return the workflowUserId
	 */
	long getWorkflowUserId();

	/**
	 * @param workflowUserId the workflowUserId to set
	 */
	void setWorkflowUserId(long workflowUserId);

	/**
	 * @return the workflowUserName
	 */
	String getWorkflowUserName();

	/**
	 * @param workflowUserName the workflowUserName to set
	 */
	void setWorkflowUserName(String workflowUserName);

	/**
	 * @return the workflowDate
	 */
	Date getWorkflowDate();

	/**
	 * @param workflowDate the workflowDate to set
	 */
	void setWorkflowDate(Date workflowDate);

}