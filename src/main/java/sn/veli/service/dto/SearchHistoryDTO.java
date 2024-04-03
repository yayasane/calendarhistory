package sn.veli.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link sn.veli.domain.SearchHistory} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class SearchHistoryDTO implements Serializable {

    private Long id;

    @NotNull
    private LocalDate searchDate;

    @NotNull
    private String request;

    @NotNull
    private String respons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(LocalDate searchDate) {
        this.searchDate = searchDate;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchHistoryDTO)) {
            return false;
        }

        SearchHistoryDTO searchHistoryDTO = (SearchHistoryDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, searchHistoryDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SearchHistoryDTO{" +
            "id=" + getId() +
            ", searchDate='" + getSearchDate() + "'" +
            ", request='" + getRequest() + "'" +
            ", respons='" + getRespons() + "'" +
            "}";
    }
}
