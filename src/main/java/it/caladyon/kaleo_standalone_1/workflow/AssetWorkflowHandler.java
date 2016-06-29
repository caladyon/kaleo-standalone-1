/**
 *
 */
package it.caladyon.kaleo_standalone_1.workflow;

import java.io.Serializable;
import java.util.Map;

import it.caladyon.kaleo_standalone_1.model.WorkflowEnabledAsset;

/**
 * Workflow handler per <code>Asset</code> (o meglio per {@link WorkflowEnabledAsset}).
 *
 * @author IG08197
 *
 */
public class AssetWorkflowHandler extends BaseWorkflowHandler<WorkflowEnabledAsset> {

//	private static final String CLASS_NAME = WorkflowEnabledAsset.class.getName();

	public WorkflowEnabledAsset updateStatus(int status, WorkflowEnabledService service, Map<String, Serializable> workflowContext) {

		long userId = (Long) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID);
		long entityId = (Long) workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK);

//		ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");

		return service.updateStatus(userId, entityId, status);//, serviceContext);

	}

//	@Override
//	public String getClassName() {
//		return CLASS_NAME;
//	}
//
//	@Override
//	public String getType(Locale locale) {
//		// TODO : i18n
//		return "model.resource." + CLASS_NAME;
//	}
}
