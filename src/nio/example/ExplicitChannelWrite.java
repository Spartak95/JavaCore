package nio.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        char[] ch = {'H', 'e', 'l', 'l', 'o', ' ',
                         'W', 'o', 'r', 'l', 'd'};
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("D:/file.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            // սահմանում ենք բուֆերի տարողությունը
            ByteBuffer mbuf = ByteBuffer.allocate(26);
            // բուֆերի մեջ գրանցում ենք տվյալներ
            for (int i=0; i<ch.length; i++){
                mbuf.put((byte) ch[i]);
            }
            // զրոյականացնում է բուֆերի դիրքը
            mbuf.rewind();
            // բուֆերի միջի տվյալներին գրանցում է ելակետային ֆայլի մեջ
            fChan.write(mbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

