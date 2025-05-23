import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QrTest {
    public static void main(String[] args) {
        String data = "https://dp.cdc.gov.ua/"; // Данные для QR-кода
        String filePath = "qrcode.png"; // Имя файла
        int width = 200;
        int height = 200;

        try {
            generateQRCode(data, filePath, width, height);
            System.out.println("QR-код сохранен в " + filePath);
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void generateQRCode(String data, String filePath, int width, int height) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}

