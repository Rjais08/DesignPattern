import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) throws Exception{

        String dateString = "20-01-2025 15:30"; // Date and time in "dd-MM-yyyy HH:mm" format
        String fromTimeZone = "GMT"; // Original time zone
        String toTimeZone = "Asia/Singapore";
        getPath();
        getNormalizedPath2();



    }

    public static void getPath(){
        String checklistPath = "https://recruiter.sohum.com/upload/file/shivam/peoplestrong/form16.pdf";
        String remotePath = "https://recruiter.sohum.com/";
        String localpath = "/alt/";

        String srcPath = checklistPath.replace(remotePath, localpath);
        String destPath = srcPath.replace(".pdf", "_signed.pdf");

//        System.out.println(destPath);
        checklistPath = destPath.replace(localpath, remotePath);
        System.out.println(checklistPath);
    }

    public static void getNormalizedPath() throws Exception{
        String remotePath = "https://recruiter.sohum.com/";
        String localpath = "/alt/";
        String checklistPath = "https://recruiter.sohum.com/upload/file/shivam/peoplestrong/form16.pdf";

        Path documentPath = Paths.get(checklistPath).normalize();
        if (!documentPath.startsWith(remotePath)) {
            throw new SecurityException("Unauthorized file path access detected.");
        }

        Path srcPath = Paths.get(localpath, documentPath.subpath(Paths.get(remotePath).getNameCount(), documentPath.getNameCount()).toString()).normalize();
        Path destPath = srcPath.resolveSibling(srcPath.getFileName().toString().replace(".pdf", "_signed.pdf"));

        if (!srcPath.startsWith(localpath) || !destPath.startsWith(localpath)) {
            throw new SecurityException("Unauthorized file path access detected.");
        }


        Path updatedDocumentPath = Paths.get(remotePath, destPath.subpath(Paths.get(localpath).getNameCount(), destPath.getNameCount()).toString());

        checklistPath = updatedDocumentPath.toString().replace("\\", "/");
        System.out.println(checklistPath);
    }

    public static void getNormalizedPath2() throws Exception {
        String remotePath = "https://recruiter.sohum.com/";
        String localpath = "/alt/";
        String checklistPath = "https://recruiter.sohum.com/upload/file/shivam/peoplestrong/form16.pdf";

        String relativePath = checklistPath.substring(remotePath.length());
        Path documentPath = Paths.get(relativePath).normalize();

        String fileName = documentPath.getFileName().toString();
        String signedFileName = fileName.replace(".pdf", "_signed.pdf");
        Path srcPath = Paths.get(localpath, documentPath.subpath(Paths.get(remotePath).getNameCount(), documentPath.getNameCount()).toString()).normalize();

        Path destPath = documentPath.getParent().resolve(signedFileName);



        if(!srcPath.startsWith(localpath) || !destPath.startsWith(remotePath)){
            throw new SecurityException("unauth");
        }

       String updatedDocumentPath = remotePath + destPath.toString().replace("\\", "/");



        System.out.println(updatedDocumentPath);
    }


}