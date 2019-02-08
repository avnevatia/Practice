package random;

import java.io.File;

public class FileListFromFolder {

   public static void main(String a[]) {
      String filePath = "C:\\Users\\nevan01\\Box\\STUDY\\Reference\\JAVA\\Java fundaments 2\\";
      File file = new File(filePath);
      File oldFile;
      File newFile;

      String[] names = file.list();

      for (String name : names) {
         oldFile = new File(filePath + name);
         newFile = new File(filePath + name + ".mp4");
         System.out.println(name);
         System.out.println(oldFile.renameTo(newFile));
      }
   }

}
