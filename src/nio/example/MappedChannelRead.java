package nio.example;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fChan =
               (FileChannel) Files.newByteChannel(Paths.get("D:/text.txt"))) {
             long fSize = fChan.size();
             // ֆայլը պատկերվում է բուֆերի մեջ
             MappedByteBuffer mBuf =
                fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
             // բուֆերի միջից ընթերցում է բայթերին և դուրս է բերում նրանց
            for (int i=0; i<fSize; i++){
                System.out.print((char) mBuf.get());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

