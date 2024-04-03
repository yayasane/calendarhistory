package sn.veli.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import sn.veli.domain.SearchHistory;

/**
 * Spring Data JPA repository for the SearchHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {}
