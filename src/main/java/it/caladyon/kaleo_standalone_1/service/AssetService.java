/**
 *
 */
package it.caladyon.kaleo_standalone_1.service;

import java.util.List;

import it.caladyon.kaleo_standalone_1.model.Asset;

/**
 * @author IG08197
 *
 */
public interface AssetService {

	Asset create(Asset asset);

	List<Asset> findAll();

	Asset delete(Asset asset);

	void truncate();

}
