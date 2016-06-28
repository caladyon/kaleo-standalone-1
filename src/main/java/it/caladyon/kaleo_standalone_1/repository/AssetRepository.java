/**
 *
 */
package it.caladyon.kaleo_standalone_1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

import it.caladyon.kaleo_standalone_1.model.Asset;

/**
 * @author IG08197
 *
 */
@Qualifier("noWF")
public interface AssetRepository extends CrudRepository<Asset, Long> {

	List<Asset> findByLastName(String lastName);

	List<Asset> findByDeleted(boolean deleted);

}
