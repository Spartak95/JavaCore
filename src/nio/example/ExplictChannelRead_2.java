package nio.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplictChannelRead_2 {
    public static void main(String[] args) {
        int count;
        // իսկ հիմա ստանում ենք ֆայլի կապուղուն
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("D:/text.txt"))) {
            // սահմանում է բուֆերի տարողությանը
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1){
                    // պատրաստում է բուֆերին, որպեսզի նրանից տվյալներ ընթերցվեն
                    mBuf.rewind();
                    for (int i=0; i<count; i++){
                        System.out.print((char)mBuf.get());
                    }
                }
            }while (count != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

