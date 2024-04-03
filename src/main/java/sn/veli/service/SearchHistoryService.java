package sn.veli.service;

import java.util.List;
import java.util.Optional;
import sn.veli.service.dto.SearchHistoryDTO;

/**
 * Service Interface for managing {@link sn.veli.domain.SearchHistory}.
 */
public interface SearchHistoryService {
    /**
     * Save a searchHistory.
     *
     * @param searchHistoryDTO the entity to save.
     * @return the persisted entity.
     */
    SearchHistoryDTO save(SearchHistoryDTO searchHistoryDTO);

    /**
     * Updates a searchHistory.
     *
     * @param searchHistoryDTO the entity to update.
     * @return the persisted entity.
     */
    SearchHistoryDTO update(SearchHistoryDTO searchHistoryDTO);

    /**
     * Partially updates a searchHistory.
     *
     * @param searchHistoryDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<SearchHistoryDTO> partialUpdate(SearchHistoryDTO searchHistoryDTO);

    /**
     * Get all the searchHistories.
     *
     * @return the list of entities.
     */
    List<SearchHistoryDTO> findAll();

    /**
     * Get the "id" searchHistory.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<SearchHistoryDTO> findOne(Long id);

    /**
     * Delete the "id" searchHistory.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
