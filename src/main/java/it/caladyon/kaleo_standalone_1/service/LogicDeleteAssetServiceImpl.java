/**
 *
 */
package it.caladyon.kaleo_standalone_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.caladyon.kaleo_standalone_1.model.Asset;
import it.caladyon.kaleo_standalone_1.repository.AssetRepository;

/**
 * @author IG08197
 *
 */
@Service
@Qualifier("noWF")
public class LogicDeleteAssetServiceImpl implements AssetService {

	@Override
	public AssetRepository getRepository() {
		return repository;
	}

	/**
	 * Questo richiamo di una risorsa va migliorato...
	 *
	 */
	//@Resource(name = "assetRepository")
	@Autowired
	@Qualifier("noWF")
	private AssetRepository repository;

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#create(it.caladyon.kaleo_standalone_1.model.Asset)
	 */
	@Override
	public Asset create(Asset asset) {
		return repository.save(asset);
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#findAll()
	 */
	@Override
	public List<Asset> findAll() {
		return repository.findByDeleted(false);
	}

	/* (non-Javadoc)
	 * @see it.caladyon.kaleo_standalone_1.service.AssetService#delete(it.caladyon.kaleo_standalone_1.model.Asset)
	 */
	@Override
	public Asset delete(Asset asset) {
		asset.setDeleted(true);
		return repository.save(asset);
	}

}
