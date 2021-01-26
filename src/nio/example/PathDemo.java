package nio.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("D:/Example/Text/text.txt");
        System.out.println("Ֆայլի անունը " + filepath.getName(1));
        System.out.println("Դեպի ֆայլ տանող ուղին " + filepath);
        System.out.println("Դեպի ֆայլ տանող բացարձակ ուղին " + filepath.toAbsolutePath());
        System.out.println("Ծնողական թղթապանակը " + filepath.getParent());
        if (Files.exists(filepath)){
            System.out.println("text անունով ֆայլ գոյություն ունի");
        } else {
            System.out.println("text անունով ֆայլ գոյություն չունի");
        }
        try {
           if (Files.isHidden(filepath)){
               System.out.println("text անունով ֆայլ թաքնված է");
           }else {
               System.out.println("text անունով ֆայլ թաքնված չէ");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Files.isWritable(filepath);
        System.out.println("Ֆայլը հասանելի է գրանցման համար");
        Files.isReadable(filepath);
        System.out.println("Ֆայլը հասանելի է ընթերցման համար");
        try {
            BasicFileAttributes attribs =
                    Files.readAttributes(filepath, BasicFileAttributes.class);
            if (attribs.isDirectory()){
                System.out.println("Սա թղթապանակ է");
            }else {
                System.out.println("Սա թղթապանակ չէ");
            }
            if (attribs.isRegularFile()){
                System.out.println("Սա սովորական ֆայլ է");
            }else {
                System.out.println("Սա սովորական ֆայլ չէ");
            }
            if (attribs.isSymbolicLink()){
                System.out.println("Սա սիմվոլիկ հղում է");
            }else {
                System.out.println("Սա սիմվոլիկ հղում չէ");
            }
            System.out.println("Ֆայլին վերջին անգամ ձևափոխելու ժամանակ "
                    + attribs.lastModifiedTime());
            System.out.println("text անունով ֆայլի չափը " + attribs.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


