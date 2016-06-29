/**
 *
 */
package it.caladyon.kaleo_standalone_1.workflow;

import it.caladyon.kaleo_standalone_1.model.WorkflowEnabledAsset;

/**
 * @author IG08197
 *
 */
public interface WorkflowEnabledService {

	WorkflowEnabledAsset updateStatus(long userId, long entityId, int status);

}
