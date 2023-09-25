package org.example;

import java.util.HashMap;
import java.util.Map;

public class EighthAlbumMain {
    public static void main(String[] args) {
        Map<Integer, String> PatrickVegee = new HashMap<>();
        PatrickVegee.put(1, "Hatch I need");
        PatrickVegee.put(2, "マーメイドスキャンダラス");
        PatrickVegee.put(3, "スロウカーブは打てない(that made me crazy)");
        PatrickVegee.put(4, "Catch up,latency");
        PatrickVegee.put(5, "摂食ビジランテ");
        PatrickVegee.put(6, "夏影テールライト");
        PatrickVegee.put(7, "Phantom Joke");
        PatrickVegee.put(8, "世界はファンシー");
        PatrickVegee.put(9, "弥生町ロンリープラネット");
        PatrickVegee.put(10, "春が来てぼくら");
        PatrickVegee.put(11, "Simple Simple Anecdote");
        PatrickVegee.put(12, "101回目のプロローグ");

        for(int i = 1; i < 13; i++)
            System.out.println(PatrickVegee.get(i));

        System.out.println(PatrickVegee.get(13));
    }
}