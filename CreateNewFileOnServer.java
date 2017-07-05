String filePath=getServletConfig.getServletContext.getRealPath("C:\Users\vibhor\Desktop\Final.xls");
File f =newFile(filepath,"Finalfile.xls");
if(!f.exists()){
	System.out.println(String .format("Creating file%s...",f.getAbsolutePath()));
	if (f.createNewFile())
		System.out.println("Mission Accomplished ");
	else
		System.out.println("Oops Try Again");
}
