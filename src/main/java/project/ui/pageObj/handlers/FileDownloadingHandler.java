package project.ui.pageObj.handlers;
import project.ui.pageObj.CorePageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.apache.commons.io.FileUtils.deleteDirectory;

public class FileDownloadingHandler extends CorePageObjects {

    /*
    FILE DOWNLOADING HANDLER
    Start:
     */

    public String setPathToDownloadFolder() {

        String CSV_FILE_DOWNLOADED_1 = "test_download";
        String CSV_FILE_DOWNLOADED_2 = "/test_download/";
        String os = System.getProperty("os.name");
        String tmp = System.getProperty("java.io.tmpdir");
        if (os.equals("Linux")) {
            return tmp + CSV_FILE_DOWNLOADED_2;
        } else {
            return tmp + CSV_FILE_DOWNLOADED_1;
        }
    }

    public int getQuantityOfDownloadedFiles() {
        try {
//            waitUntilFileDownloaded(returnQuantityOfDownloadedFiles());
            return returnQuantityOfDownloadedFiles();
        } catch (IOException e) {
            e.printStackTrace();
            //if method has bugs, then return 1000000 value
            return 1000000;
        }
    }

    public int returnQuantityOfDownloadedFiles() throws IOException {
        do {
            waitABit(1000);
        }
        while (!org.apache.commons.io.FileUtils.listFiles(new File(setPathToDownloadFolder()), new String[]{"crdownload"}, false).isEmpty());

        File folder = new File(setPathToDownloadFolder());
//        File[] listOfFile = folder.listFiles();

        int count = 0;
        do {
            waitABit(500);
            count++;
        }
        while (!(Objects.requireNonNull(folder.listFiles()).length == 1) && count < 300);

        int quantity = Objects.requireNonNull(folder.listFiles()).length;
        deleteDirectory(new File(setPathToDownloadFolder()));

        return quantity;
    }

    /*
    End.
     */


}