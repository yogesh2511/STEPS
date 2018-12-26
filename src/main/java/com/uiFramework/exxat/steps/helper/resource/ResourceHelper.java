package com.uiFramework.exxat.steps.helper.resource;

public class ResourceHelper
{
 public static String getResourcePath(String path)
 {
	 String basepath=System.getProperty("user.dir");
	 return basepath+path;
 }
 public static void main(String[] args) {
	 System.out.println(ResourceHelper.getResourcePath("\\src\\main\\resources\\configfile\\log4j.properties"));
}
}
