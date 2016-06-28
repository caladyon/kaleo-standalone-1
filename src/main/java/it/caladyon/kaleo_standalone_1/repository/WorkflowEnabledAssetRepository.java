/**
 *
 */
package it.caladyon.kaleo_standalone_1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

import it.caladyon.kaleo_standalone_1.model.WorkflowEnabledAsset;
import it.caladyon.kaleo_standalone_1.workflow.WorkflowEnabledRepository;

/**
 * @author IG08197
 *
 */
@Qualifier("WF")
public interface WorkflowEnabledAssetRepository
		extends CrudRepository<WorkflowEnabledAsset, Long>, WorkflowEnabledRepository<WorkflowEnabledAsset> {

	List<WorkflowEnabledAsset> findByLastName(String lastName);

	List<WorkflowEnabledAsset> findByDeleted(boolean deleted);

}
