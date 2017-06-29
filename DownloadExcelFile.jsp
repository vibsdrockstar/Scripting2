<%    
  String filename = "Final.xls";   
  String filepath = "C:\\Users\\vibhor\\Desktop";   
  response.setContentType("APPLICATION/OCTET-STREAM");   
  response.setHeader("Content-Disposition","attachment; filename=\"" + Final.xls + "\"");   
  
  java.io.FileInputStream fileInputStream=new java.io.FileInputStream("C:\\Users\\vibhor\\Desktop" + newfile.xls);  
            
  int i;   
  while ((i=fileInputStream.read()) != -1) {  
    out.write(i);   
  }   
  fileInputStream.close();   
%>   
// Alternate method
<html>
<head>
<title> Button for showing Excel file</title>
<body>
<input type="button" onclick="Show();" name="ok" value="PROCEED"  />
<script src="/excel/Final.xls" type="text/excel"/></script>
</body>
</head>
</html>
