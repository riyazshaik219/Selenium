package com.qa.pdfUtil;

import java.io.IOException;

import org.testng.annotations.Test;

import com.testautomationguru.utility.PDFUtil;

public class ReadPdfText {

	
	@Test
	public void readPdf() throws IOException {
	
		String pdfLocation="C:\\Users\\RIYA\\Desktop\\Resume.pdf";
		
		PDFUtil pdfutil = new PDFUtil();
		
		int count=pdfutil.getPageCount(pdfLocation);
		
		System.out.println("The  page count is:"+count);
		
		//Read content from entire pdf:
		String content=pdfutil.getText(pdfLocation);
		
		System.out.println("The entire page content is:"+content);
		
		//Read particular page text
		
		String PagesContent=pdfutil.getText(pdfLocation, 1, 2);
		
		System.out.println("the pages content is:"+PagesContent);
	}
}
