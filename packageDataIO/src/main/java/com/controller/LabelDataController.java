package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.TransformerException;


import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.NodeList;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/UangoAPI")
public class LabelDataController {
	private static final Logger LOGGER = Logger.getLogger( LabelDataController.class.getName() );

@RequestMapping(value="/upload" ,method=POST)
public void uoploadPackages(@RequestBody Map<String,Object> json) throws   IOException {
	 LOGGER.info("Reading json data");
	System.out.println(json.get("username").toString());
//	JSONObject response=new JSONObject();
//	if(json!=null) {
//		     if(json.has("Package")) {
//		    	 JSONObject packages=new JSONObject();
//		    	 packages=(JSONObject) json.get("Package");
//		    	 if(packages.has("Data")) {
//		    		 JSONObject packageData=new JSONObject();
//		    		 packageData=(JSONObject)packages.getJSONObject("Data");
//		    		 if(packageData!=null) {
//	                       if(packageData.has("Item")) {
//	                    	     JSONArray itemArray=new JSONArray();
//	                    	     if(itemArray.length()!=0) {
//	                    	    	 
//		                              response.append("Message","success");
//			    			    	  response.append("Successcode", "PackageData has been uploaded successfully");
//	                    	    	 
//	                    	               }
//	                    	         
//	                                 }
//	                              response.append("Message","fail");
//		    			    	  response.append("Failcode", "Json file doesn't have 'Item' key");
//		    			    	  
//		    			        }
//		    			      response.append("Message", "fail");
//	    			    	  response.append("Failcode", "In Json file, key of 'Data' has no value ,please check uploaded data");
//	    			    	  
//	    			    	  return response;
//		    			      
//		    			    }
//		    			 }
//		    			 response.append("Message", "fail");
//			    		 response.append("Failcode", "Json file has no item 'Data' ,please check uploaded data");
//		    			 return response;
//		    			 
//		    		 }
//		    		 response.append("Message", "fail");
//		    		 response.append("Failcode", "JSON object json is null,please check uploaded data");
//		    		 return response;
		    		 
		    
		    	 
		    	 
	

}



}
