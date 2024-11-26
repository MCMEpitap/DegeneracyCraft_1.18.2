package net.epitap.degeneracycraft.integration.jei.test.test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class MultiBlockStructure {
    private final String name;
    private final String icon;
    private final String[][] pattern; // マルチブロックのパターン
    private final Map<String, String> mapping; // マッピング（文字とブロックの対応）

    public MultiBlockStructure(String name, String icon, String[][] pattern, Map<String, String> mapping) {
        this.name = name;
        this.icon = icon;
        this.pattern = pattern;
        this.mapping = mapping;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String[][] getPattern() {
        return pattern;
    }

    public Map<String, String> getMapping() {
        return mapping;
    }

    // JSONデータからMultiBlockStructureオブジェクトを作成するメソッド
    public static MultiBlockStructure fromJson(JsonObject json) {
        // 名前とアイコンを取得
        String name = json.get("name").getAsString();
        String icon = json.get("icon").getAsString();

        // パターンを取得
        JsonArray patternArray = json.getAsJsonArray("pattern");
        String[][] pattern = new String[patternArray.size()][];
        for (int i = 0; i < patternArray.size(); i++) {
            JsonArray layerArray = patternArray.get(i).getAsJsonArray();
            pattern[i] = new String[layerArray.size()];
            for (int j = 0; j < layerArray.size(); j++) {
                pattern[i][j] = layerArray.get(j).getAsString();
            }
        }

        // マッピングを取得
        JsonObject mappingObject = json.getAsJsonObject("mapping");
        Map<String, String> mapping = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : mappingObject.entrySet()) {
            mapping.put(entry.getKey(), entry.getValue().getAsString());
        }

        return new MultiBlockStructure(name, icon, pattern, mapping);
    }

    // 構造の検証メソッド（例）
    public boolean validate(World world, BlockPos position) {
        // ここでワールド内のブロック配置とパターンを比較するロジックを実装
        // このメソッドの実装はユーザーの仕様に応じて変更可能
        return true;
    }
}


