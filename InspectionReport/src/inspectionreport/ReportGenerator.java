
package inspectionreport;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class ReportGenerator {
    
    
    public String generatePDF(int inspectionId) {

    String fileName = "InspectionReport_" + inspectionId + ".pdf";

    try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();
        document.add(new Paragraph("INSPECTION REPORT"));
        document.add(new Paragraph("----------------------------"));
        document.add(new Paragraph("Inspection ID: " + inspectionId));
        document.add(new Paragraph("Generated At: " + java.time.LocalDateTime.now()));
        document.add(new Paragraph("Status: Completed"));
        document.close();

        System.out.println("ReportGenerator: REAL PDF created → " + fileName);
        return fileName;

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

}
