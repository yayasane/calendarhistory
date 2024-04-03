package sn.veli.service.mapper;

import org.mapstruct.*;
import sn.veli.domain.SearchHistory;
import sn.veli.service.dto.SearchHistoryDTO;

/**
 * Mapper for the entity {@link SearchHistory} and its DTO {@link SearchHistoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface SearchHistoryMapper extends EntityMapper<SearchHistoryDTO, SearchHistory> {}
