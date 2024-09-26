package com.cloudempiere.omnisearch.elasticsearch;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.cloudempiere.omnisearch.indexprovider.ISearchIndexProvider;
import com.cloudempiere.omnisearch.model.MSearchIndexProvider;
import com.cloudempiere.omnisearch.util.ISearchResult;
import com.cloudempiere.omnisearch.util.SearchIndexRecord;

/**
 * 
 * Search index provider for Elastic Search
 * 
 * @author Peter Takacs, Cloudempiere
 *
 */
public class ElasticSearchIndexProvider implements ISearchIndexProvider {

	@Override
	public void init(MSearchIndexProvider searchIndexProvider) {
		
	}

	@Override
	public void deleteAllIndex(String searchIndexName) {

	}

	@Override
	public void deleteIndexByQuery(String searchIndexName, String query) {

	}

	@Override
	public Object searchIndexNoRestriction(String searchIndexName, String queryString) {
		return null;
	}

	@Override
	public List<ISearchResult> searchIndexDocument(String searchIndexName, String queryString, boolean isAdvanced) {
		return null;
	}

	@Override
	public void setHeadline(ISearchResult result, String query) {
		
	}
	
	@Override
	public void createIndex(Properties ctx, Map<Integer, Set<SearchIndexRecord>> indexRecordsMap, String trxName) {

	}
	
	@Override
	public boolean isIndexPopulated(String searchIndexName) {
		return false;
	}

}
