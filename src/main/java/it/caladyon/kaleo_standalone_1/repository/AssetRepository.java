/**
 *
 */
package it.caladyon.kaleo_standalone_1.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.caladyon.kaleo_standalone_1.model.Asset;

/**
 * @author IG08197
 *
 */
public interface AssetRepository extends CrudRepository<Asset, Long> {

	List<Asset> findByLastName(String lastName);

}
