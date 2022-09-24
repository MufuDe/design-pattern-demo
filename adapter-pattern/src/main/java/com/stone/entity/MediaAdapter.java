package com.stone.entity;

/**
 * @author Jeff
 * <p>
 * 媒体播放适配器
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    private static final String MEDIA_VLC = "VLC";

    private static final String MEDIA_MP4 = "MP4";

    public MediaAdapter(String audioType) {
        // VLC类型适配
        if (MEDIA_VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        }

        // MP4类型适配
        else if (MEDIA_MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        // VLC类型适配
        if (MEDIA_VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        }

        // MP4类型适配
        else if (MEDIA_MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
