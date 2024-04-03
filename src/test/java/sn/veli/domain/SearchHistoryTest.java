package sn.veli.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static sn.veli.domain.SearchHistoryTestSamples.*;

import org.junit.jupiter.api.Test;
import sn.veli.web.rest.TestUtil;

class SearchHistoryTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(SearchHistory.class);
        SearchHistory searchHistory1 = getSearchHistorySample1();
        SearchHistory searchHistory2 = new SearchHistory();
        assertThat(searchHistory1).isNotEqualTo(searchHistory2);

        searchHistory2.setId(searchHistory1.getId());
        assertThat(searchHistory1).isEqualTo(searchHistory2);

        searchHistory2 = getSearchHistorySample2();
        assertThat(searchHistory1).isNotEqualTo(searchHistory2);
    }
}
