package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 音频播放器
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    private static final String MEDIA_MP3 = "MP3";

    private static final String MEDIA_VLC = "VLC";

    private static final String MEDIA_MP4 = "MP4";

    @Override
    public void play(String audioType, String fileName) {
        // 播放MP3
        if (MEDIA_MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        // 播放高级媒体文件
        else if (MEDIA_VLC.equalsIgnoreCase(audioType)
                || MEDIA_MP4.equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        // 不支持
        else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
