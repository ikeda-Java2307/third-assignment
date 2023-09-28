package org.example;

import java.util.HashMap;
import java.util.Map;

public class EighthAlbumMain {
    public static void main(String[] args) {
        Map<Integer, String> patrickVegee = new HashMap<>();
        patrickVegee.put(1, "Hatch I need");
        patrickVegee.put(2, "マーメイドスキャンダラス");
        patrickVegee.put(3, "スロウカーブは打てない(that made me crazy)");
        patrickVegee.put(4, "Catch up,latency");
        patrickVegee.put(5, "摂食ビジランテ");
        patrickVegee.put(6, "夏影テールライト");
        patrickVegee.put(7, "Phantom Joke");
        patrickVegee.put(8, "世界はファンシー");
        patrickVegee.put(9, "弥生町ロンリープラネット");
        patrickVegee.put(10, "春が来てぼくら");
        patrickVegee.put(11, "Simple Simple Anecdote");
        patrickVegee.put(12, "101回目のプロローグ");

        for (int i = 1; i < 14; i++) {
            try {
                if (patrickVegee.get(i) != null) {
                    System.out.println(patrickVegee.get(i));
                } else {
                    int n = patrickVegee.get(i).length();
                }
            } catch(NullPointerException e) {
                System.out.println("存在しない曲を選んでいます");
                System.out.println("再生を停止します");
            }
        }
    }
}
