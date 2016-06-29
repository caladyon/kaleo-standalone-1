/**
 *
 */
package it.caladyon.kaleo_standalone_1.model;

import java.util.Date;

import javax.persistence.Entity;

import it.caladyon.kaleo_standalone_1.workflow.WorkflowEnabledEntity;


/**
 * https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/workflow-enabling-entities
 *
 * @author IG08197
 *
 */
@Entity
public class WorkflowEnabledAsset extends Asset implements WorkflowEnabledEntity {

	private int workflowStatus;

	private long workflowUserId;

	private String workflowUserName;

	private Date workflowDate;

	public WorkflowEnabledAsset() {
	}

	public WorkflowEnabledAsset(Asset asset) {
		this();
		setId(asset.getId());
		setFirstName(asset.getFirstName());
		setLastName(asset.getLastName());
		setDeleted(asset.isDeleted());
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#getWorkflowStatus()
	 */
	@Override
	public final int getWorkflowStatus() {
		return workflowStatus;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#setWorkflowStatus(int)
	 */
	@Override
	public final void setWorkflowStatus(int workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#getWorkflowUserId()
	 */
	@Override
	public final long getWorkflowUserId() {
		return workflowUserId;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#setWorkflowUserId(long)
	 */
	@Override
	public final void setWorkflowUserId(long workflowUserId) {
		this.workflowUserId = workflowUserId;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#getWorkflowUserName()
	 */
	@Override
	public final String getWorkflowUserName() {
		return workflowUserName;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#setWorkflowUserName(java.lang.String)
	 */
	@Override
	public final void setWorkflowUserName(String workflowUserName) {
		this.workflowUserName = workflowUserName;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#getWorkflowDate()
	 */
	@Override
	public final Date getWorkflowDate() {
		return workflowDate;
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.model.WorkflowEnabledEntity#setWorkflowDate(java.util.Date)
	 */
	@Override
	public final void setWorkflowDate(Date workflowDate) {
		this.workflowDate = workflowDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkflowEnabledAsset [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", isDeleted()=" + isDeleted() + ", workflowStatus=" + workflowStatus
				+ ", workflowUserId=" + workflowUserId + ", workflowUserName=" + workflowUserName + ", workflowDate="
				+ workflowDate + "]";
	}

}
