package sn.veli.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A SearchHistory.
 */
@Entity
@Table(name = "search_history")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class SearchHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "search_date", nullable = false)
    private LocalDate searchDate;

    @NotNull
    @Column(name = "request", nullable = false)
    private String request;

    @NotNull
    @Column(name = "respons", nullable = false)
    private String respons;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public SearchHistory id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getSearchDate() {
        return this.searchDate;
    }

    public SearchHistory searchDate(LocalDate searchDate) {
        this.setSearchDate(searchDate);
        return this;
    }

    public void setSearchDate(LocalDate searchDate) {
        this.searchDate = searchDate;
    }

    public String getRequest() {
        return this.request;
    }

    public SearchHistory request(String request) {
        this.setRequest(request);
        return this;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRespons() {
        return this.respons;
    }

    public SearchHistory respons(String respons) {
        this.setRespons(respons);
        return this;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchHistory)) {
            return false;
        }
        return getId() != null && getId().equals(((SearchHistory) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SearchHistory{" +
            "id=" + getId() +
            ", searchDate='" + getSearchDate() + "'" +
            ", request='" + getRequest() + "'" +
            ", respons='" + getRespons() + "'" +
            "}";
    }
}
