//package net.epitap.degeneracycraft.integration.jei.test;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonSyntaxException;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//
//public class MultiblockStructureLoader {
//    public static List<List<List<String>>> loadStructure(String filePath) {
//        Gson gson = new Gson();
//        try (FileReader reader = new FileReader(filePath)) {
//            MultiblockStructureConfig config = gson.fromJson(reader, MultiblockStructureConfig.class);
//            return config.structure;
//        } catch (IOException | JsonSyntaxException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Failed to load multiblock structure configuration", e);
//        }
//    }
//}
