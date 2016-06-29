/**
 *
 */
package it.caladyon.kaleo_standalone_1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.caladyon.kaleo_standalone_1.model.Asset;
import it.caladyon.kaleo_standalone_1.model.WorkflowEnabledAsset;
import it.caladyon.kaleo_standalone_1.repository.WorkflowEnabledAssetRepository;
import it.caladyon.kaleo_standalone_1.workflow.WorkflowConstants;
import it.caladyon.kaleo_standalone_1.workflow.WorkflowEnabledService;

/**
 * @author IG08197
 *
 */
@Service
@Qualifier("WF")
public class WorkflowEnabledLogicDeleteAssetServiceImpl implements AssetService, WorkflowEnabledService {

	@Autowired
	private WorkflowEnabledAssetRepository repository;

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#create(it.caladyon.kaleo_standalone_1.model.Asset)
	 */
	@Override
	public Asset create(Asset asset) {
		WorkflowEnabledAsset wea = new WorkflowEnabledAsset(asset);
		wea.setWorkflowStatus(WorkflowConstants.STATUS_DRAFT);
		wea.setWorkflowUserId(1L);
		wea.setWorkflowUserName("lboschi");
		wea.setWorkflowDate(new Date());
		return repository.save(wea);
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#findAll()
	 */
	@Override
	public List<Asset> findAll() {
		return repository.findByDeletedAndWorkflowStatus(false, WorkflowConstants.STATUS_APPROVED);
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#delete(it.caladyon.kaleo_standalone_1.model.Asset)
	 */
	@Override
	public Asset delete(Asset asset) {
		// TODO Auto-generated method stub
		asset.setDeleted(true);
		return repository.save((WorkflowEnabledAsset) asset);
	}

	@Override
	public WorkflowEnabledAsset updateStatus(long userId, long entityId, int status) {
		// TODO Auto-generated method stub
		WorkflowEnabledAsset asset = repository.findOne(entityId);
		asset.setWorkflowStatus(status);
		asset.setWorkflowUserId(userId);
		asset.setWorkflowUserName(""); // TODO
		asset.setWorkflowDate(new Date());
		repository.save(asset);
		return asset;
	}

	@Override
	public void truncate() {
		repository.deleteAll();
	}

}
