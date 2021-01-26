package nio.example;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        char[] ch = {'H', 'e', 'l', 'l', 'o', ' ',
                'W', 'o', 'r', 'l', 'd'};
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("D:/file.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ,
                StandardOpenOption.CREATE)) {
            // ֆայլը պատկերվում է բուֆերի մեջ
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 11);
            // բուֆերի մեջ գրանցում ենք տվյալները
            for (int i=0; i<ch.length; i++){
                mBuf.put((byte) ch[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

