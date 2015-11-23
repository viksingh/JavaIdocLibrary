package org.demo.test;

import java.util.ArrayList;
import java.util.List;
import com.sap.conn.idoc.IDocSegmentMetaData;


public class SegDataInfo {

	List<IDocSegmentMetaData> segMetaDataList = new ArrayList<IDocSegmentMetaData>();	

String SegDef;
String SegType;


public String getSegDef() {
	return SegDef;
}
public void setSegDef(String segDef) {
	SegDef = segDef;
}
public String getSegType() {
	return SegType;
}
public void setSegType(String segType) {
	SegType = segType;
}

public void getMetaData(IDocSegmentMetaData currSeg, List<IDocSegmentMetaData> metaDataList){


	
	metaDataList.add(currSeg);
	 	
	 IDocSegmentMetaData[] children = currSeg.getChildren();
	 for(IDocSegmentMetaData currChild : children){
	 	getMetaData(currChild,metaDataList);
	 	
	 }
	 	
	 }


}
