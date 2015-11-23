package org.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.sap.conn.idoc.IDocRepository;
import com.sap.conn.idoc.IDocSegmentMetaData;
import com.sap.conn.idoc.jco.JCoIDoc;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;

public class Demo {

	/**
	 * @param args
	 * @throws JCoException 
	 */
	
/*	List<IDocSegmentMetaData> segMetaDataList = new ArrayList<IDocSegmentMetaData>();

	 public void expandChildren(IDocSegmentMetaData currSeg){



		 segMetaDataList.add(currSeg);
		 	
		 IDocSegmentMetaData[] children = currSeg.getChildren();
		 for(IDocSegmentMetaData currChild : children){
		 	expandChildren(currChild);
		 	
		 }
		 	
		 }*/
	
	public static void main(String[] args) throws JCoException {
    	JCoDestination destination=JCoDestinationManager.getDestination("NSP"); 
    	IDocRepository iDocRepository = JCoIDoc.getIDocRepository(destination);

    	IDocSegmentMetaData rootMetaData = iDocRepository
				.getRootSegmentMetaData("Z_TEST", "Z_TEST_EXT",
						"7.02", "7.02");
    	
    	SegDataInfo demo = new SegDataInfo();
    	List<IDocSegmentMetaData> segMetaDataList = new ArrayList<IDocSegmentMetaData>();	
    	
    	if (rootMetaData != null) {
    		demo.getMetaData(rootMetaData,segMetaDataList);	
								  }
	
    for ( IDocSegmentMetaData segMeta: segMetaDataList ){
		 System.out.println(segMeta.getType() + "  " +segMeta.getDefinition());    	
    	
    }
    	
	
	}




}
