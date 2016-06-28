/**
 *
 */
package it.caladyon.kaleo_standalone_1.workflow;

import java.util.List;

/**
 * @author IG08197
 *
 */
public interface WorkflowEnabledRepository<T> {

	public List<T> findByWorkflowStatus(int status);

}
