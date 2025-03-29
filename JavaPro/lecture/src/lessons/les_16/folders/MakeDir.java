package lessons.les_16.folders;

import java.io.File;
import java.io.IOException;

public class MakeDir {
    public static void main(String[] args) throws IOException {
        String baseName = "D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\folders";

        String dirName = baseName + "/newDir";
        String createFile = dirName + "/test.txt";
        String dirName1 = baseName + "/newDir/1/2/3/folder";
//
        File dir = new File(dirName);
        dir.mkdir(); //one next folder
        File dir1 = new File(dirName1);
        dir1.mkdirs(); //folder hierarchy
        File file = new File(createFile);

        //createFile
        if(!file.exists()) //check if exist
            System.out.println(file.createNewFile()); //create file

        //deleteFile
        if(file.exists()) //check if exist
            System.out.println(file.delete());

        System.out.println(dir.mkdir());
        System.out.println(dir1.mkdirs());

        System.out.println(dir1.exists());
        System.out.println(dir1.isDirectory());
        System.out.println(dir1.isHidden());
        System.out.println(dir1.isFile());
        System.out.println(dir1.canRead());
        System.out.println(dir1.canWrite());
        System.out.println(dir1.canExecute());
//
//        System.out.println(dir.getName());
//        System.out.println(dir.getParent());
//        System.out.println(dir.listFiles().length);
//        System.out.println(dir.getParentFile().length());
    }
}
