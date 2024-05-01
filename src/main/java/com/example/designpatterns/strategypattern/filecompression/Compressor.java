package com.example.designpatterns.strategypattern.filecompression;
import java.util.List;

public class Compressor {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<String> fileList) {
        strategy.compressFiles(fileList);
    }

}
