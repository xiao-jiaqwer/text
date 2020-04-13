package com.text01.test;

import org.junit.Test;
import com.text01.utils.AudioUtils;

public class TestAudioUtils {
    @Test
    public void testPaly() throws Exception{
        AudioUtils utils  = AudioUtils.getInstance();
        utils.playMP3("D:/1.mp3");
    }
    @Test
    public void testConvert() throws Exception{
        AudioUtils utils  = AudioUtils.getInstance();
        utils.convertMP32Pcm("D:/1.mp3", "D:/1.pcm");
    }
}
