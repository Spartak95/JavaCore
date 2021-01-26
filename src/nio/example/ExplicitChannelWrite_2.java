package nio.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite_2 {
    public static void main(String[] args) {
        char[] ch = {'H', 'e', 'l', 'l', 'o', ' ',
                'W', 'o', 'r', 'l', 'd'};
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("D:/file.txt"),
                        StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            // սահմանում ենք բուֆերի տարողությունը
            ByteBuffer mbuf = ByteBuffer.allocate(11);
            // բուֆերի մեջ գրանցում ենք տվյալներ
            for (int i=0; i<ch.length; i++){
                mbuf.put((byte) ch[i]);
            }
            // զրոյականացնում է բուֆերի դիրքը
            mbuf.flip();
            // բուֆերի միջի տվյալներին գրանցում է ելակետային ֆայլի մեջ
            fChan.write(mbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

