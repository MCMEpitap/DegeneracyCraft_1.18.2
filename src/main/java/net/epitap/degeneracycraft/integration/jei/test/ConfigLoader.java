package net.epitap.degeneracycraft.integration.jei.test;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static MultiblockConfig loadConfig(String filePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, MultiblockConfig.class);
        } catch (JsonSyntaxException | JsonIOException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
